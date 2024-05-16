package tarea2;
/**
 * Clase Abstracta que registra las asistencias
 * @author Ariel Cisternas
 */
public abstract class Asistencia {
    protected Empleado empleado;
    protected Reunion reunion;
    public Asistencia(Empleado empleado, Reunion reunion){
        this.empleado = empleado;
        this.reunion = reunion;
    }
}