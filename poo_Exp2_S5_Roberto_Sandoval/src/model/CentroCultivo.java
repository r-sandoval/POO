package model;

public class CentroCultivo {

    private String nombre;
    private String comuna;
    //Relación de composicion
    private RegistroProduccion produccion;

    // Constructor recibe los datos y usa el de toneladas para crear la composición
    public CentroCultivo(String nombre, String comuna, double toneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.produccion = new RegistroProduccion(toneladas);
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public double getToneladasProducidas() {
        return this.produccion.getCantidadToneladas();
    }

    public void setToneladasProducidas(double toneladas) {
        this.produccion.setCantidadToneladas(toneladas);
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    // Método toString
    @Override
    public String toString() {
        return "CentroCultivo [Nombre: " + nombre + " | Comuna: " + comuna + " | Producción: " + produccion + "]";
    }
}