package DJEquipmentShop.AudioEquipment.MIDIControllers;

import DJEquipmentShop.Computers.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DJControllerTest {

    DJController djController;
    Computer computer;


    @Before
    public void before(){
        djController = new DJController("Native Instruments", "S4", 250.00, 400.00, false, 25.00, "Metal Weighted", true, 4, true);
        computer = new Computer("Apple", "MacBookPro", 50);
    }

    @Test
    public void hasPlates() {
        assertEquals("Metal Weighted", djController.getPlates());
    }

    @Test
    public void checkIsMainsPowered(){
        assertEquals(false, djController.isMainsPowered());
    }

    @Test
    public void hasDrumPads() {
        assertEquals(true, djController.getDrumPads());
    }

    @Test
    public void getChannels() {
        assertEquals(4, djController.getChannels());
    }

    @Test
    public void getSoundcard() {
        assertEquals(true, djController.getSoundcard());
    }

    @Test
    public void canConnect() {
        assertEquals("Connected to Apple:MacBookPro", djController.connect(computer));
    }

    @Test
    public void hireOut() {
    }
}