package DJEquipmentShop.AudioEquipment.AudioInterfaces;

import DJEquipmentShop.AudioEquipment.AudioEquipment;
import DJEquipmentShop.Behaviours.IAudioConnectable;

import java.util.ArrayList;

public class AudioInterface extends AudioEquipment {

    private int channels;
    private ArrayList<IAudioConnectable> connectedDevices;
    private double hirePrice;

    public AudioInterface(String make, String model, double buyPrice, double sellPrice, int channels, double hirePrice) {
        super(make, model, buyPrice, sellPrice);
        this.channels = channels;
        this.hirePrice = hirePrice;
        this.connectedDevices = new ArrayList<IAudioConnectable>();
    }

    public int getChannels() {
        return channels;
    }

    public int numOfConnectedDevices() {
        return connectedDevices.size();
    }

    public double getHirePrice() {
        return hirePrice;
    }
}
