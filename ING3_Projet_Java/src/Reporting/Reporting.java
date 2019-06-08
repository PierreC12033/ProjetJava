/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

import ConnectionBDD.ConnectMySQL;
import java.util.ArrayList;
import modele.*;


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
    
    public void InfoInscription(ConnectMySQL s, Classe c){
        ArrayList<Inscription> result_Inscri= new ArrayList<>();
        ArrayList<Object> resul=new ArrayList<>();
        

        if(c != null){
            
            resul = s.rechercher("idClasse", Integer.toString(c.getId()), "Inscription");
            result_Inscri.addAll(((ArrayList)resul));
            
            for(int i=0; i<result_Inscri.size(); i++){
                result_Inscri.get(i).toString();
            }
        }  

    }
    
    public float moyenne_eleve(ConnectMySQL bdd,Inscription MrX)
    {
       
        
        
        
        int totmoyenne = 0;
        int nbnote =0;
        float finalmoyenne;
        finalmoyenne = 0;
        int MrXID=MrX.getId();
        Bulletin tempoB=new Bulletin();
        
        ArrayList<Object> lbul= new ArrayList<>();
        
        DetailBulletin tempoDB=new DetailBulletin();
        
        ArrayList<Object> lbulD= new ArrayList<>();
        
        Evaluation tempoE=new Evaluation();
        
        ArrayList<Object> lEval= new ArrayList<>();
        
        
        
        lbul=bdd.rechercher("IdInscription",Integer.toString(MrXID),"bulletin");
        if(!lbul.isEmpty())
            {
                for(int i=0;i<lbul.size();i++)
                {

                    //Bulletin ->Detailbulletin
                    tempoB=(Bulletin) lbul.get(i);
                    lbulD=bdd.rechercher("IdBulletin",Integer.toString(tempoB.getId()),"detailbulletin");
                    if(!lbulD.isEmpty())
                    {
                         for(int f=0;f<lbulD.size();f++)
                        {  

                            //Detailbulletin->Evaluation
                            tempoDB=(DetailBulletin) lbulD.get(f);
                            lEval=bdd.rechercher("IdDetailBulletin",Integer.toString(tempoDB.getId()),"evaluation");
                            if(!lEval.isEmpty())
                            {
                                for(int g=0;g<lbulD.size();g++)
                                {  
                                    tempoE=(Evaluation) lEval.get(g);
                                    totmoyenne+=tempoE.getNote();
                                    nbnote++;
                                }
                            }
                        }
                    }

                }
            }
        finalmoyenne=(float)totmoyenne/(float)nbnote;
        
       
        
        
        
        
        
        return finalmoyenne;
    }
}

