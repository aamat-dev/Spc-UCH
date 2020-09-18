package fr.aamat.view;

import fr.aamat.view.planning.MainPlanningView;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class MainView extends BorderPane {

    public MainView() {
        this.getStylesheets().add("style/globalStyle.css");
        this.setTop(new BarreMenu(this));
        this.setCenterContent(new MainPlanningView());
    }

    public void setCenterContent(Node content) {
        this.setCenter(content);
    }
}
