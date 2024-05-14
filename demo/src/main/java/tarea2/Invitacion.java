package tarea2;
import java.time.Instant;

public class Invitacion {
    private Instant hora;
    private Invitable invitado;
    public Invitacion(Invitable invitado, Instant hora){
        this.invitado = invitado;
        this.hora = hora;
    }
    public Invitable getInvitado(){
        return invitado;
    }
    public Instant getHora(){
        return hora;
    }
}
