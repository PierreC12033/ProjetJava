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
public class Trimestre {
    private int id;
    private int Numero;
    private Date Debut;
    private Date Fin;
    private int idAnneeScolaire;

    public Trimestre() {
        this.id = 0;
        this.Numero = 0;
        this.Debut = null;
        this.Fin = null;
        this.idAnneeScolaire = 0;
    }
    
    public Trimestre(int id, int Numero, Date Debut, Date Fin, int idAnneeScolaire) {
        this.id = id;
        this.Numero = Numero;
        this.Debut = Debut;
        this.Fin = Fin;
        this.idAnneeScolaire = idAnneeScolaire;
    }

    @Override
    public String toString() {
        return "id=" + id + ", Numero=" + Numero + ", Debut=" + Debut + ", Fin=" + Fin + ", idAnneeScolaire=" + idAnneeScolaire;
    }
    
    public String ajouterBDD(){
        Date deb= getDebut();
        String datedeb= deb.getAnnee()+"/"+deb.getMois()+"/"+deb.getJour();
        Date fin= getFin();
        String datefin= fin.getAnnee()+"/"+fin.getMois()+"/"+fin.getJour();
        
        return "INSERT INTO Trimestre VALUES("+this.id+","+this.Numero+",'"+datedeb+"','"+datefin+"',"+this.idAnneeScolaire+")";
    }
    
    public String modifierBDD(){
        Date deb= getDebut();
        String datedeb= deb.getAnnee()+"-"+deb.getMois()+"-"+deb.getJour();
        Date fin= getFin();
        String datefin= fin.getAnnee()+"-"+fin.getMois()+"-"+fin.getJour();
        
        return "UPDATE Trimestre SET Numero = "+this.Numero+", Debut = '"+datedeb+"', Fin = '"+datefin
                + "', IdAnneeScolaire = "+this.idAnneeScolaire+" WHERE Id = "+this.id;
    }
    
    public Trimestre recupererInfo(ResultSet r){ 
        Trimestre a = null;
        
        try{
            String myDateStr1 = r.getString("Debut"); 
            Date myDateDebut = new Date(myDateStr1);
            String myDateStr2 = r.getString("Fin"); 
            Date myDateFin = new Date(myDateStr2);
            
            a=new Trimestre(r.getInt(1), r.getInt(2), myDateDebut, myDateFin ,r.getInt(5));
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

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Date getDebut() {
        return Debut;
    }

    public void setDebut(Date Debut) {
        this.Debut = Debut;
    }

    public Date getFin() {
        return Fin;
    }

    public void setFin(Date Fin) {
        this.Fin = Fin;
    }

    public int getIdAnneeScolaire() {
        return idAnneeScolaire;
    }

    public void setIdAnneeScolaire(int idAnneeScolaire) {
        this.idAnneeScolaire = idAnneeScolaire;
    }
}
