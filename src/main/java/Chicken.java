public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;


    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Chicken(){


    }

    public EdibleEgg yield() {
        if (!hasBeenFertilized) {   //checks if egg has been fertilized or not - if false - returns an edible egg
            return new EdibleEgg();
        } else {
            return null;
        }
    }
}






}
