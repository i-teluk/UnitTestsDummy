import org.junit.Assert;
import org.junit.Test;

public class CalculatorUnitTests {
    @Test
    public void testAdd() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals("The value is not correct!", 5, calculatorAdd.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals("The value is not correct!", 2, calculatorAdd.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals("The value is not correct!", 15, calculatorAdd.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        Calculator calculatorAdd = new Calculator();
        Assert.assertEquals("The value is not correct!", 5, calculatorAdd.divide(10, 2));
    }
}
