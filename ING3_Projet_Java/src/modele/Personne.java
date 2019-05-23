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
public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected boolean type;
    public Personne()
    {
        id=0;
        nom="";
        prenom="";
    }
    public Personne(int num, String surname, String firstname, boolean type_personne)
    {
        id=num;
        nom=surname;
        prenom=firstname;
        type=type_personne;
        
    }
    public int getId()
    {
        return id;
    }
    public String getNom()
    {
        return nom;
    }
    public String getPrenom()
    {
        return prenom;
    }
    public void setId(int new_id)
    {
        id=new_id;
    }
    public void setNom(String new_nom)
    {
        nom=new_nom;
    }
    public void setPrenom(String new_prenom)
    {
        prenom = new_prenom;
    }
    public boolean getType()
    {
        return type;
    }
    public void setType(boolean new_type)
    {
        type=new_type;
    }
    
}
