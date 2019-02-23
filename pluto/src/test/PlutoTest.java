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

}
