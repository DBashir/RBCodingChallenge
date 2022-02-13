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
        switch(this.Orientation)
        {
            case N:
                this.GridPosition[1] += 1;
                break;
            case E:
                this.GridPosition[0] += 1;
                break;
            case S:
                this.GridPosition[1] -= 1;
                break;
            case W:
                this.GridPosition[0] -= 1;
                break;

        }
        return this.GridPosition;
    }

    protected OrientationType turnLeft() {
        switch(this.Orientation)
        {
            case N:
                return OrientationType.W;
            case E:
                return OrientationType.N;
            case S:
                return OrientationType.E;
            case W:
                return OrientationType.S;
        }
        return this.Orientation;
    }

    protected OrientationType turnRight() {
        switch(this.Orientation)
        {
            case N:
                return OrientationType.E;
            case E:
                return OrientationType.S;
            case S:
                return OrientationType.W;
            case W:
                return OrientationType.N;
        }
        return this.Orientation;
    }

    protected Robot processInstructions() {
        return this;
    }
}
