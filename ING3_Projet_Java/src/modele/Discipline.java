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

    public Discipline() {
    }

    public Discipline(int id, String Nom) {
        this.id = id;
        this.Nom = Nom;
    }

    @Override
    public String toString() {
        return "id=" + id + ", Nom=" + Nom;
    }
    
    public String ajouterBDD(){
        return "INSERT INTO Discipline VALUES("+this.id+",'"+this.Nom+"')";
    }
    
    public Discipline recupererInfo(ResultSet r){ 
        Discipline a = null;
        try{
            a=new Discipline(r.getInt(1), r.getString(2));
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

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    
}
