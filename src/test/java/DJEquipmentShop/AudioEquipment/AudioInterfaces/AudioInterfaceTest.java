package DJEquipmentShop.AudioEquipment.AudioInterfaces;

import DJEquipmentShop.AudioEquipment.AudioEquipment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AudioInterfaceTest {

    AudioInterface audioInterface;

    @Before
    public void before(){
        audioInterface = new AudioInterface("NI", "Audio6", 70, 120, 6, 12);
    }

    @Test
    public void getChannels() {
        assertEquals(6, audioInterface.getChannels());
    }

    @Test
    public void numOfConnectedDevices() {
        assertEquals(0, audioInterface.numOfConnectedDevices());
    }

    @Test
    public void getHirePrice() {
        assertEquals(12, audioInterface.getHirePrice(), 0.01);
    }
}