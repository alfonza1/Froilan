package interfaces;
import classes.CropRow;
import classes.Farm;

public interface FarmVehicle {

    void operate(Farm farm);

   void fertilize(CropRow cropRow);

}
