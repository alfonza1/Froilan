package vehicles;

import farm.CropRow;
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
        System.out.println(cropRow + " has been fertilized");

    }

    @Override
    public void harvest(CropRow cropRow) {
        cropRow.harvest();
        cropRow.yield();

    }

    @Override
    public void makeNoise() {
        System.out.println("whooooooo zinggg whoooo");
    }

    @Override
    public String toString() {
        return "CropDuster";
    }
}
