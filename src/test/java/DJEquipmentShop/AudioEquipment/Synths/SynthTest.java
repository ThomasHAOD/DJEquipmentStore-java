package DJEquipmentShop.AudioEquipment.Synths;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SynthTest {

    Synth synth;

    @Before
    public void before(){
        synth = new Synth("Moog", "MiniMoog", 3050.00, 4000.00, "Stand Alone", 61);
    }

    @Test
    public void canGetMake(){
        assertEquals("Moog", synth.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("MiniMoog", synth.getModel());
    }

    @Test
    public void canGetMakeAndModel(){
        assertEquals("Moog:MiniMoog", synth.getMakeAndModel());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(3050.00, synth.getBuyPrice(), 0.01);
    }

    @Test
    public void canSetBuyPrice(){
        synth.setBuyPrice(2500.00);
        assertEquals(2500.00, synth.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(4000.00, synth.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        synth.setSellPrice(4500.00);
        assertEquals(4500.00, synth.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(950.00, synth.calculateMarkUp(), 0.01);
    }

    @Test
    public void canGetType(){
        assertEquals("Stand Alone", synth.getType());
    }

    @Test
    public void canGetKeys(){
        assertEquals(61, synth.getKeys());
    }


    @Test
    public void play() {
        assertEquals("Womp womp, wa wa wa", synth.play());
    }
}