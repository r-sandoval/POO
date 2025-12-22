package model;

import exceptions.DatoVacioException;
import exceptions.RutInvalidoException;

public class Cliente extends Persona {

    private String tipoCliente;

    //constructor
    public Cliente(String nombre, Rut rut, String direccion, String tipoCliente)
            throws DatoVacioException, RutInvalidoException {
        super(nombre, rut, direccion);
        this.tipoCliente = tipoCliente;
    }

    //Getters y setters
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String mostrarDatos() {
        return "CLIENTE -> Nombre: " + getNombre() +
                " | RUT: " + getRut().toString() +
                " | Dirección: " + getDireccion() +
                " | Tipo: " + tipoCliente;
    }

    @Override
    public String mostrarBreve() {
        return "Cliente: " + getNombre() + " (" + tipoCliente + ")";
    }
}