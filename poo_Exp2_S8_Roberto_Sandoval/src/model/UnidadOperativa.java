package model;

public class UnidadOperativa {

    private String nombre;
    private String comuna;

    //Constructor de la superclase
    public UnidadOperativa (String nombre, String comuna){
        this.nombre = nombre;
        this.comuna = comuna;
    }

    //Metodo para overriding
    public String mostrarInformacion() {
        return "Unidad Operativa " + this.nombre + " - Ubicada en " + this.comuna + ".";
    }

    //Getters
    public String getNombre() { return nombre; }
    public String getComuna() { return comuna; }

    //Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setComuna(String comuna) { this.comuna = comuna; }



}
