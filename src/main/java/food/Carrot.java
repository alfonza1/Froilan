package food;

import interfaces.Edible;
import interfaces.Produce;

public class Carrot implements Edible, Produce {

    @Override
    public String toString() {
        return "Carrot";
    }
}
