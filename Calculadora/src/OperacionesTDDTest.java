import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    public void Devuelve0y1(){
        OperacionesTDD oper = new OperacionesTDD();

        String suma = oper.calc("");
        String suma2 = oper.calc("1");

        assertEquals("0", suma);
        assertEquals("1", suma2);
    }

    @Test
    public void Devuelve3y4(){
        OperacionesTDD oper = new OperacionesTDD();

        int suma = oper.calc(1,2);
        int suma2 = oper.calc(1,1,2);

        assertEquals(3, suma);
        assertEquals(4, suma2);
    }

}