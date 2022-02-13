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
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.N, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnLeft();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.W));
    }
    @Test
    void moveLeftFromEast()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnLeft();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.N));
    }
    @Test
    void moveLeftFromSouth()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RLRLRLF";
        Robot robot = new Robot(currentPosition, OrientationType.S, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnLeft();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.E));
    }
    @Test
    void moveLeftFromWest()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RLRLRLF";
        Robot robot = new Robot(currentPosition, OrientationType.W, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnLeft();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.S));
    }

    @Test
    void moveRightFromNorth()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFLRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.N, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnRight();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.E));
    }
    @Test
    void moveRightFromEast()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnRight();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.S));
    }
    @Test
    void moveRightFromSouth()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.S, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnRight();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.W));
    }
    @Test
    void moveRightFromWest()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.W, instructions, new Grid());

        //Act
        robot.Orientation = robot.turnRight();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.N));
    }

    @Test
    void processInstructions()
    {
        assertTrue(false);
    }

}