package Estructuras_Datos;
import Cancion.Cancion;

class nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class ListaEnlazada<T> {
    private Nodo<T> cabeza;

    public void insertar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public void eliminar(T dato) {
        if (cabeza == null) {
            return;
        }
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(dato)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void mostrar() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
