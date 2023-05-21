package classes;

import interfaces.Produce;

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
    public void canEat() {

    }

    @Override
    public String toString() {
        return "Chicken";
    }
}







