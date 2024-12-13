import org.testng.Assert;
import org.testng.annotations.Test;


public class EvenOddCheckerNGTests {
    @Test
    public void testEvenOddChecker() {
        Assert.assertTrue(EvenOddChecker.check(4), "The entered number is odd!");
        Assert.assertFalse(EvenOddChecker.check(5), "The entered number is even!");
        Assert.assertTrue(EvenOddChecker.check(0), "The entered number is zero!");
        Assert.assertTrue(EvenOddChecker.check(-2), "The entered number is odd!");
        Assert.assertFalse(EvenOddChecker.check(-5), "The entered number is even!");

    }
}
