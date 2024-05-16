package tarea2;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

public class ReunionVirtual extends Reunion {
    private String enlace;
    public ReunionVirtual(Date fecha, LocalTime horaPrevista, String enlace){
        super(fecha, horaPrevista);
        this.enlace = enlace;
    }
    public List<Empleado> obtenerAsistencias(){return null;};
    public List<Empleado> obtenerAusencias(){return null;};
    public List<Empleado> obtenerRetrasos(){return null;};
    public int obtenerTotalAsistencia(){return 0;};
    public float obtenerPorcentajeAsistencia(){return 0;};
    public float calcularTiempoReal(){return 0;};
    public void iniciar(){
        this.horaInicio = LocalTime.now();
    }
    public void finalizar(){
        this.horaFin = LocalTime.now();
    }
    public String getEnlace() {
        return enlace;
    }
    public void crearNota(String contenido){
        Nota nuevaNota = new Nota(contenido);
        notas.add(nuevaNota.getContenido());
    }
    public List<String> obtenerNotas(){
        return notas;
    }
    public Date getfecha(){
        return fecha;
    }
    public LocalTime gethoraPrevista(){
        return horaPrevista;
    }
    public LocalTime gethoraInicio(){
        return horaInicio;
    }
    public String getvirtualoPresencial(){
        return "virtual";
    }
}
