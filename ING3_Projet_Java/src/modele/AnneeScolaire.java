/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author elias
 */
public class AnneeScolaire {
    private int id;
    private int AnneeDebut;
    private int AnneeFin;

    public AnneeScolaire() {
    }

    public AnneeScolaire(int id, int AnneeDebut, int AnneeFin) {
        this.id = id;
        this.AnneeDebut = AnneeDebut;
        this.AnneeFin = AnneeFin;
    }
    
    public String ajouterBDD(){
        return "INSERT INTO AnneeScolaire VALUES("+this.id+",'"+this.AnneeDebut+"',"+this.AnneeFin+")";
    }
    
    @Override
    public String toString(){
        return "Id : "+this.id+" | Annee : "+this.AnneeDebut+" - "+this.AnneeFin;
    }
    
    public AnneeScolaire recupererInfo(ResultSet r){ 
        AnneeScolaire a = null;
        try{
            a=new AnneeScolaire(r.getInt(1), r.getInt(2), r.getInt(3));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnneeDebut() {
        return AnneeDebut;
    }

    public void setAnneeDebut(int AnneeDebut) {
        this.AnneeDebut = AnneeDebut;
    }

    public int getAnneeFin() {
        return AnneeFin;
    }

    public void setAnneeFin(int AnneeFin) {
        this.AnneeFin = AnneeFin;
    }
}
