package classes;

import interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker,Eater{



public Animal(){}


    @Override
    public abstract void makeNoise();
}