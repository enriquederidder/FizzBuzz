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
}
