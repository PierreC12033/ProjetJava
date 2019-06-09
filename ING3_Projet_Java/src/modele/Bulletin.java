/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
/**
 * Bibliothèques
 */
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
    /**
     * Constructeur par défault
     */
    public Bulletin() {
    }
    /**
     * Constructeur surchargé
     * @param id int
     * @param idTrimestre int
     * @param idInscription int
     * @param Appreciation  String
     */
    public Bulletin(int id, int idTrimestre, int idInscription, String Appreciation) {
        this.id = id;
        this.idTrimestre = idTrimestre;
        this.idInscription = idInscription;
        this.Appreciation = Appreciation;
    }
    /**
     * Convertit les infos de l'élément en un String
     * @return un String
     */
    @Override
    public String toString(){
        return "Id : "+this.id+" | idTrimestre : "+this.idTrimestre+" | idInscription : "+this.idInscription
                + " | Appreciation : "+this.Appreciation;
    }
    /**
     * Ajouter un element à notre BDD
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD(){
        return "INSERT INTO Bulletin VALUES("+this.id+",'"+this.idTrimestre+"',"+this.idInscription+",'"+this.Appreciation+"')";
    }
    /**
     * Modifier un element de la BDD
     * @return la requete SQL pour modifier l'element de la BDD
     */
    public String modifierBDD(){
        return "UPDATE Bulletin SET IdTrimestre = "+this.idTrimestre+", IdInscription = "+
                this.idInscription+", Appreciation = \""+this.Appreciation+"\" WHERE Id = "+this.id;
    }
    /**
     * Recupérer les infos de l'éléments
     * @param r ResultSet
     * @return un objet Bulletin
     */
    public Bulletin recupererInfo(ResultSet r){ 
        Bulletin a = null;
        try{
            a=new Bulletin(r.getInt(1), r.getInt(2), r.getInt(3), r.getString(4));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
    }
    /**
     * Getter de id
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
     * Getter de IdTrimestre
     * @return IdTrimestre
     */
    public int getIdTrimestre() {
        return idTrimestre;
    }
    /**
     * Setter de IdTrimestre
     * @param idTrimestre 
     */
    public void setIdTrimestre(int idTrimestre) {
        this.idTrimestre = idTrimestre;
    }
    /**
     * Getter de IdInscription
     * @return IdInscription
     */
    public int getIdInscription() {
        return idInscription;
    }
    /**
     * Setter de IdInscription
     * @param idInscription 
     */
    public void setIdInscription(int idInscription) {
        this.idInscription = idInscription;
    }
    /**
     * Getter de Appreciation
     * @return Appreciation
     */
    public String getAppreciation() {
        return Appreciation;
    }
    /**
     * Setter de Appreciation
     * @param Appreciation 
     */
    public void setAppreciation(String Appreciation) {
        this.Appreciation = Appreciation;
    }
    
}
