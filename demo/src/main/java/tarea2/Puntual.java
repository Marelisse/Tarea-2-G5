package tarea2;

import java.util.List;

/**
 * Clase donde se registran a las personas que llegaron a tiempo a la reunion
 * @author Ariel Cisternas
 */

public class Puntual extends Asistencia {
    /**
     * Contructor de la clase donde se añaden a los empleados a dos listas
     * @param empleado empleado especifico 
     * @param reunion tipo de reunion
     */
    public Puntual(Empleado empleado, Reunion reunion){
        super(empleado,reunion);
        reunion.getNombresAsistentes().add(empleado.getNombre() + " " + empleado.getApellidos() + " (Puntual) ");
        reunion.getAsistencia().add(empleado);
    }
    @Override
    public String toString() {
        return "Clase que representa la puntualidad de los empleados";
    }
}
