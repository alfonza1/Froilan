package food;

import interfaces.Edible;
import interfaces.Produce;

public class Tomato implements Edible, Produce {

    @Override
    public String toString() {
        return "Tomato";
    }
}
