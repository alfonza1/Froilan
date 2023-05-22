package animals;

import animals.Animal;
import interfaces.Rideable;

public class Horse extends Animal implements Rideable {


    public Horse(){

    }

    @Override
    public void makeNoise() {
        System.out.println("YEHEHEHEEEEE");
    }


    @Override
    public String toString() {
        return "Horse";
    }

}
