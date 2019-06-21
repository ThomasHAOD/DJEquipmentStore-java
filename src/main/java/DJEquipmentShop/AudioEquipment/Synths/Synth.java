package DJEquipmentShop.AudioEquipment.Synths;

import DJEquipmentShop.AudioEquipment.AudioEquipment;
import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import DJEquipmentShop.Behaviours.IAudioConnectable;
import DJEquipmentShop.Behaviours.IPlayable;

public class Synth extends AudioEquipment implements IAudioConnectable, IPlayable {

    private String type;
    private int keys;

    public Synth(String make, String model, double buyPrice, double sellPrice, String type, int keys) {
        super(make, model, buyPrice, sellPrice);
        this.keys = keys;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getKeys() {
        return keys;
    }

    public String connect(AudioInterface audioInterface) {
        return "Connected to " + audioInterface.getMakeAndModel();
    }

    public String play() {
        return "Womp womp, wa wa wa";
    }
}
