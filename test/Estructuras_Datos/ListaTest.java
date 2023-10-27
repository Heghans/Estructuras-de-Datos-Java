package Estructuras_Datos;
import Cancion.Cancion;
import org.junit.jupiter.api.Test;

class ListaTest {
    @Test
    void testcancion() {
        // Crear una lista enlazada de canciones
        ListaEnlazada<Cancion<String, String, Integer, Integer, Integer>> listaDeCanciones = new ListaEnlazada<>();

        // Insertar canciones en la lista
        Cancion<String, String, Integer, Integer, Integer> c1 = new Cancion<>("MONACO", "Bad Bunny", 4, 2022, 30);
        Cancion<String, String, Integer, Integer, Integer> c2 = new Cancion<>("Falling in Love with You", "Elvis Presley", 3, 1974, 45);
        Cancion<String, String, Integer, Integer, Integer> c3 = new Cancion<>("Here With Me", "d4vd", 3, 2022, 42 );
        Cancion<String, String, Integer, Integer, Integer> c4 = new Cancion<>("Propuesta Indecente", "Romeo Santos", 3, 2007,15 );
        Cancion<String, String, Integer, Integer, Integer> c5 = new Cancion<>("Don't Cry", "Gun's and Roses", 3, 1994, 50);
        Cancion<String, String, Integer, Integer, Integer> c6 = new Cancion<>("Enter Sadman", "Metallica", 4, 1989, 32);

        listaDeCanciones.insertar(c1);
        listaDeCanciones.insertar(c2);
        listaDeCanciones.insertar(c3);
        listaDeCanciones.insertar(c4);
        listaDeCanciones.insertar(c5);
        listaDeCanciones.insertar(c6);

        // Mostrar el contenido de la lista enlazada
        System.out.println("Contenido de la lista de canciones:");
        listaDeCanciones.mostrar();

        // Eliminar una canción de la lista
        listaDeCanciones.eliminar(c1);

        // Mostrar el contenido de la lista después de eliminar una canción
        System.out.println("\nContenido de la lista de canciones después de eliminar:");
        listaDeCanciones.mostrar();
    }
    @Test
    void testint() {
        ListaEnlazada<Integer> listaInt = new ListaEnlazada<>();
        listaInt.insertar(42);
        listaInt.insertar(11);
        listaInt.insertar(90);
        listaInt.insertar(5);
        listaInt.insertar(78);

        // Mostrar el contenido de la lista enlazada
        System.out.println("Contenido de la lista de enteros:");
        listaInt.mostrar();

        // Eliminar una canción de la lista
        listaInt.eliminar(78);

        // Mostrar el contenido de la lista después de eliminar una canción
        System.out.println("\nContenido de la lista de entero después de eliminar:");
        listaInt.mostrar();
    }

    @Test
    void teststring(){

        ListaEnlazada<String> listaString = new ListaEnlazada<>();
        System.out.println(" ");
        listaString.insertar("Antier");
        listaString.insertar("Jueves");
        listaString.insertar("Scroll");
        listaString.insertar("Python");
        listaString.insertar("Guitarra");

        // Mostrar el contenido de la lista enlazada
        System.out.println("Contenido de la lista de Strings:");
        listaString.mostrar();

        // Eliminar una canción de la lista
        listaString.eliminar("Scroll");

        // Mostrar el contenido de la lista después de eliminar una canción
        System.out.println("\nContenido de la lista de Strings después de eliminar:");
        listaString.mostrar();
    }
}