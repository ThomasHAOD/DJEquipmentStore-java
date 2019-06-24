package DJEquipmentShop;

import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import DJEquipmentShop.AudioEquipment.MIDIControllers.DJController;
import DJEquipmentShop.AudioEquipment.MIDIControllers.DrumMachine;
import DJEquipmentShop.AudioEquipment.MIDIControllers.Keyboard;
import DJEquipmentShop.AudioEquipment.Monitors.Monitor;
import DJEquipmentShop.AudioEquipment.Synths.Synth;
import DJEquipmentShop.Behaviours.IAudioConnectable;
import DJEquipmentShop.Behaviours.IComputerConnectable;
import DJEquipmentShop.Computers.Computer;

public class Rig {

    private Computer computer;
    private AudioInterface audioInterface;
    private Monitor monitorL;
    private Monitor monitorR;
    private DJController djController;
    private DrumMachine drumMachine;
    private Keyboard keyboard;
    private Synth synth;


    public Rig(Computer computer, AudioInterface audioInterface, Monitor monitorL,  Monitor monitorR, DJController djController, DrumMachine drumMachine, Keyboard keyboard, Synth synth){
        this.computer = computer;
        this.audioInterface = audioInterface;
        this.monitorL = monitorL;
        this.monitorR = monitorR;
        this.djController = djController;
        this.drumMachine = drumMachine;
        this.keyboard = keyboard;
        this.synth = synth;
    }


    public String connectDeviceToComputer(Computer computer, IComputerConnectable device) {
        return device.getMakeAndModel() + " - " + device.connect(computer);
    }

    public String connectDeviceToAudioInterface(AudioInterface audioInterface, IAudioConnectable device) {
        return device.getMakeAndModel() + " - " + device.connect(audioInterface);
    }

    public String play() {
        if(computer != null && audioInterface != null && (monitorR != null || monitorL != null)){
            return "Dum dum dum dum";
        } else {
            return "Please connect all necessary devices";
        }
    }


    public String addComputer(Computer computer) {
        this.computer = computer;
        return "Computer added";
    }


    public String addAudioInterface(AudioInterface audioInterface) {
        this.audioInterface = audioInterface;
        return "Audio Interface added";
    }

    public String addRightMonitor(Monitor monitor) {
        this.monitorR = monitor;
        return "Right Hand Side Monitor added";
    }
// --------------XXXXXXXX
//    public String checkConnectedDevices() {
//        int disconnectedDevices = 0;
//        String connectedDevices = "Connected devices: ";
//        if(computer != null){
//
//        }
//    }
}
