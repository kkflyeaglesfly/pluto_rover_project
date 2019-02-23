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
}
