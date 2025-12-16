package ui;

import data.GestorEntidades;
import model.PlantaProceso;
import model.Proveedor;
import model.Empleado;
import javax.swing.JOptionPane;

public class Main {

    private static final String TITULO_APP = "SalmonttApp - Gestión de Entidades";

    public static void main(String[] args) {
        GestorEntidades gestor = new GestorEntidades();
        String opcionStr;

        gestor.cargarCentrosCultivo();
        JOptionPane.showMessageDialog(null,
                ">>> Se cargaron los datos iniciales de Centros de Cultivo desde el archivo. <<<",
                TITULO_APP, JOptionPane.INFORMATION_MESSAGE);

        gestor.agregarRegistro(new PlantaProceso("Planta Aysén", "Puerto Aysén", 5000.0));
        gestor.agregarRegistro(new Proveedor("76.123.456-1", "Redes del Mar S.A.", "Equipos de Malla"));
        gestor.agregarRegistro(new Empleado("EMP-001", "María Soto", "Jefa de Producción"));

        do {
            opcionStr = JOptionPane.showInputDialog(null, mostrarMenuPrincipal(), TITULO_APP, JOptionPane.QUESTION_MESSAGE);

            if (opcionStr == null) {
                opcionStr = "0";
            }

            try {
                int opcion = Integer.parseInt(opcionStr.trim());

                switch (opcion) {
                    case 1:
                        subManejarCreacion(gestor);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                                gestor.listarEntidadesConDetalle(),
                                "2. Listado de Entidades (Polimorfismo)",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema. ¡Adiós!", TITULO_APP, JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.", TITULO_APP, JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                if (!opcionStr.equals("0")) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número.", TITULO_APP, JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (!opcionStr.equals("0"));
    }

    public static String mostrarMenuPrincipal() {
        return "--- Menú Principal ---\n"
                + "1. Registrar nueva entidad (Proveedor, Empleado, Planta de Proceso)\n"
                + "2. Listar todas las entidades registradas (Polimorfismo e instanceof)\n"
                + "0. Salir\n\n"
                + "Seleccione una opción:";
    }

    public static void subManejarCreacion(GestorEntidades gestor) {
        String opcionStr;
        do {
            String menuCreacion = "\n--- Sub-Menú Creación ---\n"
                    + "1. Crear nuevo Proveedor\n"
                    + "2. Crear nuevo Empleado\n"
                    + "3. Crear nueva Planta de Proceso\n"
                    + "0. Volver al Menú Principal\n\n"
                    + "Seleccione tipo a crear:";

            opcionStr = JOptionPane.showInputDialog(null, menuCreacion, "1. Registrar Entidad", JOptionPane.QUESTION_MESSAGE);

            if (opcionStr == null || opcionStr.trim().isEmpty()) {
                opcionStr = "0";
            }

            try {
                int opcionCreacion = Integer.parseInt(opcionStr.trim());

                switch (opcionCreacion) {
                    case 1:
                        crearProveedor(gestor);
                        break;
                    case 2:
                        crearEmpleado(gestor);
                        break;
                    case 3:
                        crearPlantaProceso(gestor);
                        break;
                    case 0:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.", TITULO_APP, JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                if (!opcionStr.equals("0")) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Ingrese un número.", TITULO_APP, JOptionPane.ERROR_MESSAGE);
                }
                opcionStr = "-1";
            }
        } while (!opcionStr.equals("0"));
    }

    public static void crearProveedor(GestorEntidades gestor) {
        String rut = JOptionPane.showInputDialog(null, "Ingrese RUT del proveedor:", "Registro de Proveedor", JOptionPane.QUESTION_MESSAGE);
        String nombreEmpresa = JOptionPane.showInputDialog(null, "Ingrese Nombre de la Empresa:", "Registro de Proveedor", JOptionPane.QUESTION_MESSAGE);
        String rubro = JOptionPane.showInputDialog(null, "Ingrese Rubro (e.g., Alimentos, Mallas):", "Registro de Proveedor", JOptionPane.QUESTION_MESSAGE);

        if (rut != null && nombreEmpresa != null && rubro != null) {
            Proveedor nuevoProveedor = new Proveedor(rut, nombreEmpresa, rubro);
            gestor.agregarRegistro(nuevoProveedor);
            JOptionPane.showMessageDialog(null,
                    "Proveedor registrado exitosamente:\n" + nuevoProveedor.mostrarResumen(),
                    "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void crearEmpleado(GestorEntidades gestor) {
        String codigo = JOptionPane.showInputDialog(null, "Ingrese Código Interno (e.g., EMP-002):", "Registro de Empleado", JOptionPane.QUESTION_MESSAGE);
        String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre completo:", "Registro de Empleado", JOptionPane.QUESTION_MESSAGE);
        String cargo = JOptionPane.showInputDialog(null, "Ingrese Cargo:", "Registro de Empleado", JOptionPane.QUESTION_MESSAGE);

        if (codigo != null && nombre != null && cargo != null) {
            Empleado nuevoEmpleado = new Empleado(codigo, nombre, cargo);
            gestor.agregarRegistro(nuevoEmpleado);
            JOptionPane.showMessageDialog(null,
                    "Empleado registrado exitosamente:\n" + nuevoEmpleado.mostrarResumen(),
                    "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void crearPlantaProceso(GestorEntidades gestor) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre de la Planta:", "Registro de Planta", JOptionPane.QUESTION_MESSAGE);
        String comuna = JOptionPane.showInputDialog(null, "Ingrese Comuna:", "Registro de Planta", JOptionPane.QUESTION_MESSAGE);
        String capacidadStr = JOptionPane.showInputDialog(null, "Ingrese Capacidad de Proceso (toneladas):", "Registro de Planta", JOptionPane.QUESTION_MESSAGE);

        if (nombre != null && comuna != null && capacidadStr != null) {
            try {
                double capacidad = Double.parseDouble(capacidadStr.trim());
                PlantaProceso nuevaPlanta = new PlantaProceso(nombre, comuna, capacidad);
                gestor.agregarRegistro(nuevaPlanta);
                JOptionPane.showMessageDialog(null,
                        "Planta de Proceso registrada exitosamente:\n" + nuevaPlanta.mostrarResumen(),
                        "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: La capacidad debe ser un número válido.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}