package classes;

import interfaces.Botanist;
import interfaces.Edible;
import interfaces.Rideable;

import java.util.List;

public class Farmer extends Person implements Botanist {

    public Farmer(String name) {
        super(name);
    }


    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }



    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void eat(List<Edible> edible) {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }


}
