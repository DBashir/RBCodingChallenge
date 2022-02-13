import enums.OrientationType;

import java.util.Arrays;

public class Robot {

    public int[] CurrentPosition;
    public OrientationType Orientation;
    public char[] Instruction;
    public Grid Grid;
    public boolean hasScent;

    public Robot(int[] position, OrientationType orientation, String instruction, Grid grid)
    {
        if(instruction.length() > 100) throw new RuntimeException("Please enter instructions with 100 characters or less");
        this.CurrentPosition = position;
        this.Orientation = orientation;
        this.Instruction = instruction.toCharArray();
        this.Grid = grid;
        this.hasScent = false;
        this.processInstructions();
    }

    protected int[] moveForward()
    {
        if(!this.hasScent)
        {
            switch (this.Orientation) {
                case N:
                    this.CurrentPosition[1] += 1;
                    break;
                case E:
                    this.CurrentPosition[0] += 1;
                    break;
                case S:
                    this.CurrentPosition[1] -= 1;
                    break;
                case W:
                    this.CurrentPosition[0] -= 1;
                    break;
            }
        }
        checkScent();
        return this.CurrentPosition;
    }

    protected OrientationType turnLeft()
    {
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

    protected OrientationType turnRight()
    {
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

    protected Robot processInstructions()
    {
        for (char instruction : this.Instruction)
        {
            if(!hasScent)
            {
                switch (instruction) {
                    case 'F':
                        this.CurrentPosition = moveForward();
                        break;
                    case 'L':
                        this.Orientation = turnLeft();
                        break;
                    case 'R':
                        this.Orientation = turnRight();
                        break;
                    default:
                        throw new RuntimeException("Unknown instruction value: " + instruction);
                }
            }
        }
        return this;
    }

    protected void checkScent()
    {
        int[] position = new int[]{CurrentPosition[0], CurrentPosition[1]};

        if(this.CurrentPosition[0] > this.Grid.XCoord ||
                this.CurrentPosition[1] > this.Grid.YCoord ||
                this.CurrentPosition[0] < 0 ||
                this.CurrentPosition[1] < 0)
        {
            this.hasScent = true;
            if(doesGridContainScent(position)) this.hasScent = false;
            this.Grid.ListOfScents.add(position);

            switch (this.Orientation)
            {
                case N:
                    this.CurrentPosition[1] -= 1;
                    break;
                case E:
                    this.CurrentPosition[0] -= 1;
                    break;
                case S:
                    this.CurrentPosition[1] += 1;
                    break;
                case W:
                    this.CurrentPosition[0] += 1;
                    break;
            }
        }
    }

    private boolean doesGridContainScent(int[] position)
    {
        for (int i = 0; i < this.Grid.ListOfScents.size(); i++)
        {
            if(this.Grid.ListOfScents.get(i)[0] == position[0] && this.Grid.ListOfScents.get(i)[1] == position[1]) return true;
        }
        return false;
    }


    public String toString()
    {
        String isLost = this.hasScent ? "LOST" : "";
        return String.format("%s %s %s", Arrays.toString(this.CurrentPosition), this.Orientation.toString(), isLost);
    }
}
