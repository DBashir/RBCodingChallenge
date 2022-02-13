import enums.OrientationType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @Test
    void constructRobot()
    {
        int[] currentPosition = new int[]{1,1};
        Robot robot = new Robot(currentPosition, OrientationType.N, "RFRFRF", new Grid());
        assertNotNull(robot);
    }

    @Test
    void moveForwardFromNorth()
    {
        assertTrue(false);
    }
    @Test
    void moveForwardFromEast()
    {
        assertTrue(false);
    }
    @Test
    void moveForwardFromSouth()
    {
        assertTrue(false);
    }
    @Test
    void moveForwardFromWest()
    {
        assertTrue(false);
    }

    @Test
    void moveLeftFromNorth()
    {
        assertTrue(false);
    }
    @Test
    void moveLeftFromEast()
    {
        assertTrue(false);
    }
    @Test
    void moveLeftFromSouth()
    {
        assertTrue(false);
    }
    @Test
    void moveLeftFromWest()
    {
        assertTrue(false);
    }

    @Test
    void moveRightFromNorth()
    {
        assertTrue(false);
    }
    @Test
    void moveRightFromEast()
    {
        assertTrue(false);
    }
    @Test
    void moveRightFromSouth()
    {
        assertTrue(false);
    }
    @Test
    void moveRightFromWest()
    {
        assertTrue(false);
    }

    @Test
    void processInstructions()
    {
        assertTrue(false);
    }

}