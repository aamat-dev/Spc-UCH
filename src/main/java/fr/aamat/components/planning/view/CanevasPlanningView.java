package fr.aamat.components.planning.view;

import fr.aamat.components.planning.model.CellSize;
import fr.aamat.components.planning.viewmodel.PlanningViewModel;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CanevasPlanningView extends VBox {

    private final EntetePlanningView entetePlanningView;
    private final EnteteMachineView enteteMachineView;
    private final HBox hBox;
    private final ScrollBar scrollBar;

    public CanevasPlanningView(PlanningViewModel planningViewModel) {

        //planningViewModel.getCurrentCellSize().listen(this::setMargin);

        this.entetePlanningView = new EntetePlanningView(planningViewModel);
        this.enteteMachineView = new EnteteMachineView(planningViewModel);
        this.hBox = new HBox(enteteMachineView);
        this.scrollBar = new ScrollBar();

        this.getChildren().addAll(this.entetePlanningView, this.hBox, this.scrollBar);;

        this.setOnMousePressed(this::handlePressed);
        this.setOnMouseReleased(this::handleReleased);
        this.setOnMouseDragged(this::handleCursorMoved);

    }

    private void handleCursorMoved(MouseEvent mouseEvent) {
    }

    private void handleReleased(MouseEvent mouseEvent) {
    }

    private void handlePressed(MouseEvent mouseEvent) {
    }

    private void setMargin(CellSize cellSize) {
        setMargin(entetePlanningView, new Insets(0, 0, 0, cellSize.getWidthCell()+1));
    }


}
