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

    @Override
    public String toString() {
        if(type){
            return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", type=Professeur";
        }else{
            return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", type=Eleve";
        }
    }
    
    public String ajouterBDD(){
        return "INSERT INTO Personne VALUES("+this.id+",'"+this.nom+"','"+this.prenom+"',"+this.type+")";
    }
    
    public String modifierBDD(){
        return "UPDATE Personne SET Nom = \""+this.nom+"\", Prenom = \""+this.prenom+"\", "
                + "Type_P = "+this.type+" WHERE Id = "+this.id;
    }
    
    public Personne recupererInfo(ResultSet r){ 
        Personne a = null;
        try{
            a=new Personne(r.getInt(1), r.getString(2), r.getString(3), r.getBoolean(4));
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
