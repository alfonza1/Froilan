package classes;

import interfaces.Edible;
import interfaces.Produce;

public class Corn implements Edible, Produce {


//    @Override
//    public EdibleEgg yield() {
//        return null;
//    }


    public Corn() {
    }

    @Override
    public String toString() {
        return "Corn";
    }
}
