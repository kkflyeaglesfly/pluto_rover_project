package main;

public class Pluto {

    public enum Dir {
        N
    }

    private int x;
    private int y;
    private Dir dir;

    public Pluto(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void commandF() {
        switch(dir) {
            case N:
                y++;
                break;
        }
    }
}
