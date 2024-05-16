package tarea2;

import java.util.List;

public class Puntual extends Asistencia {
    public Puntual(Empleado empleado, Reunion reunion){
        super(empleado,reunion);
        reunion.getNombresAsistentes().add(empleado.getNombre() + " " + empleado.getApellidos() + " (Puntual) ");
        reunion.getAsistencia().add(empleado);
    }
}
