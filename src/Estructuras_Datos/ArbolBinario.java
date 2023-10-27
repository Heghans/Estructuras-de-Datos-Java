package Estructuras_Datos;

public class ArbolBinario<T extends Comparable<T>> {
    private Nodo<T> raiz;

    private static class Nodo<T> {
        T dato;
        Nodo<T> izquierdo;
        Nodo<T> derecho;

        Nodo(T dato) {
            this.dato = dato;
            izquierdo = null;
            derecho = null;
        }
    }

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar un elemento en el árbol
    public void insertar(T dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo<T> insertarRec(Nodo<T> nodo, T dato) {
        if (nodo == null) {
            return new Nodo<>(dato);
        }

        if (dato.compareTo(nodo.dato) < 0) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, dato);
        } else if (dato.compareTo(nodo.dato) > 0) {
            nodo.derecho = insertarRec(nodo.derecho, dato);
        }

        return nodo;
    }

    // Eliminar un elemento del árbol
    public void eliminar(T dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private Nodo<T> eliminarRec(Nodo<T> nodo, T dato) {
        if (nodo == null) {
            return nodo;
        }

        if (dato.compareTo(nodo.dato) < 0) {
            nodo.izquierdo = eliminarRec(nodo.izquierdo, dato);
        } else if (dato.compareTo(nodo.dato) > 0) {
            nodo.derecho = eliminarRec(nodo.derecho, dato);
        } else {
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }

            nodo.dato = encontrarMinimo(nodo.derecho);
            nodo.derecho = eliminarRec(nodo.derecho, nodo.dato);
        }

        return nodo;
    }

    private T encontrarMinimo(Nodo<T> nodo) {
        T minimo = nodo.dato;
        while (nodo.izquierdo != null) {
            minimo = nodo.izquierdo.dato;
            nodo = nodo.izquierdo;
        }
        return minimo;
    }

    // Mostrar el contenido del árbol en orden
    public void mostrarContenido() {
        inorden(raiz);
    }

    private void inorden(Nodo<T> nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.println(nodo.dato);
            inorden(nodo.derecho);
        }
    }
}