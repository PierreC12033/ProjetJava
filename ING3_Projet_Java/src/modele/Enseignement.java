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
public class Enseignement {
    private int id;
    private int idClasse;
    private int idDiscipline;
    private int idPersonne;

    public Enseignement() {
    }

    public Enseignement(int id, int idClasse, int idDiscipline, int idPersonne) {
        this.id = id;
        this.idClasse = idClasse;
        this.idDiscipline = idDiscipline;
        this.idPersonne = idPersonne;
    }

    @Override
    public String toString() {
        return "id=" + id + ", idClasse=" + idClasse + ", idDiscipline=" + idDiscipline + ", idPersonne=" + idPersonne;
    }
    
    public String ajouterBDD(){
        return "INSERT INTO Enseignement VALUES("+this.id+","+this.idClasse+","+this.idDiscipline+","+this.idPersonne+")";
    }
    
    public Enseignement recupererInfo(ResultSet r){ 
        Enseignement a = null;
        try{
            a=new Enseignement(r.getInt(1), r.getInt(2), r.getInt(3), r.getInt(4));
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

    public int getIdDiscipline() {
        return idDiscipline;
    }

    public void setIdDiscipline(int idDiscipline) {
        this.idDiscipline = idDiscipline;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }
    
    
}
