package DJEquipmentShop.Computers;

import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    Computer computer;
    AudioInterface audioInterface;

    @Before
    public void before(){
        computer = new Computer("Apple", "MacBookPro", 50);
        audioInterface = new AudioInterface("NI", "Audio6", 70, 120, 6, 12);
    }

    @Test
    public void getMake() {
        assertEquals("Apple", computer.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("MacBookPro", computer.getModel());
    }

    @Test
    public void getNumOfConnectedDevices() {
        assertEquals(0, computer.getNumOfConnectedDevices());
    }

    @Test
    public void getHirePrice() {
        assertEquals(50, computer.getHirePrice(), 0.01);
    }

    @Test
    public void canGetMakeAndModel(){
        assertEquals("Apple:MacBookPro", computer.getMakeAndModel());
    }

    @Test
    public void canAddDevice(){
        computer.addDevice(audioInterface);
        assertEquals(1, computer.getNumOfConnectedDevices());
    }
}