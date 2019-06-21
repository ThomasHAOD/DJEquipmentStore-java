package DJEquipmentShop;

import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import DJEquipmentShop.AudioEquipment.MIDIControllers.DJController;
import DJEquipmentShop.AudioEquipment.Synths.Synth;
import DJEquipmentShop.Computers.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    AudioInterface audioInterface;
    Computer computer;
    Synth synth;
    DJController djController;

    @Before
    public void before(){
        shop = new Shop();
        audioInterface = new AudioInterface("NI", "Audio6", 70, 120, 6, 12);
        computer = new Computer("Apple", "MacBookPro", 50);
        synth = new Synth("Moog", "MiniMoog", 3050.00, 4000.00, "Stand Alone", 61);
        djController = new DJController("Native Instruments", "S4", 250.00, 400.00, false, 25.00, "Metal Weighted", true, 4, true);
    }


    @Test
    public void canAddToStock(){
        shop.addToStock(djController);
        assertEquals(1, shop.getTotalStockLevel());
    }

    @Test
    public void canSellDevice(){
        shop.addToStock(synth);
        shop.sellDevice(synth);
        assertEquals(9000, shop.getTill(), 0.01);
        assertEquals(0, shop.getTotalStockLevel());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addToStock(synth);
        shop.addToStock(audioInterface);
        assertEquals(1000, shop.getTotalPotentialProfit(), 0.01);
    }
}