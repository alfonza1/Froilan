package classes;

import interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    @Override
    public void operate(CropRow cropRow) {

    }

    @Override
    public void fertilize(CropRow cropRow) {

    }

    @Override
    public void harvest(CropRow cropRow) {
        cropRow.harvest();
    }


    @Override
    public void makeNoise() {
        System.out.println("Skirrttttt skirtttt");
    }

}

