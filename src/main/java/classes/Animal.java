package classes;

import interfaces.Eater;
import interfaces.Edible;
import interfaces.NoiseMaker;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {


    private List<Edible> edible;


    public Animal() {
        this.edible = new ArrayList<>();
    }


    @Override
    public void eat(Edible edible) {
        this.edible.add(edible);
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
    public abstract void makeNoise();


    @Override
    public String toString() {
        return getClass().getSimpleName();


    }

}
