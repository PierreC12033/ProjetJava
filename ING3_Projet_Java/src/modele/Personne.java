/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author tomjo
 */
public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected boolean type; //ELEVE == False && ENSEIGNANT == True
    
    public Personne()  {
        id=0;
        nom="";
        prenom="";
    }
    
    public Personne(int num, String surname, String firstname, boolean type_personne)  {
        id=num;
        nom=surname;
        prenom=firstname;
        type=type_personne;
    }
    
    public String ajouterBDD(){
        return "INSERT INTO Personne VALUES("+this.id+",'"+this.nom+"','"+this.prenom+"',"+this.type+")";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
    
    
    
}
