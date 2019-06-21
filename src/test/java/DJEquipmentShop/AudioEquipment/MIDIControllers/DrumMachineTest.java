package DJEquipmentShop.AudioEquipment.MIDIControllers;

import DJEquipmentShop.Computers.Computer;
import org.junit.Before;
import org.junit.Test;

import java.util.SortedMap;

import static org.junit.Assert.*;

public class DrumMachineTest {

    DrumMachine drumMachine;
    Computer computer;

    @Before
    public void before(){
        drumMachine = new DrumMachine("NI", "Maschine mk3", 200.00, 400.00, false, 20.00, "Matrix", 16, 64, false);
        computer = new Computer("Apple", "MacBookPro", 50);
    }

    @Test
    public void getType() {
        assertEquals("Matrix", drumMachine.getType());
    }

    @Test
    public void getPads() {
        assertEquals(16, drumMachine.getPads());
    }

    @Test
    public void getTracks() {
        assertEquals(64, drumMachine.getTracks());
    }

    @Test
    public void isStandAlone() {
        assertEquals(false, drumMachine.getStandAlone());
    }

    @Test
    public void play() {
        assertEquals("Ba dum dum psh", drumMachine.play());
    }
}