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
public class Ecole {
    private int id;
    private String nom;
    
    public Ecole()
    {
        id=0;
        nom="";
    }
    public Ecole(int num, String name)
    {
        id=num;
        nom=name;        
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom;
    }
    /**
     * Ajouter un element à notre BDD
     * @return la requete SQL afin d'ajouter un element dans notre BDD
     */
    public String ajouterBDD(){
        return "INSERT INTO Ecole VALUES("+this.id+",'"+this.nom+"')";
    }
    
    public String modifierBDD(){
        return "UPDATE Ecole SET Nom = \""+this.nom+"\" WHERE Id = "+this.id;
    }
    
    public Ecole recupererInfo(ResultSet r){ 
        Ecole a = null;
        try{
            a=new Ecole(r.getInt(1), r.getString(2));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
    }
    
    public int getId()
    {
        return id;
    }
    public String getNom()
    {
        return nom;
    }
    public void setId(int new_id)
    {
        id=new_id;
    }
    public void setNom(String new_nom)
    {
        nom=new_nom;
    }
}
