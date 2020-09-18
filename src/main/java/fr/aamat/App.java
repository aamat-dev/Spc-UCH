package fr.aamat;

import fr.aamat.components.planning.PlanningComponent;
import fr.aamat.view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;

/**
 * JavaFX App
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {

        MainView mainView = new MainView();

        ApplicationContext context = new ApplicationContext(mainView);

        List<ApplicationComponent> components = new LinkedList<>();
        components.add(new PlanningComponent());


        for (ApplicationComponent component : components) {
            component.initState(context);
        }

        for (ApplicationComponent component : components) {
            component.initComponent(context);
        }

        stage.setTitle("SpUch - Suivi de production UCH");
        stage.getIcons().add(new Image("img/logo_UCH.png"));
        stage.setScene(new Scene(mainView, 1200, 800));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}