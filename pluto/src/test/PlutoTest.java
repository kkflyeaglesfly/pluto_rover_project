package test;

import main.Pluto;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PlutoTest {

    @Test
    public void yIncreasesByOneWithFWhenFacingNorth() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.N);
        rover.commandF();
        assertThat(rover.getY(), is(1));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void yDecreasesByOneWithFWhenFacingSouth() {
        Pluto rover = new Pluto(0, 1, Pluto.Dir.S);
        rover.commandF();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void xIncreasesByOneWithFWhenFacingEast() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.E);
        rover.commandF();
        assertThat(rover.getX(), is(1));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void xDecreasesByOneWithFWhenFacingWest() {
        Pluto rover = new Pluto(1, 0, Pluto.Dir.W);
        rover.commandF();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void yDecreasesByOneWithBWhenFacingNorth() {
        Pluto rover = new Pluto(0, 1, Pluto.Dir.N);
        rover.commandB();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void yIncreasesByOneWithBWhenFacingSouth() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.S);
        rover.commandB();
        assertThat(rover.getY(), is(1));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void xDecreasesByOneWithBWhenFacingEast() {
        Pluto rover = new Pluto(1, 0, Pluto.Dir.E);
        rover.commandB();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void xIncreasesByOneWithBWhenFacingWest() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.W);
        rover.commandB();
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(1));
    }

    @Test
    public void facesWestWhenRotateLeftFacingNorth() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.N);
        rover.commandL();
        assertThat(rover.getDir(), is(Pluto.Dir.W));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesSouthWhenRotateLeftFacingWest() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.W);
        rover.commandL();
        assertThat(rover.getDir(), is(Pluto.Dir.S));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesEastWhenRotateLeftFacingSouth() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.S);
        rover.commandL();
        assertThat(rover.getDir(), is(Pluto.Dir.E));
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void facesNorthWhenRotateLeftFacingEast() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.E);
        rover.commandL();
        assertThat(rover.getDir(), is(Pluto.Dir.N));
        assertThat(rover.getY(), is(0));
        assertThat(rover.getX(), is(0));
    }

    @Test
    public void facesEastWhenRotateRightFacingNorth() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.N);
        rover.commandR();
        assertThat(rover.getDir(), is(Pluto.Dir.E));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }

    @Test
    public void facesSouthWhenRotateRightFacingEast() {
        Pluto rover = new Pluto(0, 0, Pluto.Dir.E);
        rover.commandR();
        assertThat(rover.getDir(), is(Pluto.Dir.S));
        assertThat(rover.getX(), is(0));
        assertThat(rover.getY(), is(0));
    }
}
