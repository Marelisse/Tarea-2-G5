package tarea2;

import java.util.ArrayList;
import java.util.List;

class Departamento implements Invitable {
    private String nombre;
    private List<Empleado> empleados;
    private int cantidadEmpleados;

    public Departamento(String nombre, Empleado empleado){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        cantidadEmpleados = 0;
    }
    public String nombreDepartamento(){
        return nombre;
    } 
    public int obtenerCantidadEmpleados(){
        return cantidadEmpleados;
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
        cantidadEmpleados++;
    }
    public void invitar(List<Empleado> listaInvitados){
        listaInvitados.addAll(empleados);
    }
}
