package tarea2;
import java.time.LocalTime;
import java.util.List;

/**
 * Clase que registra los retrasos de los empleados, y su asistencia a la reunion
 * @author Ariel Cisternas
 */

class Retraso extends Asistencia {
    private LocalTime hora;
    /**
     * Constructor de la clase, donde se añaden los empleados a dos listas
     * @param empleado empleado individual
     * @param reunion tipo de reunion
     * @param hora hora de atraso
     */
    public Retraso(Empleado empleado,Reunion reunion, LocalTime hora){
        super(empleado,reunion);
        this.hora = LocalTime.now();
        reunion.getNombresRetrasos().add(empleado.getNombre() + " " + empleado.getApellidos() + " (Retraso: " + hora.toString() + ") ");
        reunion.getAsistencia().add(empleado);
    }
    /**
     * Metodo para obtener a que hora ingresa el empleado atrasado
     * @return hora de ingreso (atraso)
     */
    public LocalTime obtenerHoraRetr(){
        return hora;
    }
    @Override
    public String toString() {
        return "Clase que representa la impuntualidad de los empleados";
    }
}