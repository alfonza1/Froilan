package people;

import animals.Animal;
import vehicles.Vehicle;
import enums.DaysOfTheWeek;
import interfaces.*;

import java.util.List;

public abstract class Person implements NoiseMaker, Eater, Rider {
    private static DaysOfTheWeek day;
    private String name;
    private Vehicle vehicle;
    private boolean hasAte = false;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
<<<<<<< HEAD
    System.out.println("Now feeding the " + animal + " " + edible);

=======
    System.out.println(animal + " is eating " + edible);
    animal.eat(edible);
>>>>>>> master
    }

    public boolean hasAte(){
        hasAte = true;
        return hasAte;
    }


}



