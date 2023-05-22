package classes;

import classes.Person;
import interfaces.Edible;
import interfaces.Rideable;
import interfaces.Rider;

import java.util.ArrayList;
import java.util.List;

public class Pilot extends Person implements Rider {


    private List<Edible> edible;
    private boolean mounted;

    public Pilot(String name) {
        super(name);
        this.edible = new ArrayList<>();
    }


    @Override
    public void eat(Edible edible) {
        this.edible.add(edible);
        hasAte();
    }

    @Override
    public void eat(List<Edible> edible) {
        this.edible = edible;

    }
    public int ateAmount() {
        int i = 0;
        for(Edible edible: edible){
            i++;

        }
        return i;

    }

    @Override
    public void makeNoise() {
        System.out.println("hello there im finna fly");
    }

    @Override
    public void mount(Rideable rideable) {
        System.out.println("Mounting " + rideable);
        mounted = true;
    }

    @Override
    public void dismount(Rideable rideable) {
        if(mounted == true){
            System.out.println("Dismounting " + rideable);
mounted = false;
        }
        else{
            System.out.println("No ride to dismount brokie");
        }

    }
}

