package model;


public class Empleado implements Registrable {

    private String codigoInterno;
    private String nombre;
    private String cargo;

    // Constructor
    public Empleado(String codigoInterno, String nombre, String cargo) {
        this.codigoInterno = codigoInterno;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Getters
    public String getCodigoInterno() { return codigoInterno; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }


    @Override
    public String mostrarResumen() {
        return "--- Entidad: EMPLEADO (Colaborador Interno) ---\n" +
                "Código: " + this.codigoInterno + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Cargo: " + this.cargo;
    }
}