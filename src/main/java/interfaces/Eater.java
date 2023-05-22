package interfaces;

import java.util.List;

public interface Eater {

    void eat(Edible edible);
    void eat(List<Edible> edible);

}
