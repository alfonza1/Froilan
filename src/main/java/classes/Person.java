package classes;

import interfaces.Eater;
import interfaces.NoiseMaker;

import interfaces.Rideable;

import interfaces.Rider;

public abstract class Person implements NoiseMaker, Eater, Rider {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
