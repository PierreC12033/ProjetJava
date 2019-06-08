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
public class Inscription {
    private int id;
    private int idClasse;
    private int idPersonne;

    public Inscription() {
    }

    public Inscription(int id, int idClasse, int idPersonne) {
        this.id = id;
        this.idClasse = idClasse;
        this.idPersonne = idPersonne;
    }
    
    @Override
    public String toString(){
        return "id : "+id+" | idClasse : "+idClasse+" | idPersonne : "+idPersonne;
    }
    /**
     * Ajouter un element à notre BDD
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD(){
        return "INSERT INTO Inscription VALUES("+this.id+","+this.idClasse+","+this.idPersonne+")";
    }
    
    public String modifierBDD(){
        return "UPDATE Inscription SET IdClasse = "+this.idClasse+", IdPersonne = "+this.idPersonne+
                " WHERE Id = "+this.id;
    }
    
    public Inscription recupererInfo(ResultSet r){ 
        Inscription a = null;
        try{
            a=new Inscription(r.getInt(1), r.getInt(2), r.getInt(3));
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

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }
    
}