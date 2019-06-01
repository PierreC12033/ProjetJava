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
public class Niveau {
    private int id;
    private String nom;
    
    public Niveau()
    {
        id=0;
        nom="";
    }
    public Niveau(int num, String name)
    {
        id=num;
        nom=name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom;
    }
    
    public String ajouterBDD(){
        return "INSERT INTO Niveau VALUES("+this.id+",'"+this.nom+"')";
    }
    
    public String modifierBDD(){
        return "UPDATE Niveau SET Nom = \""+this.nom+"\" WHERE Id = "+this.id;
    }
    
    public Niveau recupererInfo(ResultSet r){ 
        Niveau a = null;
        try{
            a=new Niveau(r.getInt(1), r.getString(2));
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
