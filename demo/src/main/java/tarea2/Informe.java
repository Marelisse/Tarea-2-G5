package tarea2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.Instant;

public class Informe {
    private String reunion;
    public Informe(String reunion, Date fecha, String enlaceOSala, Instant horaPrev){
        File archivo = new File("Informe.txt");

        try(BufferedWriter datosReunion = new BufferedWriter(new FileWriter(archivo))){
            if(reunion == "virtual"){
                ReunionVirtual rv = new ReunionVirtual(fecha, horaPrev, enlaceOSala);
                datosReunion.write("Resumen de la Reunion");
                datosReunion.write("Fecha y hora estipulada: "+ rv.obtenerFecha() + "a las" + rv.obtenerHoraPrev());
                datosReunion.write("Enlace: "+ rv.getEnlace());
                datosReunion.write("Lista de participantes : " + rv.obtenerTotalAsistencia());
                datosReunion.write("Notas: "+ rv.obtenerNotas());
            }else if(reunion == "presencial"){
                ReunionPresencial rp = new ReunionPresencial(fecha, horaPrev, enlaceOSala);
                datosReunion.write("Resumen de la Reunion");
                datosReunion.write("Fecha y hora estipulada: "+ rp.obtenerFecha() + "a las" + rp.obtenerHoraPrev());
                datosReunion.write("Sala: "+ rp.getSala());
                datosReunion.write("Lista de participantes : " + rp.obtenerTotalAsistencia());
                datosReunion.write("Notas: "+ rp.obtenerNotas());
            }
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
