package tarea2;
import java.time.LocalTime;
import java.util.List;

class Retraso extends Asistencia {
    private LocalTime hora;
    public Retraso(Empleado empleado,Reunion reunion, LocalTime hora){
        super(empleado,reunion);
        this.hora = LocalTime.now();
        reunion.getNombresRetrasos().add(empleado.getNombre() + " " + empleado.getApellidos() + " (Retraso: " + hora.toString() + ") ");
        reunion.getAsistencia().add(empleado);
    }
    public LocalTime obtenerHoraRetr(){
        return hora;
    }
}