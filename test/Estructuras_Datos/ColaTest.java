package Estructuras_Datos;

import Cancion.Cancion;

import org.junit.jupiter.api.Test;

class ColaTest {
    @Test

    void test(){
        // Creacion de la cola
        Cola<Cancion<String, String, Integer, Integer, Integer>> colaDeCancion = new Cola<>();

        // Creacion de los obejos canciones con sus atributos definidos
        Cancion<String, String, Integer, Integer, Integer> c1 = new Cancion<>("MONACO", "Bad Bunny", 4, 2022, 30);
        Cancion<String, String, Integer, Integer, Integer> c2 = new Cancion<>("Falling in Love with You", "Elvis Presley", 3, 1974, 45);
        Cancion<String, String, Integer, Integer, Integer> c3 = new Cancion<>("Here With Me", "d4vd", 3, 2022, 42 );
        Cancion<String, String, Integer, Integer, Integer> c4 = new Cancion<>("Propuesta Indecente", "Romeo Santos", 3, 2007,15 );
        Cancion<String, String, Integer, Integer, Integer> c5 = new Cancion<>("Don't Cry", "Gun's and Roses", 3, 1991, 50);
        Cancion<String, String, Integer, Integer, Integer> c6 = new Cancion<>("Master of Puppets", "Metallica", 4, 1989, 32);

        // Uso de la funcion enqueue para el insertado de las canciones en la cola. */
        colaDeCancion.enqueue(c1);
        colaDeCancion.enqueue(c2);
        colaDeCancion.enqueue(c3);
        colaDeCancion.enqueue(c4);
        colaDeCancion.enqueue(c5);
        colaDeCancion.enqueue(c6);

        // Mostrar el contenido de la Cola
        System.out.println("Contenido de la Cola: ");
        colaDeCancion.mostrarContenido();

        // Mostrar el elemento a salir de la Cola, mediante el Dequeue
        System.out.println("Elemento de la Cola en Dequeue: " + colaDeCancion.dequeue().getNombre());
        System.out.println(" ");

        // Mostrar la Cola de canciones actualizada
        System.out.print("Contenido de la Cola despues del Dequeue: ");
        colaDeCancion.mostrarContenido();
    }
    @Test
    void testInt(){
        // Creacion de la cola
        Cola<Integer> ColaInt = new Cola<>();
        
        // Uso de la funcion enqueue para el insertado de las canciones en la cola. */
        ColaInt.enqueue(10);
        ColaInt.enqueue(17);
        ColaInt.enqueue(7);
        ColaInt.enqueue(45);
        ColaInt.enqueue(23);

        System.out.println("Contenido de la Cola: ");
        ColaInt.mostrarContenido();

        // Mostrar el elemento a salir de la Cola, mediante el Dequeue
        System.out.println("Elemento de la Cola en Dequeue: " + ColaInt.dequeue());
        System.out.println(" ");

        // Mostrar la Cola de enteros actualizada
        System.out.println("Contenido de la Cola despues del Dequeue: ");
        ColaInt.mostrarContenido();
        System.out.println(" ");
    }
    @Test
    void teststring(){
        // Creacion de la cola
        Cola<String> ColaString = new Cola<>();
        
        // Uso de la funcion enqueue para el insertado de las canciones en la cola. */
        ColaString.enqueue("Pollo");
        ColaString.enqueue("Pajaro");
        ColaString.enqueue("Negro");
        ColaString.enqueue("Unicornio");
        ColaString.enqueue("Targaryen");

        // Mostrar el elemento a salir de la Cola, mediante el Dequeue
        System.out.println("Contenido de la Cola: ");
        ColaString.mostrarContenido();

        System.out.println("Elemento de la Cola en Dequeue: " + ColaString.dequeue());
        System.out.println(" ");

        // Mostrar la Cola de enteros actualizada
        System.out.println("Contenido de la Cola despues del Dequeue: ");
        ColaString.mostrarContenido();
        System.out.println(" ");
    }
}
