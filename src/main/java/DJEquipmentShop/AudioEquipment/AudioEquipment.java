package DJEquipmentShop.AudioEquipment;

import DJEquipmentShop.Behaviours.IBuyableSellable;

public abstract class AudioEquipment implements IBuyableSellable {

    private String make;
    private String model;
    protected double buyPrice;
    protected double sellPrice;

    public AudioEquipment(String make, String model, double buyPrice, double sellPrice){
        this.make = make;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getMakeAndModel(){
        return make + ":" + model;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkUp(){
        return this.sellPrice - this.buyPrice;
    }
}
