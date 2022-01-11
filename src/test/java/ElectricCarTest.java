import components.Brakes;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electric1;
    ElectricCar electric2;

    @Before
    public void before() {
        electric1 = new ElectricCar(80000, "blue", Engine.ELECTRIC, Brakes.DRUM, Tyres.HARD);
        electric2 = new ElectricCar(100000, "red", Engine.ELECTRIC, Brakes.CARBON, Tyres.SOFT);
    }

    @Test
    public void hasPrice() {
        assertEquals(80000, electric1.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("red", electric2.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals("electric", electric1.getEngine());
    }

    @Test
    public void hasBrakes() {
        assertEquals("drum", electric1.getBrakes());
    }

    @Test
    public void hasTyres() {
        assertEquals("soft", electric2.getTyres());
    }
}
