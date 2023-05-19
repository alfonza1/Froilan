package interfaces;

import classes.CropRow;

public interface FarmVehicle {

    void operate(Farm farm);
    void fertilizer(CropRow cropRow);
}
