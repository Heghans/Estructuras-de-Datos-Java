package Cancion;
public class Cancion<AT1, AT2, AT3, AT4, AT5> implements Comparable<Cancion<AT1, AT2, AT3, AT4, AT5>> {
    private AT1 nombre;
    private AT2 autor;
    private AT3 minuto;
    private AT4 ans;
    private AT5 segundos;

    public AT1 getNombre() {
        return nombre;
    }

    public AT2 getAutor() {
        return autor;
    }

    public AT3 getMinuto() {
        return minuto;
    }

    public AT4 getAns() {
        return ans;
    }

    public AT5 getSegundos() {
        return segundos;
    }

    public Cancion(AT1 nombre, AT2 autor, AT3 minuto, AT4 ans, AT5 segundos) {
        this.nombre = nombre;
        this.autor = autor;
        this.minuto = minuto;
        this.segundos = segundos;
        this.ans = ans;
    }

    // Implementación del método compareTo
    @Override
    public int compareTo(Cancion<AT1, AT2, AT3, AT4, AT5> otraCancion) {
        // Define aquí cómo deseas comparar las canciones en el árbol binario.
        // Puedes comparar por nombre, autor, duración, u otros criterios.

        // En este ejemplo, se compara por el nombre de la canción (orden lexicográfico).
        return this.nombre.toString().compareTo(otraCancion.nombre.toString());
    }

    public String toString() {
        return "\n" + "Canción: " + nombre + "\n" +
                "Autor: " + autor + "\n" +
                "Duración: " + minuto + " minutos " + segundos + " segundos\n" +
                "Ans de salida: " + ans;

    }
}
