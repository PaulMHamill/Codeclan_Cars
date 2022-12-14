import components.Engine;
import components.GearBox;
import components.Tyres;
import dealerships.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

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
    public void hasName() {
        assertEquals("John", customer.getName());
    }

//    @Test
//    public void hasMoney() {
//        assertEquals(100000, customer.getMoney());
//    }

    @Test
    public void customerCanBuy() {
        customer.buyCar(vehicle);
        assertEquals(1000.00, customer.getMoney(), 0.0);
        assertEquals(1, customer.getOwnedVehicles().size());
    }
}
