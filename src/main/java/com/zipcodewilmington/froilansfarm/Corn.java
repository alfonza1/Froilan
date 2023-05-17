package com.zipcodewilmington.froilansfarm;

public class Corn implements Edible{

    public boolean hasBeenHarvested() {
        return false;
    }

    public void harvest(String CornAmt){

        CornAmt = CornAmt + 1;

    }

}
