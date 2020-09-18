package fr.aamat.view.planning;

import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Affine;

public class CanevasPlanningView extends Pane {

    private final Canvas canvas;
    private final Affine affine;

    public CanevasPlanningView() {
        this.canvas = new Canvas(800, 400);
        this.canvas.setOnMousePressed(this::handlePressed);
        this.canvas.setOnMouseReleased(this::handleReleased);
        this.canvas.setOnMouseDragged(this::handleCursorMoved);
        this.canvas.setOnMouseMoved(this::handleCursorMoved);

        this.canvas.widthProperty().bind(this.widthProperty());
        this.canvas.heightProperty().bind(this.heightProperty());

        this.getChildren().add(this.canvas);

        this.affine = new Affine();
        this.affine.appendScale(400 / 10f, 400 / 10f);

    }

    private void handleCursorMoved(MouseEvent mouseEvent) {
    }

    private void handleReleased(MouseEvent mouseEvent) {
    }

    private void handlePressed(MouseEvent mouseEvent) {
    }

}
