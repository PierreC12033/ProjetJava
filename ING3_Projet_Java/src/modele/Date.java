/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import static java.sql.Date.valueOf;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author elias
 */
public class Date {

    private int Jour;
    private int Mois;
    private int Annee;

    /**
     * Constructeur par défault
     */
    public Date() {
        this.Jour = 0;
        this.Annee = 0;
        this.Mois = 0;
    }

    /**
     * Constructeur surchargé
     *
     * @param Jour
     * @param Mois
     * @param Annee
     */
    public Date(int Jour, int Mois, int Annee) {
        if (Jour > 0 && Jour <= 31 && Mois > 0 && Mois <= 12) {
            this.Jour = Jour;
            this.Mois = Mois;
            this.Annee = Annee;
        } else {
            System.out.println("Le format de votre Date n'est pas correct");
        }
    }

    /**
     * Constructeur selon un String
     *
     * @param date
     */
    public Date(String date) {

        java.util.Date myDate = valueOf(date);

        int Annee = myDate.getYear() + 1900;
        int Mois = myDate.getMonth() + 1;
        int Jour = myDate.getDate();

        if (Jour > 0 && Jour <= 31 && Mois > 0 && Mois <= 12) {
            this.Jour = Jour;
            this.Mois = Mois;
            this.Annee = Annee;
        } else {
            System.out.println("Le format de votre Date n'est pas correct");
        }
    }

    /**
     * Créé un String des informations de l'élément
     *
     * @return
     */
    @Override
    public String toString() {
        return Jour + "/" + Mois + "/" + Annee;
    }

    /**
     * Récupère les informations de l'élément
     *
     * @param r
     * @return
     */
    public Date recupererInfo(ResultSet r) {
        Date a = null;
        try {
            a = new Date(r.getInt(1), r.getInt(2), r.getInt(3));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return a;
    }

    /**
     * Getter de jour
     *
     * @return jour
     */
    public int getJour() {
        return Jour;
    }

    /**
     * Setter de jour
     *
     * @param Jour
     */
    public void setJour(int Jour) {
        this.Jour = Jour;
    }

    /**
     * Getter de mois
     *
     * @return
     */
    public int getMois() {
        return Mois;
    }

    /**
     * Setter de Mois
     *
     * @param Mois
     */
    public void setMois(int Mois) {
        this.Mois = Mois;
    }

    /**
     * Getter de Annee
     *
     * @return Annee
     */
    public int getAnnee() {
        return Annee;
    }

    /**
     * Setter de Annee
     *
     * @param Annee
     */
    public void setAnnee(int Annee) {
        this.Annee = Annee;
    }

}
