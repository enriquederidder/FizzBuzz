import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    public void Devuelve0(){
        OperacionesTDD oper = new OperacionesTDD();

        String suma = oper.calc("");
        String suma2 = oper.calc("1");

        assertEquals("0", suma);
        assertEquals("1", suma2);
    }

}