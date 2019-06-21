package DJEquipmentShop.AudioEquipment.Synths;

import DJEquipmentShop.AudioEquipment.AudioEquipment;

public class Synth extends AudioEquipment {

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
}
