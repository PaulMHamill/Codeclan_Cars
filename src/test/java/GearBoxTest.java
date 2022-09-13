import components.GearBox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    GearBox gearBox;

    @Before
    public void before() {
        gearBox = new GearBox("Manual");
    }

    @Test
    public void hasTransmission() {
        assertEquals("Manual", gearBox.getTransmission());
    }
}
