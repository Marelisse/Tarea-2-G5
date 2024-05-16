package tarea2;

import java.util.List;

/**
 * Clase Empleado (persona)
 * @author Maria Jesus Olivares
 */

class Empleado implements Invitable{
    private String id;
    private String apellidos;
    private String nombre;
    private String correo;
    /**
     * Constructor de la clase, donde se inicializan las caracteristicas de este
     * @param nombre nombre empleado    
     * @param apellidos apellidos del empleado
     * @param correo correo del empleado
     * @param id id del empleado
     */
    public Empleado(String nombre, String apellidos, String correo, String id){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.id = id;
    }
    /**
     * Metodo para obtener el Id del empleado
     * @return string Id
     */
    public String getId(){
        return id;
    }
    /**
     * Metodo para obtener el nombre del empleado
     * @return string nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Metodo para obtener los apellidos del empleado
     * @return string apellidos
     */
    public String getApellidos(){
        return apellidos;
    }
    /**
     * Metodo con el cual se puede invitar a un empleado especifico (se añade a una lista)
     */
    public void invitar(List<Empleado> listaInvitados){
        listaInvitados.add(this);
    }
    @Override
    public String toString() {
        return "Clase que representa a un empleado, el cual tiene nombre, apellidos, correo e id";
    }
}
