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
