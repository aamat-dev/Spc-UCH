package fr.aamat.components.planning.view;

import fr.aamat.components.planning.model.CellSize;
import fr.aamat.components.planning.viewmodel.PlanningViewModel;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.BorderPane;

public class MainPlanningView extends BorderPane {

    private final PlanningViewModel planningViewModel;

    public MainPlanningView(PlanningViewModel planningViewModel) {

        this.planningViewModel = planningViewModel;
        this.planningViewModel.getCurrentCellSize().listen(this::setDrawPlanning);

        this.setOnScroll(this::setScale);

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
        setDrawPlanning(this.planningViewModel.getCurrentCellSize().get());
    }

    private void setDrawPlanning(CellSize cellSize) {
        CanevasPlanningView canevasPlanningView = new CanevasPlanningView(this.planningViewModel);
        this.setCenter(canevasPlanningView);
    }

    private void setScale(ScrollEvent scrollEvent) {
        int width;
        int height;
        if (scrollEvent.getDeltaY() < 0) {
            width = this.planningViewModel.getCurrentCellSize().get().getWidthCell() + 10;
            height = this.planningViewModel.getCurrentCellSize().get().getHeightCell() + 1;
        } else {
            width = this.planningViewModel.getCurrentCellSize().get().getWidthCell() - 10;
            height = this.planningViewModel.getCurrentCellSize().get().getHeightCell() - 1;
        }
        this.planningViewModel.getCurrentCellSize().set(new CellSize(width, height));
    }
}


