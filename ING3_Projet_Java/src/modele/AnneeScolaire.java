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
public class AnneeScolaire {
    private int id;
    private int AnneeDebut;
    private int AnneeFin;
    /**
     * Constructeur par défault
     */
    public AnneeScolaire() {
    }
    /**
     * Constructeur surchargé
     * @param id valeur de id
     * @param AnneeDebut valeur de AnneeDebut 
     * @param AnneeFin valeur de AnneeFin
     */
    public AnneeScolaire(int id, int AnneeDebut, int AnneeFin) {
        this.id = id;
        this.AnneeDebut = AnneeDebut;
        this.AnneeFin = AnneeFin;
    }
    
    /**
     * Ajouter un element à notre BDD
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD(){
        return "INSERT INTO AnneeScolaire VALUES("+this.id+",'"+this.AnneeDebut+"',"+this.AnneeFin+")";
    }
    /**
     * Modifier un element de notre BDD
     * @return la requete SQL afin d'update les valeurs d'un element de la BDD
     */
    public String modifierBDD(){
        return "UPDATE AnneeScolaire SET AnneeDebut = "+this.AnneeDebut+", AnneeFin = "+this.AnneeFin+" WHERE Id = "
                +this.id;
    }
    /**
     * Renvoie un string contenant les informations de l'element
     * @return un String qui défini l'objet
     */
    @Override
    public String toString(){
        return "Id : "+this.id+" | Annee : "+this.AnneeDebut+" - "+this.AnneeFin;
    }
    /**
     * Recupere les infos de AnneeScolaire
     * @param r ResultSet
     * @return un objet AnneeScolaire
     */
    public AnneeScolaire recupererInfo(ResultSet r){ 
        AnneeScolaire a = null;
        try{
            a=new AnneeScolaire(r.getInt(1), r.getInt(2), r.getInt(3));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
    }
    /**
     * Getter de id
     * @return id int
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
     * Getter de AnneeDebut
     * @return AnneeDebut
     */
    public int getAnneeDebut() {
        return AnneeDebut;
    }
    /**
     * Setter de AnneeDebut
     * @param AnneeDebut 
     */
    public void setAnneeDebut(int AnneeDebut) {
        this.AnneeDebut = AnneeDebut;
    }
    /**
     * Getter de AnneeFin
     * @return AnneeFin
     */
    public int getAnneeFin() {
        return AnneeFin;
    }
    /**
     * Setter de AnneeFin
     * @param AnneeFin 
     */
    public void setAnneeFin(int AnneeFin) {
        this.AnneeFin = AnneeFin;
    }
}
