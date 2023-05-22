package classes;

import classes.Person;
import interfaces.Edible;
import interfaces.Rideable;
import interfaces.Rider;

import java.util.List;

public class Pilot extends Person implements Rider {

    private List<Edible> edible;

    public Pilot(String name) {
        super(name);
    }


    @Override
    public void eat(Edible edible) {
        this.edible.add(edible);
        hasAte();
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

