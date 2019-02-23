package main;

public class Pluto {

    public enum Dir {
        N, S, E, W
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
                x++;
                break;
            case W:
                x--;
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
        }
    }
}
