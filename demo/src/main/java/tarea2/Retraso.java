package tarea2;
import java.time.LocalTime;


class Retraso extends Asistencia {
    private LocalTime hora;
    public Retraso(){
        this.hora = LocalTime.now();
    }
    public LocalTime obtenerHoraRetr(){
        return hora;
    }
}