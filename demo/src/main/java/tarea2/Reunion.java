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
    protected List<String> nombresInvitados;
    protected List<String> nombresAsistentes;
    protected List<String> nombresRetrasos;

    public Reunion(Date fecha, LocalTime horaPrevista){
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        notas = new ArrayList<String>();
        listaInvitados = new ArrayList<Empleado>();
        nombresAsistentes = new ArrayList<String>();
        nombresRetrasos = new ArrayList<String>();
    }
    public List<Empleado> obtenerAsistencias(){
        return null;
    }
    public List<Empleado> obtenerAusencias(){
        return null;
    }
    public List<Empleado> obtenerRetrasos(){
        return null;
    }
    public int obtenerTotalAsistencia(){
        return 0;
    }
    public float obtenerPorcentajeAsistencia(){
        return 0;
    }
    public LocalTime calcularTiempoReal(){
        return horaFin.minusHours(horaInicio.getHour()).minusMinutes(horaInicio.getMinute()).minusSeconds(horaInicio.getSecond());
    }
    public void iniciar(){
        this.horaInicio = LocalTime.now();
    }
    public void finalizar(){
        this.horaFin = LocalTime.now();
    }
    public void crearNota(String contenido){
        Nota nuevaNota = new Nota(contenido);
        notas.add(nuevaNota.getContenido());
    } 
    public List<String> getNotas(){
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
    public List<String> getNombresAsistentes(){
        return nombresAsistentes;
    }
    public List<String> getNombresRetrasos(){
        return nombresRetrasos;
    }
    public abstract String getvirtualoPresencial();
}
