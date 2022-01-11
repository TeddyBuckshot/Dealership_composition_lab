package vehicles;

import components.Brakes;
import components.Engine;
import components.Tyres;

public class HybridCar extends Vehicle{

    public HybridCar(String name, int price, String colour, Engine engine, Brakes brakes, Tyres tyres){
        super(name, price, colour, engine, brakes, tyres);
    }
}
