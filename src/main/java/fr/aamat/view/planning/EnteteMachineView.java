package fr.aamat.view.planning;

import fr.aamat.model.Machine;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;

import java.util.Collection;
import java.util.List;

public class EnteteMachineView extends ScrollPane {

    private final int largeurCellule;
    private final int hauteurCellule;
    private GridPane grille;

    private ObservableList<Machine> listeMachine;

    public EnteteMachineView(int largeurCellule, int hauteurCellule) {

        this.listeMachine = FXCollections.observableArrayList(new Machine("B1", Machine.Parc.CN,true),new Machine("B2", Machine.Parc.CN,true));

        this.largeurCellule = largeurCellule;
        this.hauteurCellule = hauteurCellule;

        this.grille = new GridPane();
        setEnteteMachine();
        this.setContent(grille);
    }

    private void setEnteteMachine() {

        int indexLigne;

        //-----------------Ligne par Machine------------------
        for (Machine machine : listeMachine) {
            Label lbMachine = new Label(machine.getNom());
            lbMachine.setPrefSize(largeurCellule, hauteurCellule);
            lbMachine.getStyleClass().add("machine");
            indexLigne = listeMachine.indexOf(machine) + 3;
            this.grille.add(lbMachine, 0, indexLigne);
        }
    }

}
