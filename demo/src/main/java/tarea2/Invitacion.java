package tarea2;
import java.time.LocalTime;

public class Invitacion {
    private LocalTime hora;
    private Invitable invitado;
    public Invitacion(Invitable invitado, LocalTime hora){
        this.invitado = invitado;
        this.hora = hora;
    }
    public Invitable getInvitado(){
        return invitado;
    }
    public LocalTime getHora(){
        return hora;
    }
}
