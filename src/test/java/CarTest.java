import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

//    @Before
//    public void before() {
//        car = new Car("2L", "Automatic");
//    }

    @Test
    public void hasEngine() {
        assertEquals("2L", car.getEngine());
    }
}
