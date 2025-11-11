package model;
/**
 * Representa la dirección física de una persona
 */
public class Direccion {

    //Atributos privados (encapsulados)
    private String calle;
    private String numero;
    private String comuna;

    //Constructor
    /**
     * Constructor para crear una nueva instancia de Direccion.
     * @param calle El nombre de la calle
     * @param numero El número de la casa o departamento
     * @param comuna La comuna donde se ubica
     */
    public Direccion(String calle, String numero, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
    }

    //Getters y Setters
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    //toString
    /**
     * Proporciona una representación en cadena del objeto Direccion
     * @return Una cadena que contiene la calle, número y comuna
     */
    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
