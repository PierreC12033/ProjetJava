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
public class Evaluation {
    private int id;
    private int idDetailBulletin;
    private int Note;
    private String Appreciation;

    public Evaluation() {
    }

    public Evaluation(int id, int idDetailBulletin, int Note, String Appreciation) {
        this.id = id;
        this.idDetailBulletin = idDetailBulletin;
        this.Note = Note;
        this.Appreciation = Appreciation;
    }

    @Override
    public String toString() {
        return "id=" + id + ", idDetailBulletin=" + idDetailBulletin + ", Note=" + Note + ", Appreciation=" + Appreciation;
    }
    /**
     * Ajouter un element à notre BDD
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD(){
        return "INSERT INTO Evaluation VALUES("+this.id+","+this.idDetailBulletin+","+this.Note+",'"+this.Appreciation+"')";
    }
    
    public String modifierBDD(){
        return "UPDATE Evaluation SET Appreciation = \""+this.Appreciation+"\", IdDetailBulletin = "
                +this.idDetailBulletin+", Note = "+this.Note+" WHERE Id = "+this.id;
    }
    
    public Evaluation recupererInfo(ResultSet r){ 
        Evaluation a = null;
        try{
            a=new Evaluation(r.getInt(1), r.getInt(2), r.getInt(3), r.getString(4));
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

    public int getIdDetailBulletin() {
        return idDetailBulletin;
    }

    public void setIdDetailBulletin(int idDetailBulletin) {
        this.idDetailBulletin = idDetailBulletin;
    }

    public int getNote() {
        return Note;
    }

    public void setNote(int Note) {
        this.Note = Note;
    }

    public String getAppreciation() {
        return Appreciation;
    }

    public void setAppreciation(String Appreciation) {
        this.Appreciation = Appreciation;
    }
    
}
