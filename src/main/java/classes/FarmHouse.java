package classes;

import java.util.LinkedList;
import java.util.List;

public class FarmHouse {

    private List<Person> people = new LinkedList<>();

    public FarmHouse(List<Person> people) {
        this.people = people;
    }
}
