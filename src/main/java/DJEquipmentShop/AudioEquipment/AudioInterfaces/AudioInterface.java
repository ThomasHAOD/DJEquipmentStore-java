package DJEquipmentShop.AudioEquipment.AudioInterfaces;

import DJEquipmentShop.AudioEquipment.AudioEquipment;
import DJEquipmentShop.AudioEquipment.Synths.Synth;
import DJEquipmentShop.Behaviours.IAudioConnectable;
import DJEquipmentShop.Behaviours.IComputerConnectable;
import DJEquipmentShop.Behaviours.IHireable;
import DJEquipmentShop.Computers.Computer;

import java.util.ArrayList;

public class AudioInterface extends AudioEquipment implements IComputerConnectable, IHireable {

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

    public String connect(Computer computer) {
        return "Connected to " + computer.getMakeAndModel();
    }

    public void addDevice(IAudioConnectable device) {
        if(numOfConnectedDevices() < channels){
        connectedDevices.add(device); }
        device.connect(this);
    }


    public double hireOut(int numberOfDaysHire) {
        return hirePrice*numberOfDaysHire;
    }
}
