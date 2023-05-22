package farm;

import farm.CropRow;

import java.util.LinkedList;
import java.util.List;

public class Field {

    private List<CropRow> cropRow = new LinkedList<>();

    public Field(List<CropRow> cropRow) {
        this.cropRow = cropRow;
    }
}
