package model;

public class CentroCultivo extends UnidadOperativa {

    //Relación de composicion
    private RegistroProduccion produccion;

    // Constructor recibe los datos y usa el de toneladas para crear la composición
    public CentroCultivo(String nombre, String comuna, double toneladas) {
        super(nombre, comuna);
        this.produccion = new RegistroProduccion(toneladas);
    }

    public double getToneladasProducidas() {
        return this.produccion.getCantidadToneladas();
    }

    public void setToneladasProducidas(double toneladas) {
        this.produccion.setCantidadToneladas(toneladas);
    }

    // Método toString
    @Override
    public String toString() {
        return "CentroCultivo [Nombre: " + getNombre() + " | Comuna: " + getComuna() + " | Producción: " + produccion + "]";
    }
}