/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

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
    
    public String ajouterBDD(){
        return "INSERT INTO Niveau VALUES("+this.id+",'"+this.nom+"')";
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
