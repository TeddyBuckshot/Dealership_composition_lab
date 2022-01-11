import buildings.Dealership;
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

public class DealershipTest {

    Customer customer;
    Dealership dealership;
    Vehicle vehicle1;
    Vehicle vehicle2;
    Vehicle vehicle3;

    @Before
    public void setUp() {
        vehicle1 = new ElectricCar("Tesla model 3", 80000, "blue", Engine.ELECTRIC, Brakes.DRUM, Tyres.HARD);
        vehicle2 = new Car("Ford Mustang", 2000, "black", Engine.ICE, Brakes.CARBON, Tyres.SOFT);
        vehicle3 = new HybridCar("BMW i8", 45000, "brown", Engine.HYBRID, Brakes.DISC, Tyres.MEDIUM);
        dealership = new Dealership(350000.58);
        customer = new Customer(150000);
    }

    @Test
    public void hasTill(){
        assertEquals(350000.58, dealership.getTill(), 0.0);
    }

    @Test
    public void canBuyVehicles() {
        dealership.buyVehicle(vehicle1);
        dealership.buyVehicle(vehicle2);
        assertEquals(2, dealership.getCarStock().size());
        assertEquals(268000.58, dealership.getTill(), 0.0);
    }

    @Test
    public void canSell(){
        dealership.buyVehicle(vehicle1);
        dealership.buyVehicle(vehicle2);
        assertEquals(2, dealership.getCarStock().size());
        dealership.sellVehicle(vehicle1, customer);
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals(1, dealership.getCarStock().size());
        assertEquals(70000, customer.getCurrentBalance(),0.0);
        assertEquals(348000.58, dealership.getTill(), 0.0);

    }
//    @Test
//    public void canReachBudget() {
//        customer.buyVehicle(vehicle1);
//        customer.buyVehicle(vehicle3);
//        customer.buyVehicle(vehicle2);
//        assertEquals(2, customer.getOwnedVehicles().size());
//        assertEquals(0, customer.getCurrentBalance(), 0.0);
//    }
}

