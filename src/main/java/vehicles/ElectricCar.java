package vehicles;

import components.Engine;
import components.GearBox;
import components.Tyres;

public class ElectricCar extends Vehicle{

    public ElectricCar(Engine engine, GearBox gearbox, Tyres tyres, int price, String colour, String make, String model, Boolean electric, Boolean hybrid) {
        super(engine, gearbox, tyres, price, colour, make, model, electric, hybrid);
    }
}
