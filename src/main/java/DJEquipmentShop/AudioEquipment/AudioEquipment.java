package DJEquipmentShop.AudioEquipment;

public abstract class AudioEquipment {

    private String make;
    private String model;
    private double buyPrice;
    private double sellPrice;

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
