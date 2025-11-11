package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {
    public static void main(String[] args){
        System.out.println("---Prueba de clases del sistema salmontt---");


        Direccion dir1 = new Direccion("Los Pinos", "1234", "Puerto Montt");

        System.out.println("\n--- Objeto Direccion ---");
        System.out.println(dir1);


        Persona persona1 = new Persona("11.111.111-1", "Javier Muñoz", dir1);

        System.out.println("\n--- Objeto Base Persona ---");
        System.out.println(persona1);


        Direccion dir2 = new Direccion("Avenida Principal", "567", "Osorno");
        Empleado emp1 = new Empleado("9.876.543-2", "Ana Torres", dir2, "Jefe de Planta", 1250000.00);

        System.out.println("\n--- Objeto Heredado Empleado ---");
        System.out.println(emp1);
    }
}