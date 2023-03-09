import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void testFizzBuzzFor1y2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.Comprobar(1);
        String result2 = fizzBuzz.Comprobar(2);

        assertNull(result);
        assertNull(result2);
    }
    @Test
    public void testFizzBuzzFor3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.Comprobar(3);
        assertEquals("Fizz", result);
    }
    @Test
    public void testFizzBuzzFor4y5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.Comprobar(4);
        String result2 = fizzBuzz.Comprobar(5);

        assertNull(result);
        assertEquals("Buzz", result2);
    }
    @Test
    public void testFizzBuzzFor6(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.Comprobar(6);
        assertEquals("Fizz", result);
    }

}