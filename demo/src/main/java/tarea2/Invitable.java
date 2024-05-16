package tarea2;

import java.util.List;
/**
 * Interface que hace invitable a un Departamento o Empleado individual
 * @author Maria Jesus Olivares
 */
interface Invitable {
    void invitar(List<Empleado> listaInvitados);
}
