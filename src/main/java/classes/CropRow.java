package classes;

import interfaces.Edible;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CropRow {
    private List<Crop> crops = new LinkedList<>();
    List<Edible> bucket = new ArrayList<>();



        private boolean fertilized;

        private boolean harvest;


        public CropRow() {
            this.fertilized = false;
            this.harvest = false;
        }

    public CropRow(List<Crop> crops) {

       this.crops = new LinkedList<>();

    }


    public void add(Crop crop){
            crops.add(crop);


    }


        public void fertilize() {
            this.fertilized = true;
        }

        public boolean isFertilized() {
            return fertilized;
        }


        public void harvest(){
            this.harvest = true;
        }


        public boolean isHarvested() {
        return harvest;
        }



    public boolean containsCrop(Crop crop){

        return true;
    }


    public String getCrops() {
        for (Crop e : crops) {
            System.out.println(e);
        }
        return " ";
    }

    public void yield() {

        for (Crop crop : crops) {
            if (crop.toString().equals("CornStalk")) {
                //crops.remove(crop);
                bucket.add(new Corn());
            } else if (crop.toString().equals("TomatoPlant")) {
                bucket.add(new Tomato());
            } else if (crop.toString().equals("CarrotRoot")) {
                bucket.add(new Carrot());
            } else if (crop.toString().equals("PotatoRoot")) {
                bucket.add(new Potato());
            } else if (crop.toString().equals("PineappleTree")) {
                bucket.add(new Pineapple());
            }
        }
        System.out.println(bucket);
    }

    public List<Edible> getBucket() {
        return bucket;
    }

    @Override
    public String toString() {
        return "CropRow";
    }
}