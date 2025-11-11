package model;
/**
 * Clase base que representa a una Persona en el sistema Salmontt
 * Demuestra Encapsulamiento y Composición
 */
public class Persona {
    //Encapsulamiento
    private String rut;
    private String nombre;

    //Composicion
    private Direccion direccion;

    //Constructor
    /**
     * Constructor para crear una nueva instancia de Persona
     * @param rut El RUT de la persona
     * @param nombre El nombre completo de la persona
     * @param direccion El objeto Direccion asociado a la persona
     */
    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    //ToString
    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
