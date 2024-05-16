package tarea2;
import java.sql.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Reunion {
    protected Date fecha;
    protected LocalTime horaPrevista;
    protected LocalTime horaInicio;
    protected LocalTime horaFin;
    protected List<String> notas;
    protected List<Empleado> listaInvitados;

    public Reunion(Date fecha, LocalTime horaPrevista){
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        notas = new ArrayList<String>();
        listaInvitados = new ArrayList<Empleado>();
    }
    public abstract List<Empleado> obtenerAsistencias();
    public abstract List<Empleado> obtenerAusencias();
    public abstract List<Empleado> obtenerRetrasos();
    public abstract int obtenerTotalAsistencia();
    public abstract float obtenerPorcentajeAsistencia();
    public abstract float calcularTiempoReal();
    public abstract void iniciar();
    public abstract void finalizar();
    public abstract void crearNota(String contenido); 
    public abstract List<String> obtenerNotas();
    public abstract Date getfecha();
    public abstract LocalTime gethoraPrevista();
    public abstract LocalTime gethoraInicio();
    public abstract String getvirtualoPresencial();
}
