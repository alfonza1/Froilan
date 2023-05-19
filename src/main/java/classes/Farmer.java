package classes;

import interfaces.Botanist;

public class Farmer extends Person implements Botanist {

    public Farmer(String name) {
        super(name);
    }


    @Override
    public void plant(Crop crow, CropRow cropRow) {

    }
}
