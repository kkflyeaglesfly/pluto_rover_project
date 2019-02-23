package test;

import main.Planet;
import main.Rover;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoverTest {

    private Planet planet = new Planet(10, 10);

    @Test
    public void yIncreasesByOneWithFWhenFacingNorth() {
        Rover rover = new Rover(0, 0, Rover.Dir.N, planet);
        rover.commandF();
        assertThat(rover.getY(), is(1));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void yDecreasesByOneWithFWhenFacingSouth() {
        Rover rover = new Rover(0, 1, Rover.Dir.S, planet);
        rover.commandF();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void xIncreasesByOneWithFWhenFacingEast() {
        Rover rover = new Rover(0, 0, Rover.Dir.E, planet);
        rover.commandF();
        assertThat(rover.getX(), is(1));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void xDecreasesByOneWithFWhenFacingWest() {
        Rover rover = new Rover(1, 0, Rover.Dir.W, planet);
        rover.commandF();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void yDecreasesByOneWithBWhenFacingNorth() {
        Rover rover = new Rover(0, 1, Rover.Dir.N, planet);
        rover.commandB();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void yIncreasesByOneWithBWhenFacingSouth() {
        Rover rover = new Rover(0, 0, Rover.Dir.S, planet);
        rover.commandB();
        assertThat(rover.getY(), is(1));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void xDecreasesByOneWithBWhenFacingEast() {
        Rover rover = new Rover(1, 0, Rover.Dir.E, planet);
        rover.commandB();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void xIncreasesByOneWithBWhenFacingWest() {
        Rover rover = new Rover(0, 0, Rover.Dir.W, planet);
        rover.commandB();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(1));
    }

    @Test
    public void facesWestWhenRotateLeftFacingNorth() {
        Rover rover = new Rover(0, 0, Rover.Dir.N, planet);
        rover.commandL();
        assertThat(rover.getDir(), is(Rover.Dir.W));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesSouthWhenRotateLeftFacingWest() {
        Rover rover = new Rover(0, 0, Rover.Dir.W, planet);
        rover.commandL();
        assertThat(rover.getDir(), is(Rover.Dir.S));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesEastWhenRotateLeftFacingSouth() {
        Rover rover = new Rover(0, 0, Rover.Dir.S, planet);
        rover.commandL();
        assertThat(rover.getDir(), is(Rover.Dir.E));
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void facesNorthWhenRotateLeftFacingEast() {
        Rover rover = new Rover(0, 0, Rover.Dir.E, planet);
        rover.commandL();
        assertThat(rover.getDir(), is(Rover.Dir.N));
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void facesEastWhenRotateRightFacingNorth() {
        Rover rover = new Rover(0, 0, Rover.Dir.N, planet);
        rover.commandR();
        assertThat(rover.getDir(), is(Rover.Dir.E));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesSouthWhenRotateRightFacingEast() {
        Rover rover = new Rover(0, 0, Rover.Dir.E, planet);
        rover.commandR();
        assertThat(rover.getDir(), is(Rover.Dir.S));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesWestWhenRotateRightFacingSouth() {
        Rover rover = new Rover(0, 0, Rover.Dir.S, planet);
        rover.commandR();
        assertThat(rover.getDir(), is(Rover.Dir.W));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesNorthWhenRotateRightFacingWest() {
        Rover rover = new Rover(0, 0, Rover.Dir.W, planet);
        rover.commandR();
        assertThat(rover.getDir(), is(Rover.Dir.N));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void wrapsAroundToRightEnd1() {
        Rover rover = new Rover(0, 5, Rover.Dir.W, planet);
        rover.commandF();
        assertThat(rover.getX(), is(9));
        assertThat(rover.getY(), is(5));
    }
}
