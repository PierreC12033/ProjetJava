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
public class AnneeScolaire {
    private int id;
    private int AnneeDebut;
    private int AnneeFin;

    public AnneeScolaire() {
    }

    public AnneeScolaire(int id, int AnneeDebut, int AnneeFin) {
        this.id = id;
        this.AnneeDebut = AnneeDebut;
        this.AnneeFin = AnneeFin;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnneeDebut() {
        return AnneeDebut;
    }

    public void setAnneeDebut(int AnneeDebut) {
        this.AnneeDebut = AnneeDebut;
    }

    public int getAnneeFin() {
        return AnneeFin;
    }

    public void setAnneeFin(int AnneeFin) {
        this.AnneeFin = AnneeFin;
    }
}
