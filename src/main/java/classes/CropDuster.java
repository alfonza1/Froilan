package classes;

import interfaces.Aircraft;
import interfaces.FarmVehicle;

public class CropDuster extends Vehicle implements Aircraft, FarmVehicle {


    @Override
    public void fly() {

        System.out.println("I am flyingggg");

    }

    @Override
    public void operate(Farm farm) {
        System.out.println("Flying over the farm");

    }

    @Override
    public void fertilizer(CropRow cropRow) {

        System.out.println();

    }

    @Override
    public void makeNoise() {
        System.out.println("whooooooo zinggg whoooo");
    }
}
