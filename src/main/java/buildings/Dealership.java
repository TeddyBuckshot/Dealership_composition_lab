package buildings;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {


    private ArrayList<Vehicle> carStock;
    private double till;

    public Dealership(double till){
        this.carStock = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getCarStock() {
        return carStock;
    }

//    public void setCarStock(ArrayList<Vehicle> carStock) {
//        this.carStock = carStock;
//    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void buyVehicle(Vehicle vehicle) {
        this.carStock.add(vehicle);
    }
}
