package food;

import interfaces.Edible;
import interfaces.Produce;

public class Potato implements Edible, Produce {

    @Override
    public String toString() {
        return "Potato";
    }
}
