import components.Brakes;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car1;
    Car car2;

    @Before
    public void before() {
        car1 = new Car("Honda S2000", 28000, "black", Engine.ICE, Brakes.DISC, Tyres.MEDIUM);
        car2 = new Car("BMW M3", 38000, "red", Engine.ICE, Brakes.CARBON, Tyres.SOFT);
    }

    @Test
    public void hasPrice() {
        assertEquals(28000, car1.getPrice());
    }
    @Test
    public void hasColour() {
        assertEquals("red", car2.getColour());
    }
    @Test
    public void hasEngine() {
        assertEquals(Engine.ICE, car1.getEngine());
    }
    @Test
    public void hasBrakes() {
        assertEquals(Brakes.CARBON, car2.getBrakes());
    }
    @Test
    public void hasTyres() {
        assertEquals(Tyres.SOFT, car2.getTyres());
    }

}
