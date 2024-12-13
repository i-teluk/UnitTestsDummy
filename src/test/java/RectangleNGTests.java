import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleNGTests {
    @Test
    public void testGetLength() {
        Rectangle rectangle = new Rectangle(5, 2);
        assertEquals(rectangle.getLength(), 5, 0.001);
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(5, 2);
        assertEquals(rectangle.getWidth(), 2, 0.001);
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(5, 2);
        assertEquals(rectangle.getArea(), 10, 0.001);
    }

    @Test
    public void testSetLength() {
        Rectangle rectangle = new Rectangle(5, 2);
        rectangle.setLength(7);
        assertEquals(rectangle.getLength(), 7, 0.001);
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(5, 2);
        rectangle.setWidth(9);
        assertEquals(rectangle.getWidth(), 9, 0.001);
    }
}
