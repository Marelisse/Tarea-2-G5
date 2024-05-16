package tarea2;
import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

public class ReunionPresencial extends Reunion {
    private String sala;
    public ReunionPresencial(Date fecha, LocalTime horaPrevista, String sala){
        super(fecha, horaPrevista);
        this.sala = sala;
    }
    public float calcularTiempoReal(){return 0;}
    public String getSala() {
        return sala;
    }
    public String getvirtualoPresencial(){
        return "presencial";
    }
}