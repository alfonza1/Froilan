package farm;

import buildings.ChickenCoop;
import buildings.FarmHouse;
import buildings.Stable;

import java.util.LinkedList;
import java.util.List;

public class Farm {

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
