package classes;

import java.util.LinkedList;
import java.util.List;

public class Farm {

    private Farm farm;
    private FarmHouse farmHouse;
    private Field field;
    private List<Stable> stable = new LinkedList<>();
    private List<ChickenCoop> chickenCoop = new LinkedList<>();

    public Farm(FarmHouse farmHouse, Field field, List<Stable> stable, List<ChickenCoop> chickenCoop) {
        this.farmHouse = farmHouse;
        this.field = field;
        this.stable = stable;
        this.chickenCoop = chickenCoop;
    }
}
