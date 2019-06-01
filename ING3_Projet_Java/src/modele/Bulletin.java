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
public class Bulletin {
    private int id;
    private int idTrimestre;
    private int idInscription;
    private String Appreciation; 

    public Bulletin() {
    }

    public Bulletin(int id, int idTrimestre, int idInscription, String Appreciation) {
        this.id = id;
        this.idTrimestre = idTrimestre;
        this.idInscription = idInscription;
        this.Appreciation = Appreciation;
    }
    
    @Override
    public String toString(){
        return "Id : "+this.id+" | idTrimestre : "+this.idTrimestre+" | idInscription : "+this.idInscription
                + " | Appreciation : "+this.Appreciation;
    }
    
    public String ajouterBDD(){
        return "INSERT INTO Bulletin VALUES("+this.id+",'"+this.idTrimestre+"',"+this.idInscription+",'"+this.Appreciation+"')";
    }
    
    public String modifierBDD(){
        return "UPDATE Bulletin SET IdTrimestre = "+this.idTrimestre+", IdInscription = "+
                this.idInscription+", Appreciation = \""+this.Appreciation+"\" WHERE Id = "+this.id;
    }
    
    public Bulletin recupererInfo(ResultSet r){ 
        Bulletin a = null;
        try{
            a=new Bulletin(r.getInt(1), r.getInt(2), r.getInt(3), r.getString(4));
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

    public int getIdTrimestre() {
        return idTrimestre;
    }

    public void setIdTrimestre(int idTrimestre) {
        this.idTrimestre = idTrimestre;
    }

    public int getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }

    public String getAppreciation() {
        return Appreciation;
    }

    public void setAppreciation(String Appreciation) {
        this.Appreciation = Appreciation;
    }
    
}
