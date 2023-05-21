package com.zipcodewilmington.froilansfarm;
import classes.CropDuster;
import classes.CropRow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

        @Test  //Monday Test
      public void testCropDusterFertilizeCropRows() {
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

        // Add more test cases for other Monday-specific tasks

    }






