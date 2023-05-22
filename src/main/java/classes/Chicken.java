package classes;

import interfaces.Edible;
import interfaces.Produce;

import java.util.List;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;


    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Chicken(){


    }

    @Override
    public void makeNoise() {

    }

    public EdibleEgg yield() {
        if (!hasBeenFertilized) {   //checks if egg has been fertilized or not - if false - returns an edible egg
            return new EdibleEgg();
        } else {
            return null;
        }
    }

    @Override
    public void eat(Edible edible) {



    }

    @Override
    public void eat(List<Edible> edible) {


    }

    @Override
    public String toString() {
        return "Chicken";
    }
}







