package classes;

import interfaces.Eater;
import interfaces.NoiseMaker;


import interfaces.Rider;

public abstract class Person implements NoiseMaker, Eater, Rider {

    private String name;
    private Vehicle vehicle;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

}


    @Override
    public void makeNoise() {

    }

    @Override
    public void mount(Rideable rideable) {

        System.out.println("mounted!");

    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("dismounted!");

    }
}

