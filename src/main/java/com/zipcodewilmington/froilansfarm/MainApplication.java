package com.zipcodewilmington.froilansfarm;

import classes.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

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

        Chicken[] chick = new Chicken[15];

        for (int i = 0; i < chick.length; i++){

            chick[i] = new Chicken();

        }

        LinkedList<Chicken> coopOne = new LinkedList<>();
        LinkedList<Chicken> coopTwo = new LinkedList<>();
        LinkedList<Chicken> coopThree = new LinkedList<>();
        LinkedList<Chicken> coopFour = new LinkedList<>();


        ChickenCoop[] coops = new ChickenCoop[4];
        coops[0] = new ChickenCoop(List.of(new Chicken[]{chick[0], chick[1], chick[2], chick[3]}));
        coops[1] = new ChickenCoop(List.of(new Chicken[]{chick[5], chick[6], chick[7], chick[8]}));
        coops[2] = new ChickenCoop(List.of(new Chicken[]{chick[10], chick[11], chick[12], chick[13]}));
        coops[3] = new ChickenCoop(List.of(new Chicken[]{chick[4], chick[9], chick[14]}));


            }

        }






