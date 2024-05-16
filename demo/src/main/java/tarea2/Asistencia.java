package tarea2;
public abstract class Asistencia {
    protected Empleado empleado;
    protected Reunion reunion;
    public Asistencia(Empleado empleado, Reunion reunion){
        this.empleado = empleado;
        this.reunion = reunion;
    }
}