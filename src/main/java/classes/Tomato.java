package classes;

import interfaces.Edible;

public class Tomato implements Edible {

    public boolean hasBeenHarvested() {

        return false;
    }

    public int harvest(int tomatoAmt){

        tomatoAmt = tomatoAmt + 1;

        return tomatoAmt;

    }

}
