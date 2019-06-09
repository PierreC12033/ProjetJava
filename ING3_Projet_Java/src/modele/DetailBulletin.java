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
public class DetailBulletin {

    private int id;
    private int idBulletin;
    private int idEnseignement;
    private String Appreciation;

    /**
     * Constructeur par défault
     */
    public DetailBulletin() {
    }

    /**
     * Constructeur surchargé
     *
     * @param id
     * @param idBulletin
     * @param idEnseignement
     * @param Appreciation
     */
    public DetailBulletin(int id, int idBulletin, int idEnseignement, String Appreciation) {
        this.id = id;
        this.idBulletin = idBulletin;
        this.idEnseignement = idEnseignement;
        this.Appreciation = Appreciation;
    }

    /**
     * Convertit les informations en un string
     *
     * @return
     */
    @Override
    public String toString() {
        return "id=" + id + ", idBulletin=" + idBulletin + ", idEnseignement=" + idEnseignement + ", Appreciation=" + Appreciation;
    }

    /**
     * Ajouter un element à notre BDD
     *
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD() {
        return "INSERT INTO DetailBulletin VALUES(" + this.id + "," + this.idBulletin + "," + this.idEnseignement + ",'" + this.Appreciation + "')";
    }

    /**
     * Modifier un element de la BDD
     *
     * @return la requête SQL
     */
    public String modifierBDD() {
        return "UPDATE DetailBulletin SET Appreciation = \"" + this.Appreciation + "\", IdBulletin = " + this.idBulletin
                + ", IdEnseignement = " + this.idEnseignement + " WHERE Id = " + this.id;
    }

    /**
     * Recuperer les informations de l'éléments
     *
     * @param r ResultSet
     * @return DetailBulletin
     */
    public DetailBulletin recupererInfo(ResultSet r) {
        DetailBulletin a = null;
        try {
            a = new DetailBulletin(r.getInt(1), r.getInt(2), r.getInt(3), r.getString(4));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return a;
    }

    /**
     * Getter de Id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter de id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter de idBulletin
     *
     * @return idEnseignement
     */
    public int getIdBulletin() {
        return idBulletin;
    }

    /**
     * Setter de idBulletin
     *
     * @param idBulletin
     */
    public void setIdBulletin(int idBulletin) {
        this.idBulletin = idBulletin;
    }

    /**
     * Getter de idEnseignement
     *
     * @return idEnseignement
     */
    public int getIdEnseignement() {
        return idEnseignement;
    }

    /**
     * Setter de idEnseignement
     *
     * @param idEnseignement
     */
    public void setIdEnseignement(int idEnseignement) {
        this.idEnseignement = idEnseignement;
    }

    /**
     * Getter de appreciation
     *
     * @return appreciation
     */
    public String getAppreciation() {
        return Appreciation;
    }

    /**
     * Setter de appreciation
     *
     * @param Appreciation
     */
    public void setAppreciation(String Appreciation) {
        this.Appreciation = Appreciation;
    }

}
