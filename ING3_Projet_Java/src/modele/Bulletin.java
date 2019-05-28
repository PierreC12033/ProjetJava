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
