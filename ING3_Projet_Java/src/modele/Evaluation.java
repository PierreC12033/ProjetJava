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
    
    public String ajouterBDD(){
        return "INSERT INTO Evaluation VALUES("+this.id+","+this.idDetailBulletin+","+this.Note+",'"+this.Appreciation+"')";
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
