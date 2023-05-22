package classes;

import interfaces.Edible;
import interfaces.Produce;

public class EdibleEgg implements Edible, Produce {

    @Override
    public String toString() {
        return "EdibleEgg";
    }
}
