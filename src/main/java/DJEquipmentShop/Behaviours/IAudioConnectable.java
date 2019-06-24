package DJEquipmentShop.Behaviours;

import DJEquipmentShop.AudioEquipment.AudioInterfaces.AudioInterface;

public interface IAudioConnectable {

    public String connect(AudioInterface audioInterface);

    String getMakeAndModel();
}
