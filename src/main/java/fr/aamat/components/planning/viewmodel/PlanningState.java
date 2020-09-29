package fr.aamat.components.planning.viewmodel;

import fr.aamat.components.planning.model.CellSize;
import fr.aamat.util.observable.Property;

public class PlanningState {

    private final Property<CellSize> planningCellSize = new Property<>();

    public Property<CellSize> getPlanningCellSize() {
        return planningCellSize;
    }
}
