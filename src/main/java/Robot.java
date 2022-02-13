import enums.OrientationType;

public class Robot {
    public int[] GridPosition;
    public OrientationType Orientation;
    public char[] Instruction;
    public Grid Grid;

    public Robot(int[] position, OrientationType orientation, String instruction, Grid grid) {
        this.GridPosition = position;
        this.Orientation = orientation;
        this.Instruction = instruction.toCharArray();
        this.Grid = grid;
    }

    protected int[] moveForward() {
        return this.GridPosition;
    }

    protected OrientationType turnLeft() {
        return this.Orientation;
    }

    protected OrientationType turnRight() {
        return this.Orientation;
    }

    protected Robot processInstructions() {
        return this;
    }
}
