package functions.src.test.java;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.Test;

public class NumberOperationsTest {

    @Test
    public void testMin() throws FileNotFoundException {
        String filename = "functions/src/test/resources/tests/test1.txt";
        int expectedMin = 1; 
        int actualMin = NumberOperations._min(filename);
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testMax() {
        String filename = "functions/src/test/resources/tests/test1.txt";
        int expectedMax = 1000000;
        int actualMax = NumberOperations._max(filename);
        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testSum() {
        String filename = "functions/src/test/resources/tests/test8.txt";
        int expectedSum = 545; 
        int actualSum = NumberOperations._sum(filename);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMult() {
        String filename = "functions/src/test/resources/tests/test10_allEqual.txt";
        int expectedMin = 1024;
        int actualMin = NumberOperations._mult(filename);
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testPerformance() {
        String filename = "functions/src/test/resources/tests/test1.txt";
        long expectedTime = 2500;
        long startTime = System.currentTimeMillis();
        int sum = NumberOperations._sum(filename);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        assertTrue(duration < expectedTime);
    }

    @Test
    public void testEqual() {  // тест на то, что программа правильно распознает массив со всеми одинаковыми числами
        String filename = "functions/src/test/resources/tests/test10_allEqual.txt";
        int expectedMin = 2; 
        int expectedMax = 2;
        int actualMin = NumberOperations._min(filename);
        int actualMax = NumberOperations._max(filename);
        assertEquals(expectedMin, actualMin);
        assertEquals(expectedMax, actualMax);
    }
}
