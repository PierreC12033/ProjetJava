/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

import ConnectionBDD.ConnectMySQL;
import java.util.ArrayList;
import modele.AnneeScolaire;
import modele.Classe;
import modele.Niveau;

/**
 *
 * @author elias
 */
public class Reporting {
    
    private ArrayList<Classe> classes;
    
    
    public void InfoClasse(ConnectMySQL s, String Annee, String Niveau){
        ArrayList<Object> result_Annee= new ArrayList<>();
        ArrayList<Object> result_Niv= new ArrayList<>();
        ArrayList<Object> result_Clas= new ArrayList<>();
        
        
        result_Annee = s.rechercher("AnneeDebut", Annee, "AnneeScolaire");
        result_Niv = s.rechercher("Nom", Niveau, "Niveau");
        
        if(!result_Annee.isEmpty() && !result_Niv.isEmpty()){
            
           AnneeScolaire a = ((AnneeScolaire)result_Annee.get(0));
           
           Niveau n = ((Niveau)result_Niv.get(0));
           
           result_Clas = s.rechercher("idAnneeScolaire", Integer.toString(a.getId()), "Classe");
           
           if(!result_Clas.isEmpty()){
               for(int i=0; i < result_Clas.size(); i++){
                   if( ((Classe)result_Clas.get(i)).getIdNiveau() == n.getId()){
                       classes.add(((Classe)result_Clas.get(i)));
                   }
               }
           }
           
           if(!classes.isEmpty()){
               for(Classe c : classes){
                   System.out.println(c.toString());
               }
           }else{
               System.out.println("");
           }
        }
    }
    
    public void InfoInscription(ConnectMySQL s){
        ArrayList<ArrayList<Object>> result_Inscri= new ArrayList<>();
        ArrayList<Object> resul=new ArrayList<>();
        
        if(!classes.isEmpty()){
            for(int i=0; i<classes.size(); i++){
                resul = s.rechercher("idClasse", Integer.toString(classes.get(i).getId()), "Inscription");
                result_Inscri.get(i).add(resul);
            }
            
        }
    }
    
    
}
