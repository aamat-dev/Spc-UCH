package fr.aamat;

import fr.aamat.view.MainView;

public class ApplicationContext {

    private final MainView mainView;
    //private User user;
    //private List<Permission> permissions;


    public ApplicationContext(MainView mainView) {
        this.mainView = mainView;
    }

    public MainView getMainView() {
        return mainView;
    }

}
