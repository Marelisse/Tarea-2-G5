package tarea2;

/**
 * Clase que genera notas de la reunion
 * @author Ariel Cisternas
 */

public class Nota {
    private String contenido;
    /**
     * Constructor de la clase
     * @param contenido lo que se quiere agregar como nota
     */
    public Nota(String contenido) {
        this.contenido = contenido;
    }
    /**
     * Metodo con el que se obtiene el contenido de la nota
     * @return string del contenido
     */
    public String getContenido() {
        return contenido;
    }
    @Override
    public String toString() {
        return "Clase que representa una nota con su contenido";
    }
}
