package classes;

import interfaces.Edible;

public class Corn implements Edible {

    public boolean hasBeenHarvested() {

        return false;
    }

    public int harvest(int CornAmt){

        CornAmt = CornAmt + 1;

        return CornAmt;

    }

}
