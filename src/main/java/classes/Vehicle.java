package classes;


import interfaces.Rideable;
import interfaces.NoiseMaker;

public class Vehicle implements Rideable, Noisemaker{


    public Vehicle() {

    }


    @Override
   public void makeNoise(){

        System.out.println("I am a vehicle and I make noise");
    }





}
