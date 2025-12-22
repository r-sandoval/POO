package model;

import exceptions.DatoVacioException;
import exceptions.RutInvalidoException;

public class Empleado extends Persona {

    private String cargo;
    private String departamento;


    public Empleado(String nombre, Rut rut, String direccion, String cargo, String departamento)
            throws DatoVacioException, RutInvalidoException {
        super(nombre, rut, direccion);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    // Getters y setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Metodos
    @Override
    public String mostrarDatos() {
        return "EMPLEADO -> Nombre: " + getNombre() +
                " | RUT: " + getRut().toString() +
                " | Dirección: " + getDireccion() +
                " | Cargo: " + cargo +
                " | Depto: " + departamento;
    }

    @Override
    public String mostrarBreve() {
        return "Empleado: " + getNombre() + " (" + cargo + ")";
    }
}