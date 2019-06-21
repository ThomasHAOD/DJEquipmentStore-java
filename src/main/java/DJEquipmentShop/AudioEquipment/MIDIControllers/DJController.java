package DJEquipmentShop.AudioEquipment.MIDIControllers;

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
}
