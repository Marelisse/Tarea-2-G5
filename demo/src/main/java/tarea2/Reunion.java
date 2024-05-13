package tarea2;
import java.sql.Date;
import java.time.Instant;
import java.util.List;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Instant horaInicio;
    private Instant horaFin;
    protected List<Nota> notas;

    public Reunion(){}
    public abstract List<Empleado> obtenerAsistencias();
    public abstract List<Empleado> obtenerAusencias();
    public abstract List<Empleado> obtenerRetrasos();
    public abstract int obtenerTotalAsistencia();
    public abstract float obtenerPorcentajeAsistencia();
    public abstract float calcularTiempoReal();
    public abstract void iniciar();
    public abstract void finalizar();
    public abstract void crearNota(String contenido); 
    public abstract List<Nota> obtenerNotas();
}
