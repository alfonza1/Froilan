package classes;

import interfaces.Eater;
import interfaces.Edible;
import interfaces.NoiseMaker;

import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {

    private boolean hasAte = false;

    public Animal() {
    }

    @Override
    public abstract void makeNoise();


    @Override
    public void eat(List<Edible> edible) {
        System.out.println("nom nom");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();


    }
    public boolean hasAte(){
        hasAte = true;
        return hasAte;

    @Override
    public void eat(List<Edible> edible) {

    System.out.println("nom nom");

    }
}
