package classes;

import interfaces.Aircraft;
import interfaces.FarmVehicle;

public class CropDuster extends Vehicle implements Aircraft, FarmVehicle {






    @Override
    public void fly() {

        System.out.println("I am flyingggg");


    }



    @Override
    public void operate(CropRow cropRow) {
        System.out.println("Flying over the farm");

    }

    @Override
    public void fertilize(CropRow cropRow) {

        cropRow.fertilize();

    }

    @Override
    public void harvest(CropRow cropRow) {

    }

    @Override
    public void makeNoise() {
        System.out.println("whooooooo zinggg whoooo");
    }





}
