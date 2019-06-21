package DJEquipmentShop;

import DJEquipmentShop.AudioEquipment.MIDIControllers.DJController;
import DJEquipmentShop.Behaviours.IBuyableSellable;
import DJEquipmentShop.Behaviours.IHireable;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    private ArrayList<IBuyableSellable> stock;
    private ArrayList<IHireable> hireStock;
    private double till;

    public Shop(){
        this.stock = new ArrayList<IBuyableSellable>();
        this.hireStock = new ArrayList<IHireable>();
        this.till = 5000.00;
    }


    public void addToStock(IBuyableSellable device) {
        if(this.stock.add(device));
    }

    public int getTotalStockLevel() {
        return this.stock.size();
    }

    public void sellDevice(IBuyableSellable device){
        int index = this.stock.indexOf(device);
        this.stock.remove(index);
        this.till += device.getSellPrice();
    }

    public double getTill() {
        return this.till;
    }

    public double getTotalPotentialProfit(){
        double profit = 0;
        for(IBuyableSellable device : this.stock){
            profit += device.calculateMarkup();
        }
        return profit;
    }
}
