package farm;

import farm.Crop;
import food.*;
import interfaces.Edible;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CropRow {
    private List<Crop> crops = new LinkedList<>();
    //private List<Edible> bucket = new ArrayList<>();
    private boolean fertilized;
    private boolean harvest;


        public CropRow() {
            this.fertilized = false;
            this.harvest = false;
        }

    public CropRow(List<Crop> crops) {

       this.crops = crops;
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
        List<Edible> bucket = new ArrayList<>();
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

//    public void getBucket() {
//        for (Edible w: bucket) {
//            System.out.println(w);
//        }
//
//    }

    @Override
    public String toString() {
        return "CropRow";
    }
}