package classes;

import interfaces.Eater;
import interfaces.Edible;
import interfaces.NoiseMaker;


public abstract class Animal implements NoiseMaker,Eater {




public Animal(){}

    @Override
    public void eat(List<Edible> edible) {
        System.out.println("nom nom");
    }
}
