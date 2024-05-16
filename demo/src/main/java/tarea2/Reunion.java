package tarea2;
import java.sql.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase abtracta que representa ambos tipos de reuniones y contine la mayoría de metodos
 * @author Maria Jesus Olivares
 * @author Ariel Cisternas
 */

public abstract class Reunion {
    protected Date fecha;
    protected LocalTime horaPrevista;
    protected LocalTime horaInicio;
    protected LocalTime horaFin;
    protected List<String> notas;
    protected List<Empleado> listaInvitados;
    protected List<Empleado> listaAsistentes;
    protected List<Empleado> listaAusentes;
    protected List<String> nombresInvitados;
    protected List<String> nombresAsistentes;
    protected List<String> nombresRetrasos;
    protected List<String> nombresAusentes;

    /**
     * Constructor de la clase que pide la fecha y hora de la reunion
     * @param fecha dia, mes, año de la reunion
     * @param horaPrevista hora en la que se espera empezar la reunion
     */
    public Reunion(Date fecha, LocalTime horaPrevista){
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        notas = new ArrayList<String>();
        listaInvitados = new ArrayList<Empleado>();
        listaAusentes = new ArrayList<Empleado>();
        listaAsistentes = new ArrayList<Empleado>();
        nombresAsistentes = new ArrayList<String>();
        nombresRetrasos = new ArrayList<String>();
        nombresAusentes = new ArrayList<String>();
    }
    /**
     * Metodo donde se registran los empleados ausentes
     * @return lista de empleados ausentes
     */
    public List<Empleado> obtenerAusencias(){
        for (int i = 0; i < listaInvitados.size();i++){
            if (listaAsistentes.contains(listaInvitados.get(i)) == false && listaAusentes.contains(listaInvitados.get(i)) == false){
                listaAusentes.add(listaInvitados.get(i));
            }
        }
        return listaAusentes;
    }
    /**
     * metodo que retorna el largo de la lista de asistentes
     * @return int del total de asistentes
     */
    public int obtenerTotalAsistencia(){
        return nombresAsistentes.size();
    }
    /**
     * metodo que retorna el porcentaje de asistencia a la reunion
     * @return float del porcentaje de asistentes
     */
    public float obtenerPorcentajeAsistencia(){
        return (listaAsistentes.size()*100)/listaInvitados.size();
    }
    /**
     * metodo que calcula el tiempo de la reunion
     * @return el total de tiempo de la reunion
     */
    public LocalTime calcularTiempoReal(){
        return horaFin.minusHours(horaInicio.getHour()).minusMinutes(horaInicio.getMinute()).minusSeconds(horaInicio.getSecond());
    }
    /**
     * Metodo que inicia la reunion en tiempo real
     */
    public void iniciar(){
        this.horaInicio = LocalTime.now();
    }
    /**
     * Metodo que finaliza la reunion en tiempo real
     */
    public void finalizar(){
        this.horaFin = LocalTime.now();
    }
    /**
     * metodo que crea una nota y la añade a una lista donde se contienen todas las notas de la reunion
     * @param contenido contenido de la nota
     */
    public void crearNota(String contenido){
        Nota nuevaNota = new Nota(contenido);
        notas.add(nuevaNota.getContenido());
    } 
    /**
     * metodo que retorna el contenido de las notas
     * @return notas(contenido)
     */
    public List<String> getNotas(){
        return notas;
    }
    /**
     * metodo que retorna la fecha de la reunion
     * @return Date fecha de la reunion
     */
    public Date getfecha(){
        return fecha;
    }
    /**
     * metodo que retorna la hora prevista de la reunion
     * @return LocalTime hora prevista de la reunion
     */
    public LocalTime gethoraPrevista(){
        return horaPrevista;
    }
    /**
     * metodo que retorna la hora de inicio real de la reunion
     * @return LocalTime hora de inicio
     */
    public LocalTime gethoraInicio(){
        return horaInicio;
    }
    /**
     * metodo que retorna la lista de los empleados asistentes
     * @return lista de asistentes
     */
    public List<Empleado> getAsistencia(){
        return listaAsistentes;
    }
    /**
     * metodo que retorna la lista de los nombres de los asistentes
     * @return nombres de asistentes
     */
    public List<String> getNombresAsistentes(){
        return nombresAsistentes;
    }
    /**
     * metodo que retorna el nombre de los empelados atrasados
     * @return nombres de los empleados atrasados
     */
    public List<String> getNombresRetrasos(){
        return nombresRetrasos;
    }
    /**
     * metodo que retorna el nombre de las personas ausentes
     * @return empleados ausentes
     */
    public List<String> getNombresAusentes(){
        for (int i = 0; i < listaAusentes.size(); i++){
            nombresAusentes.add(listaAusentes.get(i).getNombre() + " " + listaAusentes.get(i).getApellidos());
        }
        return nombresAusentes;
    }
    /**
     * metodo abstracto que se define en las subclases
     * @return string si es virtual o presencial
     */
    public abstract String getvirtualoPresencial();
}
