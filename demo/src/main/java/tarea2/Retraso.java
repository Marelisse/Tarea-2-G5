package tarea2;
import java.time.Instant;


class Retraso extends Asistencia {
    private Instant hora;
    public Retraso(){
        this.hora = Instant.now();
    }
    public Instant obtenerHoraRetr(){
        return hora;
    }
}