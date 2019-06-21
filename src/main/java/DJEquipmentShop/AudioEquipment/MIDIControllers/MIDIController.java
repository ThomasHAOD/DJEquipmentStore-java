package DJEquipmentShop.AudioEquipment.MIDIControllers;

import DJEquipmentShop.AudioEquipment.AudioEquipment;

public abstract class MIDIController extends AudioEquipment {

    private Boolean mainsPowered;
    private double hirePrice;

    public MIDIController(String make, String model, double buyPrice, double sellPrice, Boolean mainsPowered, double hirePrice) {
        super(make, model, buyPrice, sellPrice);
        this.mainsPowered = mainsPowered;
        this.hirePrice = hirePrice;
    }


    public Boolean isMainsPowered() {
        return mainsPowered;
    }

    public double getHirePrice() {
        return hirePrice;
    }
}
