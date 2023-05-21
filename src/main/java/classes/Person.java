package classes;


import interfaces.Eater;
import interfaces.NoiseMaker;


import interfaces.Rideable;
import interfaces.Rider;

import enums.DaysOfTheWeek;
import interfaces.*;

import java.util.List;


public abstract class Person implements NoiseMaker, Eater, Rider {
    private static DaysOfTheWeek day;
    private String name;
    private Vehicle vehicle;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }




    @Override
    public void makeNoise() {


    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDay() {
        return "Today is " + Person.day;
    }

    public static void setDay(DaysOfTheWeek day) {
        Person.day = day;

    }

    public void feedAnimal(Animal animal, List<Edible> edible){
    System.out.println(animal + "is eating" + edible);
        animal.eat(edible);
}

}

