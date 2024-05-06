package tarea2;

import java.util.List;

class Empleado implements Invitable{
    private String id;
    private String apellidos;
    private String nombre;
    private String correo;

    public Empleado(String nombre, String apellidos, String correo, String id){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void invitar(List<Empleado> listaInvitados){
        listaInvitados.add(this);
    }
}
