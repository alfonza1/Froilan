package classes;

import interfaces.Produce;

public class Crop implements Produce {
private boolean hasBeenFertilized;
private boolean hasBeenHarvested;

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }


    @Override
    public EdibleEgg yield() {

        return null;
    }
}
