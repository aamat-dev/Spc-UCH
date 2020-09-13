package fr.aamat;

import fr.aamat.view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
        MainView mainView = new MainView();
        stage.setScene(new Scene(mainView));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}