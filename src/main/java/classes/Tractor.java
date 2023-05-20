package classes;

import interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {


    @Override
    public void operate(Farm farm) {


    }

    @Override
    public void fertilizer(CropRow cropRow) {

    }

    @Override
    public void makeNoise() {
        System.out.println("Skirrttttt skirtttt");
    }
}
