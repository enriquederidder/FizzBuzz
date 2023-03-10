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
    @Test
    public void testFizzBuzzFor789() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.Comprobar(7);
        String result2 = fizzBuzz.Comprobar(8);
        String result3 = fizzBuzz.Comprobar(9);

        assertNull(result);
        assertNull(result2);
        assertEquals("Fizz", result3);

    }
    @Test
    public void testFizzBuzzFor10(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.Comprobar(10);
        assertEquals("Buzz", result);
    }
    @Test
    public void testFizzBuzzOnzeDoceTreceCatorce(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String once = fizzBuzz.Comprobar(11);
        String doce = fizzBuzz.Comprobar(12);
        String trece= fizzBuzz.Comprobar(13);

        assertNull(once);
        assertEquals("Fizz", doce);
        assertNull(trece);
    }
    @Test
    public void testFizzBuzzFor15(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.Comprobar(15);
        assertEquals("FizzBuzz", result);
    }
}