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
public class Classe {
    private int id;
    private String Nom;
    private int idEcole;
    private int idNiveau;
    private int idAnneeScolaire;

    public Classe() {
    }

    public Classe(int id, String Nom, int idEcole, int idNiveau, int idAnneeScolaire) {
        this.id = id;
        this.Nom = Nom;
        this.idEcole = idEcole;
        this.idNiveau = idNiveau;
        this.idAnneeScolaire = idAnneeScolaire;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }

    public int getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }

    public int getIdAnneeScolaire() {
        return idAnneeScolaire;
    }

    public void setIdAnneeScolaire(int IdAnneeScolaire) {
        this.idAnneeScolaire = IdAnneeScolaire;
    }
    
}
