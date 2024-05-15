package tarea2;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ReunionTest {
    private Reunion reunionVirtual;
    private Reunion reunionPresencial;
    @BeforeEach
    void setUp() {
        reunionVirtual = new ReunionVirtual(null, null, null);
        reunionPresencial = new ReunionPresencial(null, null, null);
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Obtener asistencias")
    public void testObtenerAsistencias() {
    }
    @Test
    @DisplayName("Obtener ausencias")
    public void testObtenerAusencias() {
    }
    @Test
    @DisplayName("Obtener retrasos")
    public void testObtenerRetrasos() {
    }
    @Test
    @DisplayName("Obtener total asistencia")
    public void testObtenerTotalAsistencia() {
    }
    @Test
    @DisplayName("Obtener porcentaje asistencia")
    public void testObtenerPorcentajeAsistencia() {
    }
    @Test
    @DisplayName("Calcular tiempo real")
    public void testCalcularTiempoReal() {
    }
    @Test
    @DisplayName("Iniciar")
    public void testIniciar() {
    }
    @Test
    @DisplayName("Finalizar")
    public void testFinalizar() {
    }
    @Test
    @DisplayName("Crear lista de notas y obtenerlas")
    public void testCrearNotasyObtenerlas() {
        String[] contenidoV = new String[10];
        String[] contenidoP = new String[10];
        for (int i = 0; i < 10; i++) {
            contenidoV[i] = "Nota Virtual " + i;
            contenidoP[i] = "Nota Presencial " + i;
            reunionVirtual.crearNota(contenidoV[i]);
            reunionPresencial.crearNota(contenidoP[i]);
            assertEquals(contenidoV[i], reunionVirtual.obtenerNotas().get(i));
            assertEquals(contenidoP[i], reunionPresencial.obtenerNotas().get(i));
        }
    }
}