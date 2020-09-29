package fr.aamat;

import fr.aamat.util.state.StateRegistry;
import fr.aamat.view.MainView;

public class ApplicationContext {

    private final MainView mainView;
    private final StateRegistry stateRegistry;
    //private User user;
    //private List<Permission> permissions;


    public ApplicationContext(MainView mainView, StateRegistry stateRegistry) {
        this.mainView = mainView;
        this.stateRegistry = stateRegistry;
    }

    public StateRegistry getStateRegistry() {
        return stateRegistry;
    }

    public MainView getMainView() {
        return mainView;
    }

}
