/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author elias
 */
public class Date {
    private int Jour;
    private int Mois;
    private int Annee;

    public Date() {
    }

    public Date(int Jour, int Mois, int Annee) {
        this.Jour = Jour;
        this.Mois = Mois;
        this.Annee = Annee;
    }
    
    public int getJour() {
        return Jour;
    }

    public void setJour(int Jour) {
        this.Jour = Jour;
    }

    public int getMois() {
        return Mois;
    }

    public void setMois(int Mois) {
        this.Mois = Mois;
    }

    public int getAnnee() {
        return Annee;
    }

    public void setAnnee(int Annee) {
        this.Annee = Annee;
    }
    
    
}
