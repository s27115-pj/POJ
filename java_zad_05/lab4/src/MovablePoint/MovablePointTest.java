package MovablePoint;

import MovablePoint.MovablePoint;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovablePointTest {

    @Test
    public void testMoveUp() {
        MovablePoint point = new MovablePoint(0, 0);
        point.moveUp();
        assertEquals(point.toString(), "MovablePoint.MovablePoint{x=0, y=-1}");
    }

    @Test
    public void testMoveDown() {
        MovablePoint point = new MovablePoint(0, 0);
        point.moveDown();
        assertEquals(point.toString(), "MovablePoint.MovablePoint{x=0, y=1}");
    }

    @Test
    public void testMoveLeft() {
        MovablePoint point = new MovablePoint(0, 0);
        point.moveLeft();
        assertEquals(point.toString(), "MovablePoint.MovablePoint{x=-1, y=0}");
    }

    @Test
    public void testMoveRight() {
        MovablePoint point = new MovablePoint(0, 0);
        point.moveRight();
        assertEquals(point.toString(), "MovablePoint.MovablePoint{x=1, y=0}");
    }

}