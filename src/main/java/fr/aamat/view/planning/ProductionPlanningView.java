package fr.aamat.view.planning;


import fr.aamat.model.Production;
import javafx.scene.control.Label;

public class ProductionPlanningView extends Label {

    private final int largeurCellule = 50;
    private final int hauteurCellule = 30;
    private final Production production;

    public ProductionPlanningView(Production production) {

        this.production = production;

        this.setWidth(largeurCellule * production.getDureeProduction());
        this.setHeight(hauteurCellule);
    }
}
