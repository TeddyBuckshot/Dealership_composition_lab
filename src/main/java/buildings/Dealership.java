package buildings;

import behaviours.IBuy;
import behaviours.ISell;
import people.Customer;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy, ISell {


    private ArrayList<Vehicle> carStock;
    private double till;

    public Dealership(double till){
        this.carStock = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getCarStock() {
        return carStock;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (this.till > vehicle.getPrice()){
            this.carStock.add(vehicle);
            this.till = till - vehicle.getPrice();
        }
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        if (carStock.size() >0){
            this.till = till + vehicle.getPrice();
            this.carStock.remove(vehicle);
            customer.buyVehicle(vehicle);
        }
    }
}
