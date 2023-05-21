package interfaces;

import classes.Person;

import java.util.LinkedList;
import java.util.List;

public interface Eater {

    void eat(Edible edible);
    void eat(List<Edible> edible);

}
