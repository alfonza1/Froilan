package com.zipcodewilmington.froilansfarm;
import classes.*;
import enums.DaysOfTheWeek;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import classes.Horse;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {


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

            // Create CropRows and crops
            CropRow cropRow1 = new CropRow();
            CropRow cropRow2 = new CropRow();
            CropRow cropRow3 = new CropRow();

            // Fertilize the crop rows using the CropDuster
            cropDuster.fertilize(cropRow1);
            cropDuster.fertilize(cropRow2);
            cropDuster.fertilize(cropRow3);

            // Assert that the crop rows have been fertilized
            assertTrue(cropRow1.isFertilized());
            assertTrue(cropRow2.isFertilized());
            assertTrue(cropRow3.isFertilized());
        }

    @Test
    void testTractorHarvestCropRows() {
        // Create a Tractor object
        Tractor tractor = new Tractor();

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






