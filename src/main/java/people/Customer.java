package people;

import dealerships.Dealership;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }


    public void buyCar(Vehicle vehicle) {
        if(this.money >= vehicle.getPrice()) {
            this.ownedVehicles.add(vehicle);
            this.money -= vehicle.getPrice();
        }else{
            System.out.println("Unable to buy");
        }
    }
}
