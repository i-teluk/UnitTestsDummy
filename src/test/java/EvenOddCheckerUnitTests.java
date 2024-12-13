import org.junit.Test;
import org.junit.Assert;


public class EvenOddCheckerUnitTests {
    @Test
    public void testEvenOddChecker() {
        Assert.assertTrue("The entered number is odd!", EvenOddChecker.check(4));
        Assert.assertFalse("The entered number is even!", EvenOddChecker.check(5));
        Assert.assertTrue("The entered number is zero!", EvenOddChecker.check(0));
        Assert.assertTrue("The entered number is odd!", EvenOddChecker.check(-2));
        Assert.assertFalse("The entered number is even!", EvenOddChecker.check(-5));

    }
}
