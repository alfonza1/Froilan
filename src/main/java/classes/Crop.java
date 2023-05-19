package classes;

import interfaces.Produce;

public abstract class Crop implements Produce {
private boolean hasBeenFertilized;
private boolean hasBeenHarvested;

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }


//    @Override
//    public EdibleEgg yield() {
//        return null;
//    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
