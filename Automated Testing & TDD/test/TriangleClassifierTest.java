import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void test1() {
        double first = 2;
        double second = 2;
        double third = 2;
        String expected = "tam giác đều";

        String result = TriangleClassifier.trianglesClassification(first, second, third);
        assertEquals(expected, result);
    }

    @Test
    void test2() {
        double first = 2;
        double second = 2;
        double third = 3;
        String expected = "tam giác cân";

        String result = TriangleClassifier.trianglesClassification(first, second, third);
        assertEquals(expected, result);
    }

    @Test
    void test3() {
        double first = 3;
        double second = 4;
        double third = 5;
        String expected = "tam giác vuông";

        String result = TriangleClassifier.trianglesClassification(first, second, third);
        assertEquals(expected, result);
    }

    @Test
    void test4() {
        double first = 3;
        double second = 5;
        double third = 6;
        String expected = "tam giác thường";

        String result = TriangleClassifier.trianglesClassification(first, second, third);
        assertEquals(expected, result);
    }

    @Test
    void test5() {
        double first = -1;
        double second = 2;
        double third = 1;
        String expected = "không phải là tam giác";

        String result = TriangleClassifier.trianglesClassification(first, second, third);
        assertEquals(expected, result);
    }
}
