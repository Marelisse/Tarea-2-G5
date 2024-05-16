package tarea2;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

/**
 * Clase que representa una reunion virtual
 * @author Maria Jesus Olivares
 * @author Ariel Cisternas
 */

public class ReunionVirtual extends Reunion {
    private String enlace;
    public ReunionVirtual(Date fecha, LocalTime horaPrevista, String enlace){
        super(fecha, horaPrevista);
        this.enlace = enlace;
    }
    /**
     * metodo para obtener el enlace de la reunion
     * @return enlace
     */
    public String getEnlace() {
        return enlace;
    }
    public String getvirtualoPresencial(){
        return "virtual";
    }
    @Override
    public String toString() {
        return "Clase que representa una reunion Virtual";
    }
}
