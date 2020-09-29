package fr.aamat.model;

import java.util.List;

public class Machine {

    private String nom;
    private Parc parc;
    private Boolean etat;
    private List<Production> productions;

    public Machine(String nom, Parc parc, Boolean etat, List<Production> productions) {
        this.nom = nom;
        this.parc = parc;
        this.etat = etat;
        this.productions = productions;
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

    public List<Production> getProductions() {
        return productions;
    }

    public void setProductions(List<Production> productions) {
        this.productions = productions;
    }

    public enum Parc {CN, Mecanique}
}
