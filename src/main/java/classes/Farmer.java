package classes;

import interfaces.Botanist;
import interfaces.Edible;
import interfaces.Rideable;

import java.util.List;

public class Farmer extends Person implements Botanist {

private List<Edible> edible;

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
        this.edible = edible;


    }
    public int ateAmount() {
        int i = 0;
        for(Edible edible: edible){
            i++;

        }
        return i;

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
