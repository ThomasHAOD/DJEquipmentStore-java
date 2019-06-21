package DJEquipmentShop.AudioEquipment.Monitors;

import DJEquipmentShop.AudioEquipment.AudioEquipment;
import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import DJEquipmentShop.Behaviours.IAudioConnectable;

public class Monitor extends AudioEquipment implements IAudioConnectable {

    private int wattage;

    public Monitor(String make, String model, double buyPrice, double sellPrice, int wattage) {
        super(make, model, buyPrice, sellPrice);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public String connect(AudioInterface audioInterface) {
        return "Connected to " + audioInterface.getMakeAndModel();
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
