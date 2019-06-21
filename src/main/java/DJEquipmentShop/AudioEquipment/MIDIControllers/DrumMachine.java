package DJEquipmentShop.AudioEquipment.MIDIControllers;

import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import DJEquipmentShop.Behaviours.IAudioConnectable;
import DJEquipmentShop.Behaviours.IPlayable;
import DJEquipmentShop.Computers.Computer;

public class DrumMachine extends MIDIController implements IAudioConnectable, IPlayable {

    private String type;
    private int pads;
    private int tracks;
    private Boolean standAlone;

    public DrumMachine(String make, String model, double buyPrice, double sellPrice, Boolean mainsPowered, double hirePrice, String type, int pads, int tracks, Boolean standAlone) {
        super(make, model, buyPrice, sellPrice, mainsPowered, hirePrice);
        this.type = type;
        this.pads = pads;
        this.tracks = tracks;
        this.standAlone = standAlone;
    }

    public String getType() {
        return type;
    }

    public int getPads() {
        return pads;
    }

    public int getTracks() {
        return tracks;
    }

    public Boolean getStandAlone() {
        return standAlone;
    }

    public String connect(AudioInterface audioInterface) {
        return "Connected to " + audioInterface.getMakeAndModel();
    }

    public String connect(Computer computer) {
        return "Connected to " + computer.getMakeAndModel();
    }

    public double hireOut(int numberOfDaysHire) {
        return getHirePrice()*numberOfDaysHire;
    }

    public String play() {
        return "Ba dum dum psh";
    }
}
