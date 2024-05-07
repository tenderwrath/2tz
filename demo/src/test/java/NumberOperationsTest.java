import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import org.junit.Test;

// import demo.src.main.java.NumberOperations;

public class NumberOperationsTest {

    @Test
    public void testMin() throws FileNotFoundException {
        
        String filename = "demo/src/test/resources/tests/test1.txt";
        int expectedMin = 1; 
        int actualMin = NumberOperations._min(filename);
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testMax() {
        System.out.println(new File(".").getAbsolutePath());
        String filename = "demo/test1.txt";
        int expectedMax = 1000000;
        int actualMax = NumberOperations._max(filename);
        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testSum() {
        String filename = "test8.txt";
        int expectedSum = 545; 
        int actualSum = NumberOperations._sum(filename);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMult() {
        String filename = "test10_allEqual.txt";
        int expectedMin = 1024;
        int actualMin = NumberOperations._mult(filename);
        assertEquals(expectedMin, actualMin);
    }

    // @Test
    // public void testTime() {
    //     String filename = "test_numbers.txt";
    //     int expectedMin = 1; 
    //     int actualMin = NumberOperations.min(filename);
    //     assertEquals(expectedMin, actualMin);
    // }

    @Test
    public void testEqual() {
        String filename = "test10_allEqual.txt";
        int expectedMin = 2; 
        int expectedMax = 2;
        int actualMin = NumberOperations._min(filename);
        int actualMax = NumberOperations._max(filename);
        assertEquals(expectedMin, actualMin);
        assertEquals(expectedMax, actualMax);
    }
}
