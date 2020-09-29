package fr.aamat.components.planning.view;

import fr.aamat.components.planning.viewmodel.PlanningViewModel;
import fr.aamat.model.Machine;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;

public class EnteteMachineView extends ScrollPane {

    private final GridPane grille;
    private final ObservableList<Machine> listeMachine;

    private final int largeurCellule;
    private final int hauteurCellule;

    public EnteteMachineView(PlanningViewModel planningViewModel) {

        largeurCellule = planningViewModel.getCurrentCellSize().get().getWidthCell();
        hauteurCellule = planningViewModel.getCurrentCellSize().get().getHeightCell();

        this.vbarPolicyProperty().set(ScrollBarPolicy.NEVER);
        this.hbarPolicyProperty().set(ScrollBarPolicy.NEVER);

        this.listeMachine = FXCollections.observableArrayList(new Machine("B1", Machine.Parc.CN, true, productions), new Machine("B2", Machine.Parc.CN, true, productions));

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
