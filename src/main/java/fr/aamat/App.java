package fr.aamat;

import fr.aamat.components.planning.viewmodel.PlanningComponent;
import fr.aamat.util.state.StateRegistry;
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

        StateRegistry stateRegistry = new StateRegistry();
        MainView mainView = new MainView();

        ApplicationContext context = new ApplicationContext(mainView, stateRegistry);

        List<ApplicationComponent> components = new LinkedList<>();
        components.add(new PlanningComponent());


        for (ApplicationComponent component : components) {
            component.initState(context);
        }

        for (ApplicationComponent component : components) {
            component.initComponent(context);
        }



        stage.setTitle("SpUch - Suivi de production UCH");
        stage.getIcons().add(new Image(getClass().getResource("/img/logo_UCH.png").toExternalForm()));
        stage.setScene(new Scene(mainView, 1200, 800));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}