package vehicles;

import components.Brakes;
import components.Engine;
import components.Tyres;

public class ElectricCar extends Vehicle {

    public ElectricCar(int price, String colour, Engine engine, Brakes brakes, Tyres tyres){
        super(price, colour, engine, brakes, tyres);
    }
}
