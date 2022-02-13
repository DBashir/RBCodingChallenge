import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {
    @Test
    void createGrid()
    {
        Grid grid = new Grid(5, 3);
        assertNotNull(grid);
    }

    @Test
    void gridXAbove50()
    {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            Grid grid = new Grid(51, 0);
        });
        assertEquals("Grid coordinates must be between 0 and 50", exception.getMessage());
    }

    @Test
    void gridYAbove50()
    {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            Grid grid = new Grid(0, 51);
        });
        assertEquals("Grid coordinates must be between 0 and 50", exception.getMessage());
    }

    @Test
    void gridXBelow0()
    {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            Grid grid = new Grid(-1, 1);
        });
        assertEquals("Grid coordinates must be between 0 and 50", exception.getMessage());
    }

    @Test
    void gridYBelow0()
    {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            Grid grid = new Grid(1, -1);
        });
        assertEquals("Grid coordinates must be between 0 and 50", exception.getMessage());
    }


}