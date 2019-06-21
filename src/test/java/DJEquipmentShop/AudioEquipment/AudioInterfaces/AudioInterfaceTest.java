package DJEquipmentShop.AudioEquipment.AudioInterfaces;

import DJEquipmentShop.AudioEquipment.AudioEquipment;
import DJEquipmentShop.AudioEquipment.Synths.Synth;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AudioInterfaceTest {

    AudioInterface audioInterface;
    Synth synth;

    @Before
    public void before(){
        audioInterface = new AudioInterface("NI", "Audio6", 70, 120, 6, 12);
        synth = new Synth("Moog", "MiniMoog", 3050.00, 4000.00, "Stand Alone", 61);
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

    @Test
    public void canAddDevice(){
        audioInterface.addDevice(synth);
        assertEquals(1, audioInterface.numOfConnectedDevices());
    }

    @Test
    public void cantAddTooManyDevices(){
        audioInterface.addDevice(synth);
        audioInterface.addDevice(synth);
        audioInterface.addDevice(synth);
        audioInterface.addDevice(synth);
        audioInterface.addDevice(synth);
        audioInterface.addDevice(synth);
        audioInterface.addDevice(synth);
        assertEquals(6, audioInterface.numOfConnectedDevices());
    }

}