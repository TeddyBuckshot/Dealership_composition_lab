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

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle1;
    Vehicle vehicle2;
    Vehicle vehicle3;
    ArrayList<Vehicle> currentVehicles;

    @Before
    public void before() {
        vehicle1 = new ElectricCar(80000, "blue", Engine.ELECTRIC, Brakes.DRUM, Tyres.MEDIUM);
        vehicle2 = new Car(2000, "black", Engine.ICE, Brakes.CARBON, Tyres.SOFT);
        vehicle3 = new HybridCar(70000, "brown", Engine.HYBRID, Brakes.DISC, Tyres.MEDIUM);
        currentVehicles = new ArrayList<>();

        customer = new Customer(150000, currentVehicles);
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
