package food;

import farm.Crop;

public class CornStalk extends Crop {

    public boolean hasBeenFertilized(){

        return false;
    }

    public void harvest(){
        new Corn();
    }


}
