package model;
/**
 * Representa a un Empleado de Salmontt
 * Extiende de Persona (Herencia)
 */
public class Empleado extends Persona {
    /** El cargo del empleado en la empresa */
    private String cargo;
    /** El sueldo mensual del empleado */
    private double sueldo;

    // Constructor de Empleado
    public Empleado(String rut, String nombre, Direccion direccion, String cargo, double sueldo) {
        super(rut, nombre, direccion);

        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    //Getters y setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    @Override
    public String toString() {
        // LLAMAMOS al toString de Persona para obtener la info heredada.
        return super.toString() + "\n" +
                "| Datos de Empleado: |" +
                "\nCargo: " + cargo +
                "\nSueldo: $" + sueldo;
    }
}
