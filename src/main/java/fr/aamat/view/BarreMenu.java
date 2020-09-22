package fr.aamat.view;

import fr.aamat.components.planning.view.MainPlanningView;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BarreMenu extends MenuBar {

    private final MainView mainView;

    public BarreMenu(MainView mainView) {

        this.mainView = mainView;

        //Menu Fichier
        MenuItem fermer = new MenuItem("Fermer");
        fermer.setGraphic(new ImageView(new Image(getClass().getResource("/img/close_icon.png").toExternalForm(),25,25,true,false)));
        fermer.setOnAction(e -> System.exit(0));

        Menu fichier = new Menu("Fichier");
        fichier.getItems().add(fermer);
        this.getMenus().add(fichier);

        //Menu Edition
        MenuItem planning = new MenuItem("Planning");
        planning.setOnAction(e -> showPlanning());

        Menu edition = new Menu("Edition");
        edition.getItems().add(planning);
        this.getMenus().add(edition);

        //Menu Aide
        MenuItem about = new MenuItem("A propos de...");
        about.setOnAction(e -> showAbout());

        Menu aide = new Menu("Aide");
        aide.getItems().add(about);
        this.getMenus().add(aide);

    }

    private void showPlanning() {
        mainView.setCenterContent(new MainPlanningView());
    }

    private void showAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("A propos de...");
        alert.setHeaderText("Information sur le logiciel");
        alert.setContentText("Logiciel dévellopé par Alexandre AMAT, n'hésitez pas à le contacter en cas de propblème.");
        alert.showAndWait();
    }


}
