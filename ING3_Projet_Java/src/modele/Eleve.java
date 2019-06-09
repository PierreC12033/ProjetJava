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
public class Eleve extends Personne {
    
    public Eleve()
    {
        super();
        this.setType(false);
    }
    public Eleve(int num, String firstname, String name)
    {
        super(num, firstname, name, false);
    }
}
