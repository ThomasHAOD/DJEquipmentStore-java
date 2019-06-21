package DJEquipmentShop.AudioEquipment.MIDIControllers;

import DJEquipmentShop.Computers.Computer;

public class DJController extends MIDIController {

    private String plates;
    private Boolean drumPads;
    private int channels;
    private Boolean soundcard;

    public DJController(String make, String model, double buyPrice, double sellPrice, Boolean mainsPowered, double hirePrice, String plates, Boolean drumPads, int channels, Boolean soundcard) {
        super(make, model, buyPrice, sellPrice, mainsPowered, hirePrice);
        this.plates = plates;
        this.drumPads = drumPads;
        this.channels = channels;
        this.soundcard = soundcard;
    }


    public String getPlates() {
        return plates;
    }

    public Boolean getDrumPads() {
        return drumPads;
    }

    public int getChannels() {
        return channels;
    }

    public Boolean getSoundcard() {
        return soundcard;
    }

    public String connect(Computer computer) {
        return "Connected to " + computer.getMakeAndModel();
    }

    public double hireOut(int numberOfDaysHire) {
        return getHirePrice()*numberOfDaysHire;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
