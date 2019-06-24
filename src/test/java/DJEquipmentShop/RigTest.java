package DJEquipmentShop;

import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import DJEquipmentShop.AudioEquipment.MIDIControllers.DJController;
import DJEquipmentShop.AudioEquipment.Monitors.Monitor;
import DJEquipmentShop.Computers.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RigTest {

    Computer computer;
    AudioInterface audioInterface;
    Monitor monitorL;
    Monitor monitorR;
    DJController djController;
    Rig rig;

    @Before
    public void before(){
        audioInterface = new AudioInterface("NI", "Audio6", 70, 120, 6, 12);
        computer = new Computer("Apple", "MacBookPro", 50);
        djController = new DJController("Native Instruments", "S4", 250.00, 400.00, false, 25.00, "Metal Weighted", true, 4, true);
        monitorL = new Monitor("Yamaha", "DS7", 80, 150, 200);
        monitorR = new Monitor("Yamaha", "DS7", 80, 150, 200);
        rig = new Rig(computer, audioInterface, monitorL, monitorR, djController, null ,null, null);
    }

    @Test
    public void canConnectDeviceToComputer(){
        assertEquals("NI:Audio6 - Connected to Apple:MacBookPro", rig.connectDeviceToComputer(computer, audioInterface));
    }

    @Test
    public void canConnectDeviceToAudioInterface(){
        assertEquals("Yamaha:DS7 - Connected to NI:Audio6", rig.connectDeviceToAudioInterface(audioInterface, monitorL));
    }

    @Test
    public void canPlayWhenNecessaryDevicesAreConnected(){
        assertEquals("Dum dum dum dum", rig.play());
    }

    @Test
    public void cantPlayWhenNecessaryDevicesArentConnected(){
        rig = new Rig(computer, audioInterface, null, null, djController, null ,null, null);
        assertEquals("Please connect all necessary devices", rig.play());
    }

    @Test
    public void canAddNewComputer(){
        rig = new Rig(null, null, null, null, null, null ,null, null);
        assertEquals("Computer added", rig.addComputer(computer));
    }
    @Test
    public void canAddNewAudioInterface(){
        rig = new Rig(null, null, null, null, null, null ,null, null);
        assertEquals("Audio Interface added", rig.addAudioInterface(audioInterface));
    }
    @Test
    public void canAddNewRightMonitor(){
        rig = new Rig(null, null, null, null, null, null ,null, null);
        assertEquals("Right Hand Side Monitor added", rig.addRightMonitor(monitorR));
    }

//    @Test
//    public void canCheckConnectedDevices(){
//        assertEquals("Connected devices: Apple:MacBookPro, NI:Audio6, Yamaha:DS7, Yamaha:DS7, Native Instruments:S4. Missing Devices: Drum Machine, Keyboard, Synth", rig.checkConnectedDevices());
//    }

}