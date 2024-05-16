package tarea2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
    private Empleado e;
    private Reunion r;
    @BeforeEach
    void setUp() {
        e = new Empleado("Juan", "Perez","Juan@correo.com ","123");
        r = new ReunionVirtual(null, null, null);
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Invitar")
    void testInvitar() {
        e.invitar(r.listaInvitados);
        assertNotNull(r.listaInvitados);
    }
}
