package DJEquipmentShop.Computers;

import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;
import DJEquipmentShop.Behaviours.IComputerConnectable;
import DJEquipmentShop.Behaviours.IHireable;

import java.util.ArrayList;

public class Computer implements IHireable {

    private String make;
    private String model;
    private ArrayList<IComputerConnectable> connectedDevices;
    private double hirePrice;

    public Computer(String make, String model, double hirePrice){
        this.make = make;
        this.model = model;
        this.connectedDevices = new ArrayList<IComputerConnectable>();
        this.hirePrice = hirePrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumOfConnectedDevices() {
        return connectedDevices.size();
    }

    public double getHirePrice() {
        return hirePrice;
    }

    public String getMakeAndModel() {
        return make + ":" + model;
    }

    public void addDevice(IComputerConnectable device) {
        connectedDevices.add(device);
        device.connect(this);
    }

    public double hireOut(int numberOfDaysHire) {
        return hirePrice*numberOfDaysHire;
    }
}
