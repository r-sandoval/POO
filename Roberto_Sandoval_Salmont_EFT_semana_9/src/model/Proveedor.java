package model;

import exceptions.DatoVacioException;
import exceptions.RutInvalidoException;

public class Proveedor extends Persona {

    private String rubro;

    //constructor
    public Proveedor(String nombre, Rut rut, String direccion, String rubro)
            throws DatoVacioException, RutInvalidoException {
        super(nombre, rut, direccion);
        this.rubro = rubro;
    }

    //Getters y setters
    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    //métodos
    @Override
    public String mostrarDatos() {
        return "PROVEEDOR -> Nombre: " + getNombre() +
                " | RUT: " + getRut().toString() +
                " | Dirección: " + getDireccion() +
                " | Rubro: " + rubro;
    }

    @Override
    public String mostrarBreve() {
        return "Proveedor: " + getNombre() + " (" + rubro + ")";
    }
}