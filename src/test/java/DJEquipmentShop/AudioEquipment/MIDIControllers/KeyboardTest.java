package DJEquipmentShop.AudioEquipment.MIDIControllers;

import DJEquipmentShop.Computers.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    Keyboard keyboard;
    Computer computer;

    @Before
    public void before(){
        keyboard = new Keyboard("NI", "S61", 150.00, 230.00, false, 10, 61, false);
        computer = new Computer("Apple", "MacBookPro", 50);
    }

    @Test
    public void getKeys() {
        assertEquals(61, keyboard.getKeys());
    }

    @Test
    public void getDrumPads() {
        assertEquals(false, keyboard.getDrumPads());
    }
}