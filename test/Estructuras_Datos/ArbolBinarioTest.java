package Estructuras_Datos;
import Cancion.Cancion;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicBorders;

import static org.junit.jupiter.api.Assertions.*;

class ArbolBinarioTest {
    @Test
    void testcancion(){

                // Crear un árbol binario de canciones
                ArbolBinario<Cancion<String, String, Integer, Integer, Integer>> arbolDeCanciones = new ArbolBinario<>();

                // Insertar canciones en el árbol
        Cancion<String, String, Integer, Integer, Integer> c1 = new Cancion<>("MONACO", "Bad Bunny", 4, 2022, 30);
        Cancion<String, String, Integer, Integer, Integer> c2 = new Cancion<>("Falling in Love with You", "Elvis Presley", 3, 1974, 45);
        Cancion<String, String, Integer, Integer, Integer> c3 = new Cancion<>("Here With Me", "d4vd", 3, 2022, 42 );
        Cancion<String, String, Integer, Integer, Integer> c4 = new Cancion<>("Propuesta Indecente", "Romeo Santos", 3, 2007,15 );
        Cancion<String, String, Integer, Integer, Integer> c5 = new Cancion<>("Don't Cry", "Gun's and Roses", 3, 1994, 50);
        Cancion<String, String, Integer, Integer, Integer> c6 = new Cancion<>("Master of Puppets", "Metallica", 4, 1989, 32);

                arbolDeCanciones.insertar(c1);
                arbolDeCanciones.insertar(c2);
                arbolDeCanciones.insertar(c3);
                arbolDeCanciones.insertar(c4);
                arbolDeCanciones.insertar(c5);
                arbolDeCanciones.insertar(c6);

                // Mostrar el contenido del árbol en orden
                System.out.println("  ");
                System.out.println("Contenido del árbol en orden:");
                arbolDeCanciones.mostrarContenido();

                // Eliminar una canción
                arbolDeCanciones.eliminar(c3);

                // Mostrar el contenido del árbol nuevamente
                System.out.println("\nContenido del árbol después de eliminar una canción:");
                arbolDeCanciones.mostrarContenido();
            }
            @Test
    void testInt(){
        ArbolBinario<Integer> arbolInt = new ArbolBinario<>();
                arbolInt.insertar(3);
                arbolInt.insertar(82);
                arbolInt.insertar(72);
                arbolInt.insertar(1);
                arbolInt.insertar(54);
                arbolInt.insertar(22);

                // Mostrar el contenido del árbol en orden
                System.out.println("  ");
                System.out.println("Contenido del árbol en orden:");
                arbolInt.mostrarContenido();

                // Eliminar una canción
                arbolInt.eliminar(54);

                // Mostrar el contenido del árbol nuevamente
                System.out.println("Contenido del árbol después de eliminar un entero:");
                arbolInt.mostrarContenido();

            }
            @Test
            void teststring(){
                ArbolBinario<String> arbolString = new ArbolBinario<>();
                arbolString.insertar("Arbol");
                arbolString.insertar("Santa Claus");
                arbolString.insertar("Creeper");
                arbolString.insertar("Batman");
                arbolString.insertar("Redbull");


                // Mostrar el contenido del árbol en orden
                System.out.println("  ");
                System.out.println("Contenido del árbol en orden:");
                arbolString.mostrarContenido();

                // Eliminar una canción
                arbolString.eliminar("Batman");

                // Mostrar el contenido del árbol nuevamente
                System.out.println(" ");
                System.out.println("Contenido del árbol después de eliminar un String:");
                arbolString.mostrarContenido();
            }
        }
