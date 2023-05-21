package com.zipcodewilmington.froilansfarm;

import classes.*;
import enums.DaysOfTheWeek;
import interfaces.Aircraft;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        System.out.println(1);



        

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



//        System.out.println(cropRow1.getCrops());
//        System.out.println(cropRow2.getCrops());
//        System.out.println(cropRow3.getCrops());
//        System.out.println(cropRow4.getCrops());
//        System.out.println(cropRow5.getCrops());

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

        List<Chicken> chickenCoop1 = new LinkedList<>();
        List<Chicken> chickenCoop2 = new LinkedList<>();
        List<Chicken> chickenCoop3 = new LinkedList<>();
        List<Chicken> chickenCoop4 = new LinkedList<>();

        Chicken chicken = new Chicken();

        chickenCoop1.add(chicken);
        chickenCoop1.add(chicken);
        chickenCoop1.add(chicken);
        chickenCoop1.add(chicken);

        chickenCoop2.add(chicken);
        chickenCoop2.add(chicken);
        chickenCoop2.add(chicken);
        chickenCoop2.add(chicken);

        chickenCoop3.add(chicken);
        chickenCoop3.add(chicken);
        chickenCoop3.add(chicken);
        chickenCoop3.add(chicken);

        chickenCoop4.add(chicken);
        chickenCoop4.add(chicken);
        chickenCoop4.add(chicken);

        List<Horse> stable1 = new LinkedList<>();
        List<Horse> stable2 = new LinkedList<>();
        List<Horse> stable3 = new LinkedList<>();

        Horse horse = new Horse();

        stable1.add(horse);
        stable1.add(horse);
        stable1.add(horse);

        stable2.add(horse);
        stable2.add(horse);
        stable2.add(horse);

        stable3.add(horse);
        stable3.add(horse);
        stable3.add(horse);
        stable3.add(horse);

        System.out.println("-------------------------");
        System.out.println(chickenCoop1);
        System.out.println(chickenCoop2);
        System.out.println(chickenCoop3);
        System.out.println(chickenCoop4);

        System.out.println(stable1);
        System.out.println(stable2);
        System.out.println(stable3);

        System.out.println("-------------------------");

        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda");








        List<Person> farmers = new LinkedList<>();
        farmers.add(froilan);
        farmers.add(froilanda);

        FarmHouse farmHouse = new FarmHouse(farmers);













        froilanda.setVehicle(cropDuster);
        froilanda.mount(cropDuster);
        cropDuster.fly();
        cropDuster.makeNoise();

        froilan.setVehicle(tractor);
        froilan.mount(tractor);
        tractor.makeNoise();

        Person.setDay(DaysOfTheWeek.Monday);
        System.out.println(froilan.getDay());
        System.out.println(froilanda.getDay());













        }























    }


