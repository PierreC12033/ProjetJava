/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

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
    
    public String ajouterBDD(){
        return "INSERT INTO Inscription VALUES("+this.id+","+this.idClasse+","+this.idPersonne+")";
    }
    
    @Override
    public String toString(){
        return "id : "+id+" | idClasse : "+idClasse+" | idPersonne : "+idPersonne;
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
