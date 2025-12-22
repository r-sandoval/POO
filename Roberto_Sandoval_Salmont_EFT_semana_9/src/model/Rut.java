package model;

// Importamos excepción
import exceptions.RutInvalidoException;

public class Rut {
    private int numero;
    private char dv;


    public Rut(int numero, char dv) throws RutInvalidoException {
        // Validar que el número sea positivo
        if (numero <= 0) {
            throw new RutInvalidoException("El número de RUT debe ser mayor a cero.");
        }

        //Validar que el dígito verificador sea válido
        char dvMayus = Character.toUpperCase(dv);
        if (!(Character.isDigit(dvMayus) || dvMayus == 'K')) {
            throw new RutInvalidoException("El dígito verificador '" + dv + "' no es válido.");
        }

        this.numero = numero;
        this.dv = dvMayus;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = Character.toUpperCase(dv);
    }

    // Método toString para representar el objeto como texto
    @Override
    public String toString() {
        return numero + "-" + dv;
    }
}