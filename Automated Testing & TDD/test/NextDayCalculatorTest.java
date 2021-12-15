import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing")
    public void testNextDayCalculator0() {
        int day = 1;
        int month = 1;
        int year = 2018;
        int neaxtDay = 2;
        int nextMonth = 1;
        int nextYear = 2018;

        int result1 = NextDayCalculator.getNextDay(day, month, year);
        int result2 = NextDayCalculator.nextMonth(day, month, nextYear);
        int result3 = NextDayCalculator.nextYear(day, month, year);
        assertEquals(neaxtDay, result1);
        assertEquals(nextMonth, result2);
        assertEquals(nextYear, result3);
    }

    @Test
    @DisplayName("Testing")
    public void testNextDayCalculator1() {
        int day = 31;
        int month = 1;
        int year = 2018;
        int neaxtDay = 1;
        int nextMonth = 2;
        int nextYear = 2018;

        int result1 = NextDayCalculator.getNextDay(day, month, year);
        int result2 = NextDayCalculator.nextMonth(day, month, nextYear);
        int result3 = NextDayCalculator.nextYear(day, month, year);
        assertEquals(neaxtDay, result1);
        assertEquals(nextMonth, result2);
        assertEquals(nextYear, result3);
    }

    @Test
    @DisplayName("Testing")
    public void testNextDayCalculator2() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int neaxtDay = 1;
        int nextMonth = 3;
        int nextYear = 2018;

        int result1 = NextDayCalculator.getNextDay(day, month, year);
        int result2 = NextDayCalculator.nextMonth(day, month, nextYear);
        int result3 = NextDayCalculator.nextYear(day, month, year);
        assertEquals(neaxtDay, result1);
        assertEquals(nextMonth, result2);
        assertEquals(nextYear, result3);
    }

    @Test
    @DisplayName("Testing")
    public void testNextDayCalculator3() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int neaxtDay = 1;
        int nextMonth = 1;
        int nextYear = 2019;

        int result1 = NextDayCalculator.getNextDay(day, month, year);
        int result2 = NextDayCalculator.nextMonth(day, month, nextYear);
        int result3 = NextDayCalculator.nextYear(day, month, year);
        assertEquals(neaxtDay, result1);
        assertEquals(nextMonth, result2);
        assertEquals(nextYear, result3);
    }
}
