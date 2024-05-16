package tarea2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DepartamentoTest {
    private Departamento d;
    private Reunion r;
    @BeforeEach
    void setUp() {
        d = new Departamento("Departamento 1");
        r = new ReunionVirtual(null, null, null);
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Agregar empleado y obtener cantidad de empleados")
    public void testagregarEmpleado() {
        for (int i = 0; i < 10; i++) {
            d.agregarEmpleado("Empleado " + i, "Apellido " + i, " correo" + i + "@gmail.com ", "id " + i);
            assertNotNull(d.empleados.get(i));
            assertEquals(i+1, d.obtenerCantidadEmpleados());
        }
    }
    @Test
    @DisplayName("Invitar Departamento")
    public void testinvitarDepartamento() {
        d.invitar(d.empleados);
        assertNotNull(r.listaInvitados);
        assertEquals(d.obtenerCantidadEmpleados(),r.listaInvitados.size());
    }
}
