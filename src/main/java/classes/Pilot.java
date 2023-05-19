package classes;

import classes.Person;
import interfaces.Rideable;
import interfaces.Rider;

public class Pilot extends Person implements Rider {
    public Pilot(String name) {
        super(name);
    }

    @Override
    public void canEat() {

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
