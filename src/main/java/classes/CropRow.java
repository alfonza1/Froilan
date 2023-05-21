package classes;

import interfaces.Edible;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CropRow {
    private List<Crop> crops = new LinkedList<>();

        private boolean fertilized;

        public CropRow() {
            this.fertilized = false;
        }

        public void fertilize() {
            this.fertilized = true;
        }

        public boolean isFertilized() {
            return fertilized;
        }












    public CropRow(List<Crop> crops) {
        this.crops = crops;
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
}