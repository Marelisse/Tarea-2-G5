package tarea2;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

public class ReunionVirtual extends Reunion {
    private String enlace;
    public ReunionVirtual(Date fecha, LocalTime horaPrevista, String enlace){
        super(fecha, horaPrevista);
        this.enlace = enlace;
    }
    public String getEnlace() {
        return enlace;
    }
    public String getvirtualoPresencial(){
        return "virtual";
    }
}
