import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperTDDTest {
    @Test
    public void pruebaCadenaVacia() {
        int resultado = OperTDD.suma("");
        assertEquals(0, resultado);
    }
    @Test
    public void pruebaNumero1() {
        int resultado = OperTDD.suma("1");
        assertEquals(1, resultado);
    }
    @Test
    public void pruebaSuma1y2() {
        int resultado = OperTDD.suma("1,2");
        assertEquals(3, resultado);
    }
    @Test
    public void pruebaSumaUnoUnoyDos() {
        int resultado = OperTDD.suma("1,1,2");
        assertEquals(4, resultado);
    }
    @Test
    public void pruebaSumaVacio() {
        int resultado = OperTDD.suma("1,2,");
        assertEquals(-1, resultado);
    }
    @Test
    public void pruebaSumaNegativo() {
        int resultado = OperTDD.suma("1,2,-2");
        assertEquals(-1, resultado);
    }
}

