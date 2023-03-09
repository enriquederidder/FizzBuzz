import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void testFizzBuzzFor1y2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.Comprobar(1);
        String result2 = fizzBuzz.Comprobar(2);

        assertEquals("1 o 2", result);
        assertEquals("1 o 2", result2);
    }
}