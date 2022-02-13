import java.util.ArrayList;
public class Grid {
    public int XCoord;
    public int YCoord;
    public ArrayList<int[]> ListOfScents = new ArrayList<>();

    public Grid(int xCoord, int yCoord) {
        if (xCoord > 50 || yCoord > 50 || xCoord < 0 || yCoord < 0)
            throw new IllegalStateException("Grid coordinates must be between 0 and 50");
        else {
            XCoord = xCoord;
            YCoord = yCoord;
        }
    }
}