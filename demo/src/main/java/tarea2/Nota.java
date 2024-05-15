package tarea2;

public class Nota {
    private String contenido;
    public Nota(String contenido) {
        this.contenido = contenido;
    }
    public Nota transformarNota(){
        return new Nota(contenido);
    }
    public Nota getContenido() {
        Nota nota = transformarNota();
        return nota;
    }
    @Override
    public String toString() {
        return "Nota: "+getContenido();
    }
}
