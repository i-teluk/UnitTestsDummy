import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleUnitTests {
    @Test
    public void testGetLength() {
        Rectangle rectangle = new Rectangle(5, 2);
        assertEquals(5, rectangle.getLength(), 0.001);
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(5, 2);
        assertEquals(2, rectangle.getWidth(), 0.001);
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(5, 2);
        assertEquals(10, rectangle.getArea(), 0.001);
    }

    @Test
    public void testSetLength() {
        Rectangle rectangle = new Rectangle(5, 2);
        rectangle.setLength(7);
        assertEquals(7, rectangle.getLength(), 0.001);
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(5, 2);
        rectangle.setWidth(9);
        assertEquals(9, rectangle.getWidth(), 0.001);
    }
}
