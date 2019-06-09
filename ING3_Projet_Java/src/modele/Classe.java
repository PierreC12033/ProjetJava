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
    /**
     * Constructeur par défault
     */
    public Classe() {
    }
    /**
     * Constructeur surchargé
     * @param id
     * @param Nom
     * @param idEcole
     * @param idNiveau
     * @param idAnneeScolaire 
     */
    public Classe(int id, String Nom, int idEcole, int idNiveau, int idAnneeScolaire) {
        this.id = id;
        this.Nom = Nom;
        this.idEcole = idEcole;
        this.idNiveau = idNiveau;
        this.idAnneeScolaire = idAnneeScolaire;
    }
    /**
     * Convertir les informations en un String
     * @return un String
     */
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
    /**
     * Modifier un élément de la BDD
     * @return une requête SQL
     */
    public String modifierBDD(){
        return "UPDATE Classe SET Nom = \""+this.Nom+"\", IdEcole = "+this.idEcole+", IdNiveau = "+
                this.idNiveau+", IdAnneeScolaire = "+this.idAnneeScolaire+" WHERE Id = "+this.id;
    }
    /**
     * Récupérer les informations de l'élément
     * @param r ResultSet
     * @return Classe
     */
    public Classe recupererInfo(ResultSet r){ 
        Classe a = null;
        try{
            a=new Classe(r.getInt(1), r.getString(2), r.getInt(3), r.getInt(4), r.getInt(5));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
    }
       /**
        * Getter de Id
        * @return id
        */
    public int getId() {
        return id;
    }
    /**
     * Setter de id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Getter de Nom
     * @return nom
     */
    public String getNom() {
        return Nom;
    }
    /**
     * Setter de nom
     * @param Nom 
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    /**
     * Getter de idEcole
     * @return idEcole
     */
    public int getIdEcole() {
        return idEcole;
    }
    /**
     * Setter de idEcole
     * @param idEcole 
     */
    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }   
    /**
     * Getter de idNiveau
     * @return idNiveau
     */
    public int getIdNiveau() {
        return idNiveau;
    }
    /**
     * Setter de idNiveau
     * @param idNiveau 
     */
    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }
    /**
     * Getter de idAnneeScolaire
     * @return idAnneeScolaire
     */
    public int getIdAnneeScolaire() {
        return idAnneeScolaire;
    }
    /**
     * Setter de idAnneeScolaire
     * @param IdAnneeScolaire 
     */
    public void setIdAnneeScolaire(int IdAnneeScolaire) {
        this.idAnneeScolaire = IdAnneeScolaire;
    }
    
}
