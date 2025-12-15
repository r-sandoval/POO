package model;

public class PlantaProceso extends UnidadOperativa {

    private double capacidadProceso;

    //Constructor


    public PlantaProceso(String nombre, String comuna, double capacidadProceso) {
        //Llama al constructor de la superclase (unidadOperativa)
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
    public String toString() {
        return "PlantaProceso [Nombre: " + getNombre() +
                " | Comuna: " + getComuna() +
                " | Capacidad Proceso: " + capacidadProceso + "t]";
    }
}
