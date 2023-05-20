package com.zipcodewilmington.froilansfarm;

import classes.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CarrotRoot carrotRoot = new CarrotRoot();
        PotatoRoot potatoRoot = new PotatoRoot();
        PineappleTree pineappleTree = new PineappleTree();

        List<Crop> crop1 = new LinkedList<>();
        crop1.add(cornStalk);
        crop1.add(cornStalk);
        crop1.add(cornStalk);

        List<Crop> crop2 = new LinkedList<>();
        crop2.add(tomatoPlant);
        crop2.add(tomatoPlant);
        crop2.add(tomatoPlant);

        List<Crop> crop3 = new LinkedList<>();
        crop3.add(carrotRoot);
        crop3.add(carrotRoot);
        crop3.add(carrotRoot);

        List<Crop> crop4 = new LinkedList<>();
        crop4.add(potatoRoot);
        crop4.add(potatoRoot);
        crop4.add(potatoRoot);

        List<Crop> crop5 = new LinkedList<>();
        crop5.add(pineappleTree);
        crop5.add(pineappleTree);
        crop5.add(pineappleTree);

        CropRow cropRow1 = new CropRow(crop1);
        CropRow cropRow2 = new CropRow(crop2);
        CropRow cropRow3 = new CropRow(crop3);
        CropRow cropRow4 = new CropRow(crop4);
        CropRow cropRow5 = new CropRow(crop5);

        System.out.println(cropRow1.getCrops());
        System.out.println(cropRow2.getCrops());
        System.out.println(cropRow3.getCrops());
        System.out.println(cropRow4.getCrops());
        System.out.println(cropRow5.getCrops());

        cropRow1.yield();
        cropRow2.yield();
        cropRow3.yield();
        cropRow4.yield();
        cropRow5.yield();



    }

}
