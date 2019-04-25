import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    int fibonacciIndex;
    Fibonacci myFibonacci = new Fibonacci(fibonacciIndex);

    @Before
    public void beforeMethod(){
        this.fibonacciIndex = 10;
    }

    @Test
    public void fibonacciRecursive_putGeneralFibonacciIndexEquals10_returns55(){
       assertEquals(55, myFibonacci.fibonacciRecursive(fibonacciIndex));
    }

    @Test
    public void fibonacciRecursive_putFibonacciIndexEquals1_returns1(){
        assertEquals(1, myFibonacci.fibonacciRecursive(1));
    }

    @Test
    public void fibonacciRecursive_putFibonacciIndexEquals0_returns0(){
        assertEquals(0, myFibonacci.fibonacciRecursive(0));
    }

    @Test
    public void fibonacciRecursive_putFibonacciIndexEquals2_returns1(){
        assertEquals(1, myFibonacci.fibonacciRecursive(2));
    }
}
