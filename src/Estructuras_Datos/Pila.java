package Estructuras_Datos;
import Cancion.Cancion;
class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Pila<T> {
    private Nodo<T> cima;

    public Pila() {
        this.cima = null;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (isEmpty()) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.dato;
    }
    public boolean remover(T dato) {
        Nodo<T> anterior = null;
        Nodo<T> actual = cima;

        while (actual != null) {
            if (actual.dato.equals(dato)) {
                if (anterior == null) {
                    // El elemento a eliminar está en la cima de la pila
                    cima = actual.siguiente;
                } else {
                    // El elemento a eliminar está en el medio o al final de la pila
                    anterior.siguiente = actual.siguiente;
                }
                return true; // Elemento encontrado y eliminado
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false; // Elemento no encontrado
    }

    public void mostrarPila() {
        Nodo<T> actual = cima;
        while (actual != null) {
            if (actual.dato instanceof Cancion) {
                Cancion<String, String, Integer, Integer, Integer> cancion = (Cancion<String, String, Integer, Integer, Integer>) actual.dato;
                System.out.println("  ");
                System.out.println("Nombre de la canción: " + cancion.getNombre());
                System.out.println("Autor: " + cancion.getAutor());
                System.out.println("Tiempo de duración: " + cancion.getMinuto() + ":" + cancion.getSegundos());
                System.out.println("Ans de salida: " + cancion.getAns());
                System.out.println("  ");
            } else if (actual.dato instanceof Integer) {
                Integer entero = (Integer) actual.dato;
                System.out.println(entero);
            } else if (actual.dato instanceof String) {
                String cadena = (String) actual.dato;
                System.out.println(cadena);
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}