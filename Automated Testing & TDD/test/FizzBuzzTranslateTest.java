import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    void test1() {
        int number = -1;
        String expected = ""+number;
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void test2() {
        int number = 4;
        String expected = ""+number;
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        int number = 6;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void test4() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void test5() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, result);
    }

}