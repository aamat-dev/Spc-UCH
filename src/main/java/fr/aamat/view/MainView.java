package fr.aamat.view;

import fr.aamat.components.planning.view.MainPlanningView;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    public MainView() {
        this.getStylesheets().add(getClass().getResource("/style/globalStyle.css").toExternalForm());
        this.setTop(new BarreMenu(this));
        this.setCenterContent(new MainPlanningView());
    }

    public void setCenterContent(Node content) {
        this.setCenter(content);
    }
}
