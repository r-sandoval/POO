package data;

import model.CentroCultivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {

    public ArrayList<CentroCultivo> leerDatos() {

        ArrayList<CentroCultivo> listaCentros = new ArrayList<>();
        File archivo = new File("resources/centros.txt");

        try {
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();

                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] partes = linea.split(";");

                if (partes.length == 3) {

                    String nombre = partes[0].trim();
                    String comuna = partes[1].trim();

                    double toneladas = Double.parseDouble(partes[2].trim());

                    CentroCultivo centro = new CentroCultivo(nombre, comuna, toneladas);

                    listaCentros.add(centro);
                } else {
                    System.out.println("ADVERTENCIA: Línea ignorada por formato incorrecto: " + linea);
                }
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.err.println("ERROR FATAL: El archivo centros.txt no fue encontrado. Verifique la ruta y el nombre.");
        } catch (NumberFormatException e) {
            System.err.println("ERROR DE FORMATO: Uno de los datos de toneladas no es un número válido.");
        }

        return listaCentros;
    }
}