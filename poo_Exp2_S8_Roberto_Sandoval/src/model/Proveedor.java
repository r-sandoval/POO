package model;


public class Proveedor implements Registrable {

    private String rut;
    private String nombreEmpresa;
    private String rubro;

    // Constructor
    public Proveedor(String rut, String nombreEmpresa, String rubro) {
        this.rut = rut;
        this.nombreEmpresa = nombreEmpresa;
        this.rubro = rubro;
    }

    public String getRut() { return rut; }
    public String getNombreEmpresa() { return nombreEmpresa; }
    public String getRubro() { return rubro; }


    @Override
    public String mostrarResumen() {
        return "--- Entidad: PROVEEDOR ---\n" +
                "RUT: " + this.rut + "\n" +
                "Empresa: " + this.nombreEmpresa + "\n" +
                "Rubro: " + this.rubro;
    }
}