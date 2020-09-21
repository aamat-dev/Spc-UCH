package fr.aamat.model;

public class Machine {

    private String nom;
    private Parc parc;
    private Boolean etat;

    public Machine(String nom, Parc parc, Boolean etat) {
        this.nom = nom;
        this.parc = parc;
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Parc getParc() {
        return parc;
    }

    public void setParc(Parc parc) {
        this.parc = parc;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public enum Parc {CN, Mecanique}
}
