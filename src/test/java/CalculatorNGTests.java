import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorNGTests {
    @Test
    public void testAdd() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals(calculatorAdd.add(2, 3), 5, "The value is not correct!");
    }

    @Test
    public void testSubtract() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals(calculatorAdd.subtract(8, 3), 5, "The value is not correct!");
    }

    @Test
    public void testMultiply() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals(calculatorAdd.multiply(2, 3), 6, "The value is not correct!");
    }

    @Test
    public void testDivide() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals(calculatorAdd.divide(10, 2), 5, "The value is not correct!");
    }
}
