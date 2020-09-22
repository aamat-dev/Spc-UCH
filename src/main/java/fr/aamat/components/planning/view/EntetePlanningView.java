package fr.aamat.components.planning.view;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class EntetePlanningView extends ScrollPane {

    private final GridPane grille;
    private final Integer largeurCellule;
    private final Integer hauteurCellule;

    private final Year anneeCourante = Year.now();
    private final int nbJourAnnee = anneeCourante.length();
    private Month moisCourant;

    private int indexMois = 1;
    private int semaineCourante;
    private int indexSemaine;

    public EntetePlanningView(Integer largeurCellule, Integer hauteurCellule) {

        this.vbarPolicyProperty().set(ScrollBarPolicy.NEVER);
        this.hbarPolicyProperty().set(ScrollBarPolicy.NEVER);

        this.largeurCellule = largeurCellule;
        this.hauteurCellule = hauteurCellule;

        this.grille = new GridPane();
        setEnTete();
        this.setContent(grille);


    }

    private void setEnTete() {

        for (int i = 1; i <= nbJourAnnee; i++) { //boucle pour passer tout les jours de l'année
            LocalDate jour = anneeCourante.atDay(i); //jour i

            //------------Ligne mois-------------
            if (!jour.getMonth().equals(moisCourant)) { //Création du mois si n'est pas déjà présent
                moisCourant = jour.getMonth(); //Récupère le mois
                String txtMois = moisCourant.getDisplayName(TextStyle.FULL, Locale.FRANCE) + " " + anneeCourante.toString(); //Définir le nom du mois + annee à afficher
                Label lbMois = new Label(txtMois); // Crée le label mois
                lbMois.getStyleClass().add("mois"); // lie la classe css mois au label
                int lgMois = moisCourant.length(anneeCourante.isLeap()); // calcul la largeur du label
                lbMois.setPrefSize(largeurCellule * lgMois, hauteurCellule); // défini la dimension du label
                this.grille.add(lbMois, indexMois, 0, lgMois, 1); // ajoute le label à la grille
                indexMois += lgMois; //index de position du label mois
            }

            //-------------Ligne semaine--------------
            TemporalField semaine = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear(); //Récupère la semaine
            int weekNumber = jour.get(semaine); // Récupère le n° de la semaine
            if (weekNumber != semaineCourante) {
                semaineCourante = weekNumber;
                int lgSemaine = 8 - jour.getDayOfWeek().getValue(); // nombre jour dans la semaine
                indexSemaine += lgSemaine; // index de position de la semaine
                if (indexSemaine > nbJourAnnee) {
                    lgSemaine = nbJourAnnee - indexSemaine + lgSemaine; // calcul du nbr de jour à afficher pour la dernière semaine de l'année
                }
                Label lbSemaine = new Label("S" + weekNumber); // Crée le label semaine
                lbSemaine.setPrefSize(largeurCellule * lgSemaine, hauteurCellule); // Défini la taille du label semaine
                lbSemaine.getStyleClass().add("semaine"); // Lie la classe css au label semaine
                this.grille.add(lbSemaine, i, 1, lgSemaine, 1); // Ajouter le label semaine à la grille
            }

            //----------------Ligne jour -----------------
            String txtJour = jour.format(DateTimeFormatter.ofPattern("dd")) + " " + jour.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.FRANCE);
            Label lbJour = new Label(txtJour);
            lbJour.getStyleClass().add("jour");
            lbJour.setPrefSize(largeurCellule, hauteurCellule);
            this.grille.add(lbJour, i, 2);
            if (jour.getDayOfWeek().getValue() == 6 || jour.getDayOfWeek().getValue() == 7) {
                lbJour.getStyleClass().add("weekend");
            }
        }
    }
}
