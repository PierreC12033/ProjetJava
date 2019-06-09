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
public class Discipline {

    private int id;
    private String Nom;

    /**
     * Constructeur par défault
     */
    public Discipline() {
    }

    /**
     * Constructeur surchargé
     *
     * @param id
     * @param Nom
     */
    public Discipline(int id, String Nom) {
        this.id = id;
        this.Nom = Nom;
    }

    /**
     * Convertir les informations en un string
     *
     * @return un string
     */
    @Override
    public String toString() {
        return "id=" + id + ", Nom=" + Nom;
    }

    /**
     * Ajouter un element à notre BDD
     *
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD() {
        return "INSERT INTO Discipline VALUES(" + this.id + ",'" + this.Nom + "')";
    }

    /**
     * Modifier un element de la BDD
     *
     * @return la requete SQL
     */
    public String modifierBDD() {
        return "UPDATE Discipline SET Nom = \"" + this.Nom + "\" WHERE Id = " + this.id;
    }

    /**
     * Récupérer les informations de l'élément
     *
     * @param r ResultSet
     * @return Discipline
     */
    public Discipline recupererInfo(ResultSet r) {
        Discipline a = null;
        try {
            a = new Discipline(r.getInt(1), r.getString(2));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return a;
    }

    /**
     * Getter de id
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
     * Getter de Nom
     *
     * @return Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * Setter de Nom
     *
     * @param Nom
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

}
