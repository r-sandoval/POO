package utils;

import model.*;
import exceptions.*;
import java.io.*;
import java.util.ArrayList;

public class LectorArchivos {

    public static ArrayList<Empleado> cargarEmpleados(String ruta) {
        ArrayList<Empleado> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");


                String nombre = datos[0];
                int numRut = Integer.parseInt(datos[1]);
                char dv = datos[2].charAt(0);
                String direccion = datos[3];
                String cargo = datos[4];
                String depto = datos[5];


                Rut rutObj = new Rut(numRut, dv);
                Empleado nuevoEmp = new Empleado(nombre, rutObj, direccion, cargo, depto);

                lista.add(nuevoEmp);
            }
        } catch (IOException | RutInvalidoException | DatoVacioException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
        return lista;
    }
}