package vehicles;

import components.Engine;
import components.GearBox;
import components.Tyres;

public class Vehicle {
    private Engine engine;
    private GearBox gearbox;
    private Tyres tyres;
    private double price;
    private String colour;

    private String make;

    private String model;

    private Boolean electric;

    private Boolean hybrid;

    public Vehicle(Engine engine, GearBox gearbox, Tyres tyres, double price, String colour, String make, String model, Boolean electric, Boolean hybrid) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.electric = electric;
        this.hybrid = hybrid;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBox getGearbox() {
        return gearbox;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Boolean getElectric() {
        return electric;
    }

    public Boolean getHybrid() {
        return hybrid;
    }
}
