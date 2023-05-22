package classes;

import interfaces.Edible;
import interfaces.Produce;
import java.util.ArrayList;
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
        System.out.println("BA BA BAAAAKKK");
    }

    public void yield() {
        List<Edible> bucket = new ArrayList<>();

        bucket.add(new EdibleEgg());

        System.out.println(bucket);

        }


    @Override
    public String toString() {
        return "Chicken";
    }
}







