package model;

import exceptions.DatoVacioException;
import exceptions.RutInvalidoException;

public abstract class Persona implements Registrable {

    private String nombre;
    private Rut rut;
    private String direccion;

    // Constructor lanza dos tipos de excepciones
    public Persona(String nombre, Rut rut, String direccion) throws DatoVacioException, RutInvalidoException {

        //Valida que el nombre no sea nulo ni esté en blanco
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatoVacioException("Error: El nombre es obligatorio y no puede estar vacío.");
        }

        //Valida dirección
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new DatoVacioException("Error: La dirección es obligatoria.");
        }

        //Valida que el objeto Rut existe
        if (rut == null) {
            throw new DatoVacioException("Error: El objeto RUT no puede ser nulo.");
        }

        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}