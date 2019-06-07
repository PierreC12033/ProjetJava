/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

/**
 *
 * @author elias
 */
public class PasdeReponse extends Exception {
    @Override
    public String getMessage() {
        String erreur = "Erreur: Aucun Object avec cette id.";
        return erreur;
    }
}
