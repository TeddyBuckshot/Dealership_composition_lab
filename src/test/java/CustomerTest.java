import components.Brakes;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle1;
    Vehicle vehicle2;
    Vehicle vehicle3;

    @Before
    public void before() {
        vehicle1 = new ElectricCar("Porsche Taycan",80000, "blue", Engine.ELECTRIC, Brakes.DRUM, Tyres.MEDIUM);
        vehicle2 = new Car("Honda NSX",2000, "black", Engine.ICE, Brakes.CARBON, Tyres.SOFT);
        vehicle3 = new HybridCar("McLaren Speedtail", 70000, "brown", Engine.HYBRID, Brakes.DISC, Tyres.MEDIUM);

        customer = new Customer(150000);
    }

    @Test
    public void hasMoney() {
        assertEquals(150000, customer.getCurrentBalance(), 0.01);
    }
    @Test
    public void canBuyVehicles() {
        customer.buyVehicle(vehicle1);
        customer.buyVehicle(vehicle2);
        assertEquals(2, customer.getOwnedVehicles().size());
        assertEquals(68000, customer.getCurrentBalance(), 0.0);
    }
    @Test
    public void canReachBudget() {
        customer.buyVehicle(vehicle1);
        customer.buyVehicle(vehicle3);
        customer.buyVehicle(vehicle2);
        assertEquals(2, customer.getOwnedVehicles().size());
        assertEquals(0, customer.getCurrentBalance(), 0.0);
    }

}
