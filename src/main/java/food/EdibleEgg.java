package food;

import interfaces.Edible;
import interfaces.Produce;

public class EdibleEgg implements Edible, Produce {

    @Override
    public String toString() {
        return "Edible Egg";
    }
}
