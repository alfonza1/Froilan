package buildings;

import animals.Horse;

import java.util.LinkedList;
import java.util.List;

public class Stable {

    private List<Horse> horses = new LinkedList<>();

    public Stable(List<Horse> horses) {
        this.horses = horses;
    }
}
