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

    @Override
    public String toString() {
        return "id=" + id + ", Nom=" + Nom + ", idEcole=" + idEcole + ", idNiveau=" + idNiveau + ", idAnneeScolaire=" + idAnneeScolaire;
    }
    /**
     * Ajouter un element à notre BDD
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD(){
        return "INSERT INTO Classe VALUES("+this.id+",'"+this.Nom+"',"+this.idEcole+","+this.idNiveau+","+this.idAnneeScolaire+")";
    }
    
    public String modifierBDD(){
        return "UPDATE Classe SET Nom = \""+this.Nom+"\", IdEcole = "+this.idEcole+", IdNiveau = "+
                this.idNiveau+", IdAnneeScolaire = "+this.idAnneeScolaire+" WHERE Id = "+this.id;
    }
    
    public Classe recupererInfo(ResultSet r){ 
        Classe a = null;
        try{
            a=new Classe(r.getInt(1), r.getString(2), r.getInt(3), r.getInt(4), r.getInt(5));
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
