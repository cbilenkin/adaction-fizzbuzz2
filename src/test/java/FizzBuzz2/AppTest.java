package FizzBuzz2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testKnownValues()
    {
        assertEquals(App.fizzBuzz(1, 20).get(0), "1");
        assertEquals(App.fizzBuzz(1, 20).get(1), "2");
        assertEquals(App.fizzBuzz(1, 20).get(2), "lucky");
        assertEquals(App.fizzBuzz(1, 20).get(3), "4");
        assertEquals(App.fizzBuzz(1, 20).get(4), "buzz");
        assertEquals(App.fizzBuzz(1, 20).get(5), "fizz");
        assertEquals(App.fizzBuzz(1, 20).get(12), "lucky");
        assertEquals(App.fizzBuzz(1, 20).get(14), "fizzbuzz");
    }

    @Test
    public void testKnownValuesWithWeirdRanges()
    {
        assertEquals(App.fizzBuzz(1, 10000).get(178), "179");
        assertEquals(App.fizzBuzz(1, 10000).get(4930), "lucky");
        assertEquals(App.fizzBuzz(10, 10).get(0), "buzz");
        assertEquals(App.fizzBuzz(5, 9).get(0), "buzz");
        assertEquals(App.fizzBuzz(-5, -1).get(2), "lucky");
        assertEquals(App.fizzBuzz(15, 30).get(0), "fizzbuzz");
    }

    @Test
    public void testKnownValuesAtEdges()
    {
        assertEquals(App.fizzBuzz(1, 1500).get(1499), "fizzbuzz");
        assertEquals(App.fizzBuzz(1, 2).get(1), "2");
        assertEquals(App.fizzBuzz(37, 37).get(0), "lucky");
    }
}
