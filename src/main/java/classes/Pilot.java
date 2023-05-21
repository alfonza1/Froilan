package classes;

import classes.Person;
import interfaces.Edible;
import interfaces.Rideable;
import interfaces.Rider;

import java.util.List;

public class Pilot extends Person implements Rider {

    public Pilot(String name) {
        super(name);
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

