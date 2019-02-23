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

}
