package classes;

import interfaces.Eater;
import interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {



public Animal(){}


    @Override
    public abstract void makeNoise();
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

