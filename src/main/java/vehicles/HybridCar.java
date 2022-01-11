package vehicles;

import components.Brakes;
import components.Engine;
import components.Tyres;

public class HybridCar extends Vehicle{

    public HybridCar(int price, String colour, Engine engine, Brakes brakes, Tyres tyres){
        super(price, colour, engine, brakes, tyres);
    }
}
