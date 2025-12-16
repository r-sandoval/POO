package ui;

import data.GestorDatos;
import model.CentroCultivo;
import java.util.ArrayList;
import model.PlantaProceso;
import model.UnidadOperativa;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();

        ArrayList<CentroCultivo> listaCentros = gestor.leerDatos();

        System.out.println("=================================================");
        System.out.println("           SISTEMA DE GESTIÓN SALMONTT           ");
        System.out.println("=================================================");

        System.out.println("\n--- 1. MOSTRANDO TODOS LOS CENTROS DE CULTIVO (" + listaCentros.size() + " TOTALES) ---\n");

        for (CentroCultivo centro : listaCentros) {
            System.out.println(centro);
        }

        System.out.println("\n--- 2. FILTRANDO CENTROS CON PRODUCCIÓN MAYOR A 1200.0 TONELADAS ---\n");
        double umbral = 1200.0;
        int contador = 0;

        for (CentroCultivo centro : listaCentros) {
            //Se aplica la condición de filtrado
            if (centro.getToneladasProducidas() > umbral) {
                System.out.println(centro);
                contador++;
            }
        }

        System.out.println("\nRESULTADO DEL FILTRO: Se encontraron " + contador + " centros con más de " + umbral + " toneladas.");
        System.out.println("=================================================");



        System.out.println("\n--- 3. CREANDO INSTANCIA DE PRUEBA: PlantaProceso ---\n");


        PlantaProceso planta1 = new PlantaProceso("Planta Quellon", "Quellon", 5500.0);

        System.out.println(planta1);
        System.out.println("  -> Verificación de método heredado: " + planta1.getNombre() + " está en " + planta1.getComuna());
        System.out.println("  -> Capacidad específica: " + planta1.getCapacidadProceso() + " toneladas.");
        System.out.println("\n=================================================");


        //Polimorfismo
        System.out.println("\n--- 4.1. COLECCIÓN POLIMÓRFICA CREADA: Unidades Operativas ---\n");
        ArrayList<UnidadOperativa> unidadOperativas = new ArrayList<>();

        CentroCultivo centro1 = listaCentros.get(0);

        PlantaProceso planta2 = new PlantaProceso("Planta Del Frio", "Punta Arenas", 4000.0);
        CentroCultivo centro2 = new CentroCultivo("Acuicola Sur 3", "Chonchi", 850.5);
        PlantaProceso planta3 = new PlantaProceso("Planta Oceánica", "Quellon", 7200.0);

        unidadOperativas.add(centro1);
        unidadOperativas.add(planta1);
        unidadOperativas.add(planta2);
        unidadOperativas.add(centro2);
        unidadOperativas.add(planta3);

        //Realiza recorrido
        for (UnidadOperativa unidad : unidadOperativas){
            System.out.println(unidad.mostrarInformacion());
        }

        System.out.println("\n=================================================");

    }
}