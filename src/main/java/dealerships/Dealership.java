package dealerships;

import people.Customer;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> cars;

    private double till;

    public Dealership(String name, double till) {
        this.cars = new ArrayList<Vehicle>();
        this.name = name;
        this.till = till;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public double getTill() {
        return till;
    }

    public void addCar(Vehicle vehicle) {
        this.cars.add(vehicle);
    }

    public void removeCar() {
        this.cars.remove(0);
    }

    public void buyCar(Vehicle vehicle) {
        if(this.till >= vehicle.getPrice()) {
            this.cars.add(vehicle);
            this.till -= vehicle.getPrice();
        }else{
            System.out.println("Unable to buy");
        }
    }

    public void sellCarToCustomer(Vehicle vehicle, Customer customer) {
        this.cars.add(vehicle);
        for (Vehicle vehicle1 : this.cars) {
            if (vehicle1 == vehicle) {
                customer.buyCar(vehicle);
                this.cars.remove(0);
            }

        }
    }
}
