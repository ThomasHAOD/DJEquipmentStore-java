package DJEquipmentShop.AudioEquipment.MIDIControllers;

public class DrumMachine extends MIDIController {

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
}
