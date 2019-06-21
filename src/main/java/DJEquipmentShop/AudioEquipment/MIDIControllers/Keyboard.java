package DJEquipmentShop.AudioEquipment.MIDIControllers;

import DJEquipmentShop.Computers.Computer;

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

    public String connect(Computer computer) {
        return "Connected to " + computer.getMakeAndModel();
    }

    public double hireOut(int numberOfDaysHire) {
        return getHirePrice()*numberOfDaysHire;
    }
}
