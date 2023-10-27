package Estructuras_Datos;
import Cancion.Cancion;
import org.junit.jupiter.api.Test;

class PilaTest {
    @Test
    void test(){
        Pila<Cancion<String, String, Integer, Integer, Integer>> pilaDeCanciones = new Pila<>();

        Cancion<String, String, Integer, Integer, Integer> c1 = new Cancion<>("MONACO", "Bad Bunny", 4, 2022, 30);
        Cancion<String, String, Integer, Integer, Integer> c2 = new Cancion<>("Falling in Love with You", "Elvis Presley", 3, 1974, 45);
        Cancion<String, String, Integer, Integer, Integer> c3 = new Cancion<>("Here With Me", "d4vd", 3, 2022, 42 );
        Cancion<String, String, Integer, Integer, Integer> c4 = new Cancion<>("Propuesta Indecente", "Romeo Santos", 3, 2007,15 );
        Cancion<String, String, Integer, Integer, Integer> c5 = new Cancion<>("Don't Cry", "Gun's and Roses", 3, 1994, 50);
        Cancion<String, String, Integer, Integer, Integer> c6 = new Cancion<>("Master of Puppets", "Metallica", 4, 1989, 32);
        pilaDeCanciones.push(c1);
        pilaDeCanciones.push(c2);
        pilaDeCanciones.push(c3);
        pilaDeCanciones.push(c4);
        pilaDeCanciones.push(c5);
        pilaDeCanciones.push(c6);

        System.out.println("Elementos en la pila de canciones: ");
        pilaDeCanciones.mostrarPila();

        System.out.println("Elemento en la cima de la pila de canciones: " + pilaDeCanciones.peek().getNombre());
        System.out.println(" ");

        pilaDeCanciones.remover(c3);
        System.out.println("Sera extraido un elemento:");
        pilaDeCanciones.mostrarPila();
    }
@Test
    void testint(){
        Pila<Integer> PilaInt = new Pila<>();
        PilaInt.push(100);
        PilaInt.push(23);
        PilaInt.push(66);
        PilaInt.push(10);

        System.out.println("Elementos en la pila de enteros: ");
        PilaInt.mostrarPila();

        System.out.println(" ");
        System.out.println("Elemento en la cima de la pila de enteros: " + PilaInt.peek());
        System.out.println(" ");

        PilaInt.remover(23);
        System.out.println("Sera extraido un elemento:");
        PilaInt.mostrarPila();
    }

    @Test
    void teststring(){

        Pila<String> PilaString = new Pila<>();
        System.out.println(" ");
        PilaString.push("Cs:Go 2");
        PilaString.push("God of War");
        PilaString.push("Halo");
        PilaString.push("Albion Online");

        System.out.println("Elementos en la pila de Strings: ");
        PilaString.mostrarPila();

        System.out.println("Elemento en la cima de la pila de Strings: " + PilaString.peek());
        System.out.println(" ");

        System.out.println("Sera extraido un elemento:");
        PilaString.remover("God of War");
        PilaString.mostrarPila();
    }
}