package DJEquipmentShop.AudioEquipment.Monitors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonitorTest {

    Monitor monitor;

    @Before
    public void before(){
        monitor = new Monitor("Yamaha", "DS7", 80, 150, 200);
    }

    @Test
    public void getWattage() {
        assertEquals(200, monitor.getWattage());
    }
}