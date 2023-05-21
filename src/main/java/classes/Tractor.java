package classes;

import interfaces.Edible;
import interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {


    @Override
    public void operate(CropRow cropRow) {

    }

    @Override
    public void fertilize(CropRow cropRow) {

    }


    @Override
    public void makeNoise() {
        System.out.println("Skirrttttt skirtttt");
    }

}

