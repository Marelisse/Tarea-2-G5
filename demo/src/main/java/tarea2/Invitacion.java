package tarea2;
import java.time.LocalTime;

/**
 * Clase donde se crea una invitacion
 * @author Ariel Cisternas
 */

public class Invitacion {
    private LocalTime hora;
    private Invitable invitado;
    /**
     * Constructor de la clase
     * @param invitado Departamento o Empleado
     * @param hora Hora de la reunion
     */
    public Invitacion(Invitable invitado, LocalTime hora){
        this.invitado = invitado;
        this.hora = hora;
    }
    /**
     * Metodo para obtener a los invitados
     * @return invitable invitado
     */
    public Invitable getInvitado(){
        return invitado;
    }
    /**
     * Metodo que retorna la hora de la reunion 
     * @return LocalTime de la reunion
     */
    public LocalTime getHora(){
        return hora;
    }
    @Override
    public String toString() {
        return "Clase que representa una invitacion a un empleado/departamento";
    }
}
