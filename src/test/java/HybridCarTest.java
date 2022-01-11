import components.Brakes;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybrid1;

    @Before
    public void before() {
        hybrid1 = new HybridCar("Toyota Prius", 45000, "brown", Engine.HYBRID, Brakes.DISC, Tyres.MEDIUM);
    }

    @Test
    public void hasPrice() {
        assertEquals(45000, hybrid1.getPrice());
    }
    @Test
    public void hasColour() {
        assertEquals("brown", hybrid1.getColour());
    }
    @Test
    public void hasEngine() {
        assertEquals("hybrid", hybrid1.getEngineValue());
    }
    @Test
    public void hasBrakes() {
        assertEquals("disc", hybrid1.getBrakeValue());
    }
    @Test
    public void hasTyres() {
        assertEquals("medium", hybrid1.getTyresValue());
    }

}
