package tarea2;
import java.util.List;

class ReunionPresencial extends Reunion {
    private String sala;
    public ReunionPresencial(){}
    public List<Empleado> obtenerAsistencias(){return null;};
    public List<Empleado> obtenerAusencias(){return null;};
    public List<Empleado> obtenerRetrasos(){return null;};
    public int obtenerTotalAsistencia(){return 0;};
    public float obtenerPorcentajeAsistencia(){return 0;};
    public float calcularTiempoReal(){return 0;};
    public void iniciar(){};
    public void finalizar(){}; 
    public String getSala() {
        return sala;
    }
    public void crearNota(String contenido){
        Nota nuevaNota = new Nota(contenido);
        notas.add(nuevaNota);
    }
    public List<Nota> obtenerNotas(){
        return notas;
    }
}