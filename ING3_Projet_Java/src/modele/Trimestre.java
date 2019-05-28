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
public class Trimestre {
    private int id;
    private int Numero;
    private Date Debut;
    private Date Fin;
    private int idAnneeScolaire;

    public Trimestre() {
        this.id = 0;
        this.Numero = 0;
        this.Debut = null;
        this.Fin = null;
        this.idAnneeScolaire = 0;
    }
    
    public Trimestre(int id, int Numero, Date Debut, Date Fin, int idAnneeScolaire) {
        this.id = id;
        this.Numero = Numero;
        this.Debut = Debut;
        this.Fin = Fin;
        this.idAnneeScolaire = idAnneeScolaire;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Date getDebut() {
        return Debut;
    }

    public void setDebut(Date Debut) {
        this.Debut = Debut;
    }

    public Date getFin() {
        return Fin;
    }

    public void setFin(Date Fin) {
        this.Fin = Fin;
    }

    public int getIdAnneeScolaire() {
        return idAnneeScolaire;
    }

    public void setIdAnneeScolaire(int idAnneeScolaire) {
        this.idAnneeScolaire = idAnneeScolaire;
    }
}
