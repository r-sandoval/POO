Desarrollo Orientado a Objetos I
Autor: Roberto Sandoval 
Sección: 003A
Carrera: Analista programador

==========================================================================

Semana 7: Aplicando Polimorfismo y Colecciones Genéricas

En esta etapa, se extendió la jerarquía de clases existente para permitir la gestión dinámica de las unidades operativas de Salmontt. Se implementaron los conceptos de sobrescritura de métodos y se utilizó una colección genérica para demostrar el Polimorfismo.



Conceptos de POO Aplicados:

1.  Sobrescritura de Métodos:
    - Se creó el método obtenerResumenOperativo() en la clase padre UnidadOperativa.
    - Fue sobrescrito en las clases hijas CentroCultivo y PlantaProceso para mostrar información específica (producción o capacidad) de forma diferenciada.

2.  Colecciones Genéricas y Polimorfismo:
    - Se creó una lista de tipo ArrayList<UnidadOperativa> capaz de almacenar tanto objetos CentroCultivo como PlantaProceso.
    - Al recorrer esta única lista, la llamada a unidad.obtenerResumenOperativo() invoca automáticamente la versión correcta del método para cada tipo de objeto en tiempo de ejecución, demostrando el Polimorfismo.

Evidencia de Ejecución

La siguiente salida muestra que el bucle sobre la lista ArrayList<UnidadOperativa> llama correctamente al método de la clase hija CentroCultivo o PlantaProceso, mezclando sus resultados sin necesidad de comprobaciones de tipo if o instanceof.