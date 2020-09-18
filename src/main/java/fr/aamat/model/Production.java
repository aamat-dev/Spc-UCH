package fr.aamat.model;

import java.util.Date;

public class Production {

    private Reference reference;
    private Machine machine;
    private Date dateDebut;
    private Integer dureeProduction;
    private Integer dureeReglage;
    private Etat etat;

    public Production(Reference reference, Machine machine, Date dateDebut, Integer dureeProduction, Integer dureeReglage, Etat etat) {
        this.reference = reference;
        this.machine = machine;
        this.dateDebut = dateDebut;
        this.dureeProduction = dureeProduction;
        this.dureeReglage = dureeReglage;
        this.etat = etat;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Integer getDureeProduction() {
        return dureeProduction;
    }

    public void setDureeProduction(Integer dureeProduction) {
        this.dureeProduction = dureeProduction;
    }

    public Integer getDureeReglage() {
        return dureeReglage;
    }

    public void setDureeReglage(Integer dureeReglage) {
        this.dureeReglage = dureeReglage;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    private enum Etat {Confirmee, Previsionnelle, Cloturee}
}
