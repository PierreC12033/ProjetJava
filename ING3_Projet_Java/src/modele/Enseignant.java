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
public class Enseignant extends Personne {

    public Enseignant() {
        super();
        this.setType(true);
    }

    public Enseignant(int num, String surname, String name) {
        super(num, surname, name, true);
    }
}
