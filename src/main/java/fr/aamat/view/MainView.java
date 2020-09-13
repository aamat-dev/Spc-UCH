package fr.aamat.view;

import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    public MainView() {
        this.setPrefSize(1000,600);
        this.setTop(new BarreMenu());
    }
}
