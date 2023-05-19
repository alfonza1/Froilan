package classes;

import interfaces.Edible;

public class Tomato implements Edible {

    public boolean hasBeenHarvested() {
        return false;
    }

    public void harvest(String tomatoAmt){

        tomatoAmt = tomatoAmt + 1;

    }

}
