package main;

public class Rover {

    public enum Dir {
        N, E, S, W
    }

    private int x;
    private int y;
    private Dir dir;
    private Planet planet;

    public Rover(int x, int y, Dir dir, Planet planet) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.planet = planet;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Dir getDir() {
        return dir;
    }

    public void commandF() {
        switch(dir) {
            case N:
                y++;
                break;
            case S:
                y--;
                break;
            case E:
                if (x == planet.getWidth() - 1) {
                    x = 0;
                } else {
                    x++;
                }
                break;
            case W:
                if (x == 0) {
                    x = planet.getWidth() - 1;
                } else {
                    x--;
                }
                break;
        }
    }

    public void commandB() {
        switch(dir) {
            case N:
                y--;
                break;
            case S:
                y++;
                break;
            case E:
                x--;
                break;
            case W:
                x++;
                break;
        }
    }

    public void commandL() {
        switch(dir) {
            case N:
                dir = Dir.W;
                break;
            case W:
                dir = Dir.S;
                break;
            case S:
                dir = Dir.E;
                break;
            case E:
                dir = Dir.N;
                break;
        }
    }

    public void commandR() {
        switch(dir) {
            case N:
                dir = Dir.E;
                break;
            case E:
                dir = Dir.S;
                break;
            case S:
                dir = Dir.W;
                break;
            case W:
                dir = Dir.N;
                break;
        }
    }
}
