package app;

import model.*;
import utils.LectorArchivos;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleadosCargados = LectorArchivos.cargarEmpleados("src/data/datos.txt");
        ArrayList<Persona> listaSalmontt = new ArrayList<>(empleadosCargados);

        System.out.println("======= REPORTE DE ENTIDADES CARGADAS =======");
        if (listaSalmontt.isEmpty()) {
            System.out.println("No se encontraron datos en el archivo.");
        } else {
            for (Persona p : listaSalmontt) {
                System.out.println(p.mostrarDatos());
            }
        }

        System.out.println("\n======= BÚSQUEDA DE PERSONAL =======");
        int rutBuscado = 12345678;
        boolean hallado = false;

        for (Persona p : listaSalmontt) {
            if (p.getRut().getNumero() == rutBuscado) {
                System.out.println("Resultado de búsqueda: " + p.mostrarBreve());
                hallado = true;
                break;
            }
        }

        if (!hallado) {
            System.out.println("No se encontró ningún registro con el RUT: " + rutBuscado);
        }
    }
}