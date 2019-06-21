package DJEquipmentShop.AudioEquipment.MIDIControllers;

public class Keyboard extends MIDIController {

    private int keys;
    private Boolean drumPads;

    public Keyboard(String make, String model, double buyPrice, double sellPrice, Boolean mainsPowered, double hirePrice, int keys, Boolean drumPads) {
        super(make, model, buyPrice, sellPrice, mainsPowered, hirePrice);
        this.keys = keys;
        this.drumPads = drumPads;
    }


    public int getKeys() {
        return keys;
    }

    public Boolean getDrumPads() {
        return drumPads;
    }
}
