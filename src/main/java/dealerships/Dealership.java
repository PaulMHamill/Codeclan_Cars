package dealerships;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> cars;

    private double till;

    public Dealership(ArrayList<Vehicle> cars, double till) {
        this.cars = cars;
        this.till = till;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public double getTill() {
        return till;
    }
}
