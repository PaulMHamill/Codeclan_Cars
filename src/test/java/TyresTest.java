import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres(22, "Goodyear");
    }

    @Test
    public void hasSize() {
        assertEquals(22, tyres.getSize());
    }

    @Test
    public void hasMake() {
        assertEquals("Goodyear", tyres.getMake());
    }
}
