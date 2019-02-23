package main;

public class Planet {

    private int width;
    private int length;
    private int[][] field;

    public Planet(int width, int length) {
        this.width = width;
        this.length = length;
        this.field = new int[width][length];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int[][] getField() {
        return field;
    }

    // Set array element to 1, indicating there is an obstacle.
    public void setObstacle(int x, int y) {
        field[getWidth() - 1 - y][x] = 1;
    }
}
