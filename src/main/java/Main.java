import enums.OrientationType;

public class Main {

    public static void main(String[] args) {

        Grid grid = new Grid(5,3);

        int[] startingPos = new int[] {1, 1};
        Robot robot = new Robot(startingPos, OrientationType.E, "RFRFRFRF", grid);
        System.out.println(robot);

        int[] startingPos2 = new int[] {3, 2};
        Robot robot2 = new Robot(startingPos2, OrientationType.N, "FRRFLLFFRRFLL", grid);
        System.out.println(robot2);

        int[] startingPos3 = new int[] {0, 3};
        Robot robot3 = new Robot(startingPos3, OrientationType.W, "LLFFFLFLFL", grid);
        System.out.println(robot3);
    }
}