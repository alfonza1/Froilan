package com.zipcodewilmington.froilansfarm;
import classes.*;
import interfaces.Edible;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import classes.Horse;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {


    @Test
    void MorningTest(){
        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda");

        Horse horse = new Horse();

        Edible corn = new Corn();
        Tomato tomato = new Tomato();
        EdibleEgg egg = new EdibleEgg();

        froilan.mount(horse);

        List<Edible> corns = new LinkedList<>();

        corns.add(corn);
        corns.add(corn);
        corns.add(corn);

        froilan.feedAnimal(horse,corns);

        froilan.eat(corn);

        froilan.eat(tomato);
        froilan.eat(tomato);

        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);
        froilan.eat(egg);

        froilanda.eat(corn);
        froilanda.eat(corn);

        froilanda.eat(tomato);

        froilanda.eat(egg);
        froilanda.eat(egg);

        assertEquals(8,froilan.ateAmount());
        assertEquals(5,froilanda.ateAmount());
        assertEquals(3,horse.ateAmount());

    }

    @Test //sunday
    void SundayTest() {
        // Create a Farmer object
        Farmer froilan = new Farmer("Froilan");


        // Create CropRows
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        CropRow cropRow3 = new CropRow();

        // Create different types of crops
        Crop cornStalk = new CornStalk();
        Crop tomatoPlant = new TomatoPlant();
        Crop potatoRoot = new PotatoRoot();

        // Plant crops in the CropRows
        froilan.plant(cornStalk, cropRow1);
        froilan.plant(tomatoPlant,cropRow2);
        froilan.plant(potatoRoot, cropRow3);

        // Assert that the crops have been planted in the respective CropRows
        assertTrue(cropRow1.containsCrop(cornStalk));
        assertTrue(cropRow2.containsCrop(tomatoPlant));
        assertTrue(cropRow3.containsCrop(potatoRoot));
    }



    @Test  //Monday Test
    public void MondayTest() {

            // Create a CropDuster object
        CropDuster cropDuster = new CropDuster();


        Pilot froilanda = new Pilot("Froilanda");



            // Create CropRows and crops
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        CropRow cropRow3 = new CropRow();

        froilanda.mount(cropDuster);

            // Fertilize the crop rows using the CropDuster
        cropDuster.fertilize(cropRow1);
        cropDuster.fertilize(cropRow2);
        cropDuster.fertilize(cropRow3);

        froilanda.dismount(cropDuster);

            // Assert that the crop rows have been fertilized
        assertTrue(cropRow1.isFertilized());
        assertTrue(cropRow2.isFertilized());
        assertTrue(cropRow3.isFertilized());
    }


    @Test
    void TuesdayTest() {
        // Create a Tractor object
        Tractor tractor = new Tractor();


        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda");


        // Create CropRows and crops
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        CropRow cropRow3 = new CropRow();

        // Harvest the crops using the Tractor
        tractor.harvest(cropRow1);
        tractor.harvest(cropRow2);
        tractor.harvest(cropRow3);

        // Assert that the crops have been harvested
        assertTrue(cropRow1.isHarvested());
        assertTrue(cropRow2.isHarvested());
        assertTrue(cropRow3.isHarvested());

    }


}






















