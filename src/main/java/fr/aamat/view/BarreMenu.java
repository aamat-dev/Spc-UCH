package fr.aamat.view;

import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BarreMenu extends MenuBar {

    public BarreMenu() {

        //Menu Fichier
        MenuItem fermer = new MenuItem("Fermer");
        fermer.setGraphic(new ImageView(new Image("img/close_icon.png", 25, 25, false, false)));
        fermer.setOnAction(e -> System.exit(0));

        Menu fichier = new Menu("Fichier");
        fichier.getItems().add(fermer);
        this.getMenus().add(fichier);

        //Menu Edition
        MenuItem aVoir = new MenuItem("A voir...");

        Menu edition = new Menu("Edition");
        edition.getItems().add(aVoir);
        this.getMenus().add(edition);

        //Menu Aide
        MenuItem aPropos = new MenuItem("A propos de...");
        aPropos.setOnAction(e -> afficherApropos());

        Menu aide = new Menu("Aide");
        aide.getItems().add(aPropos);
        this.getMenus().add(aide);





    }

    private void afficherApropos() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("A propos de...");
        alert.setHeaderText("Information sur le logiciel");
        alert.setContentText("Logiciel dévellopé par Alexandre AMAT, n'hésitez pas à le contacter en cas de propblème.");
        alert.showAndWait();
    }


}
