package tarea2;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
/**
 * Clase que representa una reunion presencial
 * @author Maria Jesus Olivares
 * @author Ariel Cisternas
 */

public class ReunionPresencial extends Reunion {
    private String sala;
    /**
     * Constructor de la clase
     * @param fecha fecha de la reunion
     * @param horaPrevista hora en la que se piensa empezar la reunion
     * @param sala lugar de la reunion
     */
    public ReunionPresencial(Date fecha, LocalTime horaPrevista, String sala){
        super(fecha, horaPrevista);
        this.sala = sala;
    }
    /**
     * metodo que retorna la ubicacion de la reunion
     * @return sala (lugar)
     */
    public String getSala() {
        return sala;
    }
    /**
     * metodo que retorna el tipo de reunion
     * @return presencial
     */
    public String getvirtualoPresencial(){
        return "presencial";
    }
    @Override
    public String toString() {
        return "Clase que representa una reunion Presencial";
    }
}