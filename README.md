# Programacion

Ejercicio Vehiculos:
Se va a implementar un simulador de Vehículos. Existen dos tipos de Vehículo: Coche y Camión.

Sus características comunes son la matrícula y la velocidad. En el momento de crearlos, la matrícula se recibe por parámetro y la velocidad se inicializa a 0. El método toString() de los vehículos devuelve información acerca de la matrícula y la velocidad. Además se pueden acelerar, pasando por parámetro la cantidad en km/h que se tiene que acelerar.
Los coches tienen además un atributo para el número de puertas, que se recibe también por parámetro en el momento de crearlo. Tiene además un método que devuelve el número de puertas.
Los camiones tienen un atributo de tipo Remolque que inicializa a null (para indicar que no tiene un remolque). Además, tiene un método ponRemolque(), que recibe el Remolque por parámetro, y otro quitaRemolque(). Cuando se muestre la información de un camión que lleve remolque, además de la matrícula y velocidad del camión, debe aparecer la información del remolque.
En esta clase, hay que sobreescribir el método acelerar de manera que si el camión tiene remolque y la velocidad más la aceleración superan los 100 km/h, se lance una excepción de tipo DemasiadoRapidoException.
Hay que implementar la clase Remolque. Esta clase tiene un atributo de tipo entero que es el peso y cuyo valor se le da en el momento de crear el objeto. Debe tener un método toString() que devuelva la información del remolque.
Implementar la clase DemasiadoRapidoException.


Ayudas y planteamiento

Se va a implementar una clase Vehículo que sirve de superclase para Coche y Camión. Un Remolque no es un Vehículo, así que se implementaría sin heredar de Vehículo.
En esta clase Vehículo, se declara e implementa la parte común entre Coche y Camión, es decir:
Los atributos matrícula y velocidad.
El constructor que inicializa los dos atributos.
El método acelerar().
El método toString().
En Coche se añade el atributo numeroPuertas y el método para devolverlo. En el constructor se llama al constructor de la superclase.
En Camión se añade el atributo remolque, de tipo Remolque y los métodos para poner y quitar el remolque, además de sobreescribir el método toString() para mostrar la información del remolque.
Al sobreescribir el método acelerar() se lanza una excepción de tipo DemasiadoRapidoException que hay que indicar en la cabecera mediante una cláusula throws. Java no permite, en un método que sobreescribe a otro, lanzar una excepción que no se está lanzando en el método sobreescrito. Por este motivo, en el método acelerar() de Vehículo hay que indicar en la cláusula throws que se pueden lanzar este tipo de excepciones.
La clase Remolque no hereda de Vehículo. La clase Camión tiene una relación de composición con Remolque.
