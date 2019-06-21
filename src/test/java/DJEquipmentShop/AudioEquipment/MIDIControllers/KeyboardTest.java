package DJEquipmentShop.AudioEquipment.MIDIControllers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("NI", "S61", 150.00, 230.00, false, 10, 61, false);
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