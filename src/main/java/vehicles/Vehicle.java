package vehicles;

import behaviours.ISelector;
import components.Brakes;
import components.Engine;
import components.Tyres;

public class Vehicle implements ISelector {

    private String name;
    private int price;
    private String colour;
    private Engine engine;
    private Brakes brakes;
    private Tyres tyres;
    private double

    public Vehicle(String name, int price, String colour, Engine engine, Brakes brakes, Tyres tyres){
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.brakes = brakes;
        this.tyres = tyres;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public String getEngineValue() {
        return engine.getCustomString();
    }

    public String getBrakeValue() {
        return brakes.getCustomString();
    }

    public String getTyresValue() {
        return tyres.getCustomString();
    }

}
