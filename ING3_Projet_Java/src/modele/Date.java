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

    public Date() {
        this.Jour = 0; 
        this.Annee = 0;
        this.Mois = 0;
    }

    public Date(int Jour, int Mois, int Annee) {
        if(Jour >0 && Jour <= 31 && Mois > 0 && Mois <= 12){
           this.Jour = Jour;
           this.Mois = Mois;
           this.Annee = Annee;
        }else{
            System.out.println("Le format de votre Date n'est pas correct");
        }
    }
    
    public Date(String date){
        
        java.util.Date myDate = valueOf(date);

        int Annee = myDate.getYear() + 1900;
        int Mois = myDate.getMonth() + 1;
        int Jour = myDate.getDate();
        
        if(Jour >0 && Jour <= 31 && Mois > 0 && Mois <= 12){
           this.Jour = Jour;
           this.Mois = Mois;
           this.Annee = Annee;
        }else{
            System.out.println("Le format de votre Date n'est pas correct");
        }
    }

    @Override
    public String toString() {
        return Jour + "/" + Mois + "/" + Annee;
    }
    
    public Date recupererInfo(ResultSet r){ 
        Date a = null;
        try{
            a=new Date(r.getInt(1), r.getInt(2), r.getInt(3));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
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
