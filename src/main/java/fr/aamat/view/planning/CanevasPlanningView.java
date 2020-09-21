package fr.aamat.view.planning;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CanevasPlanningView extends VBox {

    private EntetePlanningView entetePlanningView;
    private EnteteMachineView enteteMachineView;
    private HBox hBox;
    private final int largeurCellule = 60;
    private final int hauteurCellule = 30;

    public CanevasPlanningView() {

        this.entetePlanningView = new EntetePlanningView(largeurCellule, hauteurCellule);
        this.enteteMachineView = new EnteteMachineView(largeurCellule, hauteurCellule);
        this.hBox = new HBox(enteteMachineView);

        this.getChildren().addAll(this.entetePlanningView,this.hBox);


        this.setOnMousePressed(this::handlePressed);
        this.setOnMouseReleased(this::handleReleased);
        this.setOnMouseDragged(this::handleCursorMoved);
        this.setOnMouseMoved(this::handleCursorMoved);

    }

    private void handleCursorMoved(MouseEvent mouseEvent) {
    }

    private void handleReleased(MouseEvent mouseEvent) {
    }

    private void handlePressed(MouseEvent mouseEvent) {
    }

}
