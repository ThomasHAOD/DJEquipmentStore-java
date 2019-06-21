package DJEquipmentShop.AudioEquipment.MIDIControllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumMachineTest {

    DrumMachine drumMachine;

    @Before
    public void before(){
        drumMachine = new DrumMachine("NI", "Maschine mk3", 200.00, 400.00, false, 20.00, "Matrix", 16, 64, false);
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
}