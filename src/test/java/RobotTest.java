import enums.OrientationType;
import org.junit.jupiter.api.Assertions;
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
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.N, instructions, new Grid());

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.GridPosition[1] == 2);
    }
    @Test
    void moveForwardFromEast()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid());

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.GridPosition[0] == 2);
    }
    @Test
    void moveForwardFromSouth()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.S, instructions, new Grid());

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.GridPosition[1] == 0);
    }
    @Test
    void moveForwardFromWest()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.W, instructions, new Grid());

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.GridPosition[0] == 0);
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