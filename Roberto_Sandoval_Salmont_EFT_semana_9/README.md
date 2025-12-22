Desarrollo Orientado a Objetos I
Autor: Roberto Sandoval 
Sección: 003A
Carrera: Analista programador

==========================================================================

EFT: Sistema de Gestión Salmontt S.A.

Descripción
Prototipo en Java para la gestión de Empleados, Clientes y Proveedores utilizando Programación Orientada a Objetos. El sistema aplica herencia, interfaces y manejo de excepciones personalizadas para asegurar la calidad de los datos.

Estructura de Paquetes
app: Clase Main (ejecución y lógica de búsqueda).

model: Entidades de negocio (Persona, Empleado, Rut, etc.) e Interfaz Registrable.

exceptions: Excepciones DatoVacioException y RutInvalidoException.

utils: Lector de archivos .txt.

data: Archivos de datos externos.

Funcionalidades Clave
Carga Automática: Lectura de datos desde .txt para instanciar objetos.

Polimorfismo: Gestión de diversas entidades en un único ArrayList<Persona>.

Validación: Control de errores en RUT y campos obligatorios mediante try-catch.

Búsqueda: Filtrado de la colección por número de RUT.

Instrucciones de Uso
Verificar que el archivo src/data/datos.txt contenga los datos de prueba.

Ejecutar Main.java desde el paquete app.

El sistema mostrará el reporte general y un ejemplo de búsqueda exitosa.