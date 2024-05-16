package tarea2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalTime;

public class Informe {
    private String reunion;
    public Informe(Reunion r, Date fecha, String enlaceOSala, LocalTime horaPrev){
        File archivo = new File("Informe.txt");

        try(BufferedWriter datosReunion = new BufferedWriter(new FileWriter(archivo))){
            datosReunion.write("Resumen de la Reunion \n");
            datosReunion.write("Fecha y hora estipulada: "+ r.getfecha() + " a las " + r.gethoraPrevista() + "\n");
            if (r.getvirtualoPresencial() == "virtual") {
                datosReunion.write("Enlace: " + enlaceOSala + "\n");
            }
            else if (r.getvirtualoPresencial() == "presencial"){
                datosReunion.write("Sala: " + enlaceOSala + "\n");
            }
            datosReunion.write("Lista de participantes : " + r.obtenerTotalAsistencia() + "\n");
            datosReunion.write("Notas: "+ r.obtenerNotas() + "\n");
        }catch(IOException e){
            System.err.println("Error al escribir en el archivo" + e.getMessage());
        }
        //fecha y hora
        //hora de inicio, fin y duración
        //enlace o sala
        //lista de participantes
        //notas
    }
}
