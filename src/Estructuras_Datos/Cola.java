package Estructuras_Datos;

import Cancion.Cancion;

import java.util.LinkedList;

public class Cola<T> {
    private LinkedList<T> elementos;

    public Cola() {
        elementos = new LinkedList<>();
    }

    // Insertar un elemento al final de la cola (enqueue)
    public void enqueue(T elemento) {
        elementos.addLast(elemento);
    }

    // Eliminar y devolver el elemento al principio de la cola (dequeue)
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        return elementos.removeFirst();
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    // Mostrar el contenido de la cola
    public void mostrarContenido() {
        for (T elemento : elementos) {
            if (elemento instanceof Cancion) {
                Cancion<String, String, Integer, Integer, Integer> cancion = (Cancion<String, String, Integer, Integer, Integer>) elemento;
                System.out.println("  ");
                System.out.println("Nombre de la canción: " + cancion.getNombre());
                System.out.println("Autor: " + cancion.getAutor());
                System.out.println("Tiempo de duración: " + cancion.getMinuto() + ":" + cancion.getSegundos());
                System.out.println("Ans de salida: " + cancion.getAns());
                System.out.println("  ");
            } else if (elemento instanceof Integer) {
                System.out.println("Entero: " + elemento);
            } else if (elemento instanceof String) {
                System.out.println("Cadena: " + elemento);
            }
        }
    }
}