package classes;

import interfaces.Rideable;

public class Vehicle implements Rideable, Noisemaker{


    public Vehicle() {

    }


    @Override
    void makeNoise(){

        System.out.println("I am a vehicle and I make noise");
    }





}
