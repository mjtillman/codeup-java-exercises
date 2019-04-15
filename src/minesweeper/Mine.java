package minesweeper;

public class Mine {
    final private int[] location = new int[2];

    public Mine(int height, int width) {
        location[0] = (int) Math.floor(Math.random() * height);
        location[1] = (int) Math.floor(Math.random() * width);
    }

    public int getY() {
        return location[0];
    }

    public int getX() {
        return location[1];
    }

    public String getLocation() {
        return "[" + location[0] + ", " + location[1] + "]";
    }
}
