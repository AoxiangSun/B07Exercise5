import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    double epsilon = 0.001;

    @Test
    public void testPerimeterStandardRectangle() {
        Point a = new Point(0, 0);
        Point b = new Point(2.5, 0);
        Point c = new Point(2.5, 2);
        Point d = new Point(0, 2);
        
        Rectangle rect = new Rectangle(a, b, c, d);
        
        // Perimeter should be 2.5+2+2.5+2=9
        assertEquals(9.0, rect.perimeter(), epsilon);
    }
    @Test
    public void testRectanglePerimeterScrambled() {
        Point a = new Point(0, 0);
        Point b = new Point(2.5, 0);
        Point c = new Point(2.5, 2);
        Point d = new Point(0, 2);

        Rectangle rect = new Rectangle(a, c, b, d);

        // Perimeter should be 2.5+2+2.5+2=9
        assertEquals(9.0, rect.perimeter(), epsilon);
    }
    @Test
    public void testPerimeterSquare() {
        Point a = new Point(0, 0);
        Point b = new Point(5.0, 0);
        Point c = new Point(5.0, 5.0);
        Point d = new Point(0, 5.0);
        
        Rectangle rect = new Rectangle(a, b, c, d);
        
        // Perimeter should be 5+5+5+5=20
        assertEquals(20.0, rect.perimeter(), epsilon);
    }
    @Test
    public void testIsSquareTrue() {
        Point a = new Point(0, 0);
        Point b = new Point(2.1, 0);
        Point c = new Point(2.1, 2.1);
        Point d = new Point(0, 2.1);

        Rectangle rect = new Rectangle(a, b, c, d);

        assertTrue(rect.isSquare());
    }
    @Test
    public void testIsSquareTrueScrambled() {
        Point a = new Point(0, 0);
        Point b = new Point(2.1, 0);
        Point c = new Point(2.1, 2.1);
        Point d = new Point(0, 2.1);

        Rectangle rect = new Rectangle(a, c, d, b);

        assertTrue(rect.isSquare());
    }
    @Test
    public void testIsSquareFalse() {
        Point a = new Point(0, 0);
        Point b = new Point(3.52, 0);
        Point c = new Point(3.52, 2.1);
        Point d = new Point(0, 2.1);

        Rectangle rect = new Rectangle(a, b, c, d);

        assertFalse(rect.isSquare());
    }

}
