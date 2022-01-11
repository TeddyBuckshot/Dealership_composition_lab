package people;

import behaviours.IBuy;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy {

    private double currentBalance;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(int currentBalance){
        this.currentBalance = currentBalance;
        this.ownedVehicles = new ArrayList<>();
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (this.currentBalance >= vehicle.getPrice()) {
            this.ownedVehicles.add(vehicle);
            this.currentBalance = currentBalance - vehicle.getPrice();
        }
    }


}
