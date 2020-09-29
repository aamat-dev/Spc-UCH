package fr.aamat.components.planning.viewmodel;

import fr.aamat.components.planning.model.CellSize;
import fr.aamat.util.observable.Property;

public class PlanningViewModel {

    Property<CellSize> currentCellSize = new Property<>(new CellSize(60, 30));

    public Property<CellSize> getCurrentCellSize() {
        return currentCellSize;
    }
}
