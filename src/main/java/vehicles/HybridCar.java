package vehicles;

import components.Engine;
import components.GearBox;
import components.Tyres;

public class HybridCar extends Vehicle{

    public HybridCar(Engine engine, GearBox gearbox, Tyres tyres, double price, String colour, String make, String model, Boolean electric, Boolean hybrid) {
        super(engine, gearbox, tyres, price, colour, make, model, electric, hybrid);
    }
}
