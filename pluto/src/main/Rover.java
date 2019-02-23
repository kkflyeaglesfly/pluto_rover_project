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

    public void command(String commands) {
        for (int i = 0; i < commands.length(); i++) {
            if (checkObstacle(commands.charAt(i))) {
                int obstacleX;
                int obstacleY;
                if (commands.charAt(i) == 'F') {
                    commandF();
                    obstacleX = getX();
                    obstacleY = getY();
                    commandB();
                } else {
                    commandB();
                    obstacleX = getX();
                    obstacleY = getY();
                    commandF();
                }
                reportObstacle(obstacleX, obstacleY);
                break;
            }
            switch(commands.charAt(i)) {
                case 'F':
                    commandF();
                    break;
                case 'B':
                    commandB();
                    break;
                case 'L':
                    commandL();
                    break;
                case 'R':
                    commandR();
                    break;
            }
        }
    }

    public void commandF() {
        switch(dir) {
            case N:
                if (y == planet.getWidth() - 1) {
                    y = 0;
                } else {
                    y++;
                }
                break;
            case S:
                if (y == 0) {
                    y = planet.getWidth() - 1;
                } else {
                    y--;
                }
                break;
            case E:
                if (x == planet.getLength() - 1) {
                    x = 0;
                } else {
                    x++;
                }
                break;
            case W:
                if (x == 0) {
                    x = planet.getLength() - 1;
                } else {
                    x--;
                }
                break;
        }
    }

    public void commandB() {
        switch(dir) {
            case N:
                if (y == 0) {
                    y = planet.getWidth() - 1;
                } else {
                    y--;
                }
                break;
            case S:
                if (y == planet.getWidth() - 1) {
                    y = 0;
                } else {
                    y++;
                }
                break;
            case E:
                if (x == 0) {
                    x = planet.getLength() - 1;
                } else {
                    x--;
                }
                break;
            case W:
                if (x == planet.getLength() - 1) {
                    x = 0;
                } else {
                    x++;
                }
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

    public boolean checkObstacle(char command) {
        if (command == 'F') {
            commandF();
            int resultX = getX();
            int resultY = getY();
            boolean isObstacle = planet.getField()[planet.getWidth() - 1 - resultY][resultX] == 1;
            commandB();
            return isObstacle;
        } else if (command == 'B') {
            commandB();
            int resultX = getX();
            int resultY = getY();
            boolean isObstacle = planet.getField()[planet.getWidth() - 1 - resultY][resultX] == 1;
            commandF();
            return isObstacle;
        } else {
            return false;
        }
    }

    public void reportObstacle(int x, int y) {
        System.out.println("There is an obstacle at: (" + x + ", " + y + "), return to previous spot, stay there.");
    }
}
