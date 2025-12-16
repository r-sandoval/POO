package model;

public class CentroCultivo extends UnidadOperativa implements Registrable {

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

    @Override
    public String mostrarInformacion() {
        return "CENTRO DE CULTIVO: " + getNombre() +
                " | Ubicación: " + getComuna() +
                " | Producción total: " + getToneladasProducidas() + "t";
    }

    @Override
    public String mostrarResumen() {
        return "--- Entidad: CENTRO DE CULTIVO ---\n" +
                "Ubicación: " + getComuna() +
                " | Nombre: " + getNombre() +
                " | Producción: " + getToneladasProducidas() + "t";

    }
}