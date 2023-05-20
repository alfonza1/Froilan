package classes;

import java.util.LinkedList;
import java.util.List;

public class ChickenCoop {

    private static List<Chicken> chickens = new LinkedList<>();

    public ChickenCoop(List<Chicken> chickens) {

        this.chickens = chickens;
    }

    public static void addChick(Chicken chick){

        chickens.add(chick);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
