package tarea2;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Departamento, sector donde puede pertenecer un empleado
 * @author Maria Jesus Olivares
 */
class Departamento implements Invitable {
    private String nombre;
    protected List<Empleado> empleados;
    private int cantidadEmpleados;

    /**
     * Constructor de la clase
     * @param nombre nombre del departamento
     */
    public Departamento(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        cantidadEmpleados = 0;
    }
    /**
     * Metodo para obtener el nombre del departamento
     * @return string nombre del departamento
     */
    public String nombreDepartamento(){
        return nombre;
    } 
    /**
     * Metodo para obtener la cantidad de empleados en un departamento
     * @return int cantidad de empleados
     */
    public int obtenerCantidadEmpleados(){
        return cantidadEmpleados;
    }
    /**
     * Metodo para agregar empleados al Departamento
     * @param nombre nombre empleado    
     * @param apellidos apellidos del empleado
     * @param correo correo del empleado
     * @param id id del empleado
     */
    public void agregarEmpleado(String nombre, String apellidos, String correo, String id){
        Empleado empleado = new Empleado(nombre, apellidos, correo, id);
        empleados.add(empleado);
        cantidadEmpleados++;
    }
    /**
     * Metodo que agrega a todos los empleados de un Departamento a una lista de Invitados
     */
    public void invitar(List<Empleado> listaInvitados){
        listaInvitados.addAll(empleados);
    }
    /**Descripcion de la clase en el metodo toString */
    @Override
    public String toString() {
        return "Clase que representa un Departamento al que pertenecen los empleados";
    }
}
