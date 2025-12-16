package model;

public class PlantaProceso extends UnidadOperativa implements Registrable {

    private double capacidadProceso;

    //Constructor
    public PlantaProceso(String nombre, String comuna, double capacidadProceso) {
        //Llama al constructor de la superclase unidadOperativa
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    //Getters
    public double getCapacidadProceso() {
        return capacidadProceso;
    }

    //Setters
    public void setCapacidadProceso(double capacidadProceso) {
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public String mostrarInformacion() { // <-- ¡NOMBRE CORREGIDO!
        return "PLANTA DE PROCESO: " + getNombre() +
                " | Ubicación: " + getComuna() +
                " | Capacidad máxima: " + capacidadProceso + "t";
    }

    @Override
    public String mostrarResumen() {
        // Utilizamos los getters existentes para mostrar la información clave.
        return "--- Entidad: PLANTA DE PROCESO ---\n" +
                "Ubicación: " + getComuna() +
                " | Nombre: " + getNombre() +
                " | Capacidad Máxima: " + getCapacidadProceso() + "t";
    }
}
