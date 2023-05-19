package classes;

import interfaces.NoiseMaker;
import interfaces.Rideable;

public class Vehicle implements Rideable, NoiseMaker{


    public Vehicle() {

    }


    @Override
   public void makeNoise(){

        System.out.println("I am a vehicle and I make noise");
    }





}
