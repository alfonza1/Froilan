package vehicles;

import farm.CropRow;
import interfaces.FarmVehicle;


public class Tractor extends Vehicle implements FarmVehicle {


    @Override
    public void operate(CropRow cropRow) {

    }

    @Override
    public void fertilize(CropRow cropRow) {
        cropRow.fertilize();
        System.out.println(cropRow + " has been fertilized");

    }

    @Override
    public void harvest(CropRow cropRow) {
        cropRow.yield();
        cropRow.harvest();


    }


    @Override
    public void makeNoise() {
        System.out.println("Skirrttttt skirtttt");
    }

    @Override
    public String toString() {
        return "Tractor";
    }
}

