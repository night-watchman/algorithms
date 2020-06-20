package sword.offer;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void countTest() {
        Fibonacci fibonacci = new Fibonacci();
        Assert.assertEquals(fibonacci.countIterate(3), 2);
        Assert.assertEquals(fibonacci.countIterate(5),5);
        Assert.assertEquals(fibonacci.countIterate(10), 55);

        Assert.assertEquals(fibonacci.countIterate(0), 0);
        Assert.assertEquals(fibonacci.countIterate(1), 1);
        Assert.assertEquals(fibonacci.countIterate(2), 1);

        Assert.assertEquals(fibonacci.countIterate(60), 1548008755920l );

    }
}
