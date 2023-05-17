package com.zipcodewilmington.froilansfarm;

public abstract class Animal implements NoiseMaker,Eater{



public Animal(){}


    @Override
    public void makeNoise() {
        System.out.println("Animal noise");
    }
}
