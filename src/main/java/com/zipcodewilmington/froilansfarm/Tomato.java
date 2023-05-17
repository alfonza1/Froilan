package com.zipcodewilmington.froilansfarm;

public class Tomato implements Edible{

    public boolean hasBeenHarvested() {
        return false;
    }

    public void harvest(String tomatoAmt){

        tomatoAmt = tomatoAmt + 1;

    }

}
