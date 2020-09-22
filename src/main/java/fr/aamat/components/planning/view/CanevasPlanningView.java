package fr.aamat.components.planning.view;

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

    private final Integer largeurCellule = 60;
    private final Integer hauteurCellule = 30;

    public CanevasPlanningView() {

        this.entetePlanningView = new EntetePlanningView(largeurCellule, hauteurCellule);
        this.enteteMachineView = new EnteteMachineView(largeurCellule, hauteurCellule);
        this.hBox = new HBox(enteteMachineView);
        this.scrollBar = new ScrollBar();

        this.getChildren().addAll(this.entetePlanningView, this.hBox, this.scrollBar);

        setMargin(entetePlanningView, new Insets(0, 0, 0, largeurCellule + 1));

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
