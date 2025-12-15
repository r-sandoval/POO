package model;

public class RegistroProduccion {

    private double cantidadToneladas;
    private final String unidadMedida = "t"; // La unidad es constante

    // Constructor que recibe la cantidad
    public RegistroProduccion(double cantidadToneladas) {
        this.cantidadToneladas = cantidadToneladas;
    }

    // ======= Getters ========
    public double getCantidadToneladas() { return cantidadToneladas; }

    public String getUnidadMedida() { return unidadMedida; }

    // ======== Setters ========
    public void setCantidadToneladas(double cantidadToneladas) {
        this.cantidadToneladas = cantidadToneladas;
    }

    // toString
    @Override
    public String toString() {
        return cantidadToneladas + unidadMedida;
    }
}