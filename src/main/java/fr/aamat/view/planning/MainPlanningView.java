package fr.aamat.view.planning;

import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class MainPlanningView extends BorderPane {

    public MainPlanningView() {

        this.getStylesheets().add(getClass().getResource("/style/planningStyle.css").toExternalForm());

        /*---------------------------------
        Barre d'outils
        ----------------------------------*/
        ToolBar toolBar = new ToolBar();
        Button maintenant = new Button("Maintenant");
        toolBar.getItems().add(maintenant);
        this.setTop(toolBar);

        /*---------------------------------
        Barre Canevas planning
        ----------------------------------*/
        CanevasPlanningView grillePlanning = new CanevasPlanningView();
        this.setCenter(grillePlanning);

    }
}


