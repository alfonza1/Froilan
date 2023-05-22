package classes;

import interfaces.Botanist;
import interfaces.Edible;
import interfaces.Rideable;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist {


private List<Edible> edible;
private boolean mounted;

    public Farmer(String name) {
        super(name);
        this.edible = new ArrayList<>();
    }


    @Override
    public void plant(Crop crop, CropRow cropRow) {
        System.out.println(getName() + " is adding "+ crop + "to "+ cropRow);
    cropRow.add(crop);
    }


    @Override
    public void eat(Edible edible) {
        System.out.println("now eating " + edible);
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
        System.out.println("YEEEHAWWWWWWWW");
    }

    @Override
    public void mount(Rideable rideable) {
        System.out.println("Mounting" + rideable);
        mounted = true;
    }

    @Override
    public void dismount(Rideable rideable) {
if(mounted == true){
    System.out.println("Dismounting" + rideable);
    mounted = false;
}
else{
    System.out.println("No ride to dismount brokie");
}

    }


}
