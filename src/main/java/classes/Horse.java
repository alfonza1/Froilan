package classes;

import interfaces.Edible;
import interfaces.Rideable;

public class Horse extends Animal implements Rideable {


    public Horse(){

    }

    @Override
    public void makeNoise() {

    }


    @Override
    public String toString() {
        return "Horse";
    }

    @Override
    public void eat(Edible edible) {

        hasAte();
    }
}
