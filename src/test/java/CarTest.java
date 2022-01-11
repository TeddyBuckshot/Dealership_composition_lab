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
        car1 = new Car(1000, "yellow", Engine.ICE, Brakes.DISC, Tyres.HARD);
        car2 = new Car(2000, "black", Engine.ICE, Brakes.CARBON, Tyres.SOFT);
    }

    @Test
    public void hasPrice() {
        assertEquals(1000, car1.getPrice());
    }
    @Test
    public void hasColour() {
        assertEquals("black", car2.getColour());
    }
    @Test
    public void hasEngine() {
        assertEquals("combustion", car1.getEngine());
    }
    @Test
    public void hasBrakes() {
        assertEquals("carbon", car2.getBrakes());
    }
    @Test
    public void hasTyres() {
        assertEquals("soft", car2.getTyres());
    }

}
