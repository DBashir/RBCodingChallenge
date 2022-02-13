import enums.OrientationType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @Test
    void constructRobot()
    {
        int[] currentPosition = new int[]{1,1};
        Robot robot = new Robot(currentPosition, OrientationType.N, "RFRFRF", new Grid(5,3 ));
        assertNotNull(robot);
    }

    @Test
    void moveForwardFromNorth()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.N, instructions, new Grid(5,3));

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.CurrentPosition[1] == 2);
    }
    @Test
    void moveForwardFromEast()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid(5,3));

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.CurrentPosition[0] == 2);
    }
    @Test
    void moveForwardFromSouth()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.S, instructions, new Grid(5,3));

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.CurrentPosition[1] == 0);
    }
    @Test
    void moveForwardFromWest()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.W, instructions, new Grid(5,3));

        //Act
        robot.moveForward();

        //Assert
        assertTrue(robot.CurrentPosition[0] == 0);
    }

    @Test
    void moveLeftFromNorth()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.N, instructions, new Grid(5,3));

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
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid(5,3));

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
        Robot robot = new Robot(currentPosition, OrientationType.S, instructions, new Grid(5,3));

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
        Robot robot = new Robot(currentPosition, OrientationType.W, instructions, new Grid(5,3));

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
        String instructions = "";
        Robot robot = new Robot(currentPosition, OrientationType.N, instructions, new Grid(5,3));

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
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid(5,3));

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
        Robot robot = new Robot(currentPosition, OrientationType.S, instructions, new Grid(5,3));

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
        Robot robot = new Robot(currentPosition, OrientationType.W, instructions, new Grid(5,3));

        //Act
        robot.Orientation = robot.turnRight();

        //Assert
        assertTrue(robot.Orientation.equals(OrientationType.N));
    }

    @Test
    void processInstructionsRightForward()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "RFRFRFRF";
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid(5,3));

        //Act
        robot.processInstructions();

        //Assert
        assertTrue(robot.CurrentPosition[0] == 1);
        assertTrue(robot.CurrentPosition[1] == 1);
        assertTrue(robot.Orientation == OrientationType.E);
    }

    @Test
    void processInstructionsLeftForward()
    {
        //Arrange
        int[] currentPosition = new int[]{1,1};
        String instructions = "LFLFLFLF";
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid(5,3));

        //Act
        robot.processInstructions();

        //Assert
        assertTrue(robot.CurrentPosition[0] == 1);
        assertTrue(robot.CurrentPosition[1] == 1);
        assertTrue(robot.Orientation == OrientationType.E);
    }

    @Test
    void addScentAfterMaximumXValue()
    {
        //Arrange
        int[] currentPosition = new int[]{5,1};
        String instructions = "F";
        Robot robot = new Robot(currentPosition, OrientationType.E, instructions, new Grid(5, 3));

        //Act
        robot.processInstructions();

        //Assert
        Assertions.assertTrue(robot.CurrentPosition[0] == 5);
        Assertions.assertTrue(robot.CurrentPosition[1] == 1);
        Assertions.assertTrue(robot.hasScent);
    }

    @Test
    void addScentAfterMaximumYValue()
    {
        //Arrange
        int[] currentPosition = new int[]{1,3};
        String instructions = "F";
        Robot robot = new Robot(currentPosition, OrientationType.N, instructions, new Grid(5, 3));

        //Act
        robot.processInstructions();

        //Assert
        Assertions.assertTrue(robot.CurrentPosition[0] == 1);
        Assertions.assertTrue(robot.CurrentPosition[1] == 3);
        Assertions.assertTrue(robot.hasScent);
    }

    @Test
    void addScentAfterMinimumXValue()
    {
        //Arrange
        int[] currentPosition = new int[]{0,0};
        String instructions = "FFFF";
        Robot robot = new Robot(currentPosition, OrientationType.W, instructions, new Grid(5, 3));

        //Act
        robot.processInstructions();

        //Assert
        Assertions.assertTrue(robot.CurrentPosition[0] == 0);
        Assertions.assertTrue(robot.CurrentPosition[1] == 0);
        Assertions.assertTrue(robot.hasScent);
    }

    @Test
    void addScentAfterMinimumYValue()
    {
        //Arrange
        int[] currentPosition = new int[]{0,0};
        String instructions = "F";
        Robot robot = new Robot(currentPosition, OrientationType.S, instructions, new Grid(5, 3));

        //Act
        robot.processInstructions();

        //Assert
        Assertions.assertTrue(robot.CurrentPosition[0] == 0);
        Assertions.assertTrue(robot.CurrentPosition[1] == 0);
        Assertions.assertTrue(robot.hasScent);
    }

    @Test
    void checkGridScent()
    {
        //Arrange
        int[] currentPosition = new int[]{3,3};

        int[] gridScent = new int[]{3,4};
        String instructions = "F";
        Robot fallenRobot = new Robot(currentPosition, OrientationType.N, instructions, new Grid(5, 3));
        Robot goodRobot = new Robot(currentPosition, OrientationType.N, instructions, new Grid(5,3));
        fallenRobot.Grid.ListOfScents.add(gridScent);

        //Act
        fallenRobot.processInstructions();
        goodRobot.processInstructions();

        //Assert
        assertTrue(goodRobot.CurrentPosition[1] != 4);
    }

}