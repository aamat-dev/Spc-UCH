package fr.aamat.components.planning.model;

public class CellSize {

    private final int widthCell;
    private final int heightCell;

    public CellSize(int widthCell, int heightCell) {
        this.widthCell = widthCell;
        this.heightCell = heightCell;
    }

    public int getWidthCell() {
        return widthCell;
    }

    public int getHeightCell() {
        return heightCell;
    }
}
