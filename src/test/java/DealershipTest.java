import components.Engine;
import components.GearBox;
import components.Tyres;
import dealerships.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Customer customer;
    Vehicle vehicle;

    Dealership dealership;
    Engine engine;
    GearBox gearbox;
    Tyres tyres;

    @Before
    public void before() {
        dealership = new Dealership("Arnold Clark", 10000.00);
        customer = new Customer("John", 3000);
        vehicle = new Vehicle(engine, gearbox, tyres, 2000.00, "Blue", "Toyota", "Yaris", false, false);
        engine = new Engine(100, 2);
        gearbox = new GearBox("Manual");
        tyres = new Tyres(22, "Goodyear");


    }

    @Test
    public void dealershipCanBuy() {
        dealership.buyCar(vehicle);
        assertEquals(8000.00, dealership.getTill(), 0.0);
        assertEquals(1, dealership.getCars().size());
    }

    @Test
    public void dealershipCanSellCar() {
        dealership.sellCarToCustomer(vehicle, customer);
        assertEquals(1000, customer.getMoney(), 0.0);

    }

}


