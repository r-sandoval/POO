package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.Proveedor;
import model.Empleado;
import model.Registrable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorEntidades {

    private List<Registrable> registros;

    public GestorEntidades() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(Registrable entidad) {
        this.registros.add(entidad);
    }

    public List<Registrable> getRegistros() {
        return registros;
    }

    public void cargarCentrosCultivo() {

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

                    this.agregarRegistro(centro);
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
    }

    public String listarEntidadesConDetalle() {
        if (registros.isEmpty()) {
            return "No hay entidades registradas en el sistema.";
        }

        StringBuilder sb = new StringBuilder("--- DETALLE DE ENTIDADES REGISTRADAS ---\n");
        sb.append("Total de registros: ").append(registros.size()).append("\n\n");

        for (Registrable entidad : registros) {

            if (entidad instanceof CentroCultivo) {
                CentroCultivo cc = (CentroCultivo) entidad;
                sb.append("[CULTIVO] Nombre: ").append(cc.getNombre())
                        .append(" | Producción: ").append(cc.getToneladasProducidas()).append("t")
                        .append(" | Resumen: ").append(entidad.mostrarResumen()).append("\n");

            } else if (entidad instanceof PlantaProceso) {
                PlantaProceso pp = (PlantaProceso) entidad;
                sb.append("[PROCESO] Nombre: ").append(pp.getNombre())
                        .append(" | Capacidad: ").append(pp.getCapacidadProceso()).append("t")
                        .append(" | Resumen: ").append(entidad.mostrarResumen()).append("\n");

            } else if (entidad instanceof Proveedor) {
                Proveedor p = (Proveedor) entidad;
                sb.append("[PROVEEDOR] Empresa: ").append(p.getNombreEmpresa())
                        .append(" | Rubro: ").append(p.getRubro())
                        .append(" | Resumen: ").append(entidad.mostrarResumen()).append("\n");

            } else if (entidad instanceof Empleado) {
                Empleado e = (Empleado) entidad;
                sb.append("[EMPLEADO] Nombre: ").append(e.getNombre())
                        .append(" | Cargo: ").append(e.getCargo())
                        .append(" | Resumen: ").append(entidad.mostrarResumen()).append("\n");

            } else {
                sb.append("[DESCONOCIDO] Resumen: ").append(entidad.mostrarResumen()).append("\n");
            }
        }
        return sb.toString();
    }
}