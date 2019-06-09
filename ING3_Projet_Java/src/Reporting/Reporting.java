/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting;

import ConnectionBDD.ConnectMySQL;
import java.util.ArrayList;
import java.util.List;
import modele.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author elias
 */
public class Reporting {
    
   
    private ArrayList<String> nomsTD= new ArrayList<>();
    private ArrayList<Double> moyennesTD= new ArrayList<>();
    
    public void Reporting(){
//        nomsTD= new ArrayList<String>();
//        moyennesTD= new ArrayList<>();
    }
    
    
    
    
    public void InfoClasse(ConnectMySQL s, String Annee, String Niveau){
        
        ArrayList<Object> result_Annee= new ArrayList<>();
        ArrayList<Object> result_Niv= new ArrayList<>();
        ArrayList<Object> result_Clas= new ArrayList<>();
        ArrayList<String> no = new ArrayList<>();
        
        
        result_Annee = s.rechercher("AnneeDebut", Annee, "AnneeScolaire");
        result_Niv = s.rechercher("Nom", Niveau, "Niveau");
        
        if(!result_Annee.isEmpty() && !result_Niv.isEmpty()){
            
           AnneeScolaire a = ((AnneeScolaire)result_Annee.get(0));
           
           Niveau n = ((Niveau)result_Niv.get(0));
           
           result_Clas = s.rechercher("IdAnneeScolaire", Integer.toString(a.getId()), "Classe");
           
           if(!result_Clas.isEmpty()){
//               System.out.println("il y a une classe");
               for(int i=0; i < result_Clas.size(); i++){
                   if( ((Classe)result_Clas.get(i)).getIdNiveau() == n.getId()){
                       InfoInscription(s,((Classe)result_Clas.get(i)));
                       
                       no.add(((Classe)result_Clas.get(i)).getNom());
                       
                       
                   }
               }
               
               nomsTD=no;
              
           }
           else{
               System.out.println("aucune classe de ce niveaux et de cette année scolaire");
           }
        }
    }
    
    public void InfoInscription(ConnectMySQL s, Classe c){
        ArrayList<Inscription> result_Inscri= new ArrayList<>();
        ArrayList<Object> resul=new ArrayList<>();
        double moyenne_td=0.0;
        double tempo=0.0;
        int taille=0;

        if(c != null){
            
            resul = s.rechercher("IdClasse", Integer.toString(c.getId()), "Inscription");
            result_Inscri.addAll(((ArrayList)resul));
            taille = result_Inscri.size();
            System.out.println("Classe : "+c.getNom());
            System.out.println("    Il y a "+taille+" inscrits à cette classe");
            for(int i=0; i<result_Inscri.size(); i++){
                System.out.println("    Inscrit numéro "+ i +" a pour ID: "+result_Inscri.get(i).getIdPersonne()+"\n    Calcule de sa moyenne:");
                tempo=moyenne_eleve(s,result_Inscri.get(i));
                System.out.println("    Sa moyenne est de : " +tempo);
                if(tempo==-1.0){
                    System.out.println("    On est donc dans un cas où il n'a aucune note... \n     la division sera donc par"+(taille-1));
                    taille-=1;}
                else{
                    
                    moyenne_td+=tempo;}
                System.out.println("    la somme des moyennes de la classe est donc de : "+moyenne_td);
            }
            if(0>taille)
                moyenne_td=0;
            else
                moyenne_td=moyenne_td/(double)taille;
        }  
        moyennesTD.add(moyenne_td);
    }
    
    public double moyenne_eleve(ConnectMySQL bdd,Inscription MrX)
    {
       
        
        
        
        int totmoyenne = 0;
        int nbnote =0;
        double finalmoyenne;
        finalmoyenne = 0.0;
        int MrXID=MrX.getId();
        Bulletin tempoB=new Bulletin();
        
        ArrayList<Object> lbul= new ArrayList<>();
        
        DetailBulletin tempoDB=new DetailBulletin();
        
        ArrayList<Object> lbulD= new ArrayList<>();
        
        Evaluation tempoE=new Evaluation();
        
        ArrayList<Object> lEval= new ArrayList<>();
        
        
        System.out.println("        Recherche de bulletin ayant pour IdInscription "+MrXID);
        lbul=bdd.rechercher("       IdInscription",Integer.toString(MrXID),"Bulletin");
        if(!lbul.isEmpty())
            {
                System.out.println("        Nous avons trouver : "+lbul.size()+" Bulletins associer à cette inscription");
                for(int i=0;i<lbul.size();i++)
                {
                    System.out.println("\t\tle buletin a pour ID: "+(((Bulletin)lbul.get(i)).getId()));
                    //Bulletin ->Detailbulletin
                    tempoB=(Bulletin) lbul.get(i);
                    System.out.println("\t\t\tRecherche de Detailbulletin ayant pour IdBulletin "+tempoB.getId());
                    lbulD=bdd.rechercher("IdBulletin",Integer.toString(tempoB.getId()),"DetailBulletin");
                    if(!lbulD.isEmpty())
                    {
                        System.out.println("\t\t\t\tIl y a " +lbulD.size()+" DetailsBulletin associer a ce bulletin");
                         for(int f=0;f<lbulD.size();f++)
                        {  

                            //Detailbulletin->Evaluation
                            tempoDB=(DetailBulletin) lbulD.get(f);
                            System.out.println("\t\t\t\t\tRecherche de Devaluation ayant pour IddetailBulletin "+tempoDB.getId());
                            lEval=bdd.rechercher("IdDetailBulletin",Integer.toString(tempoDB.getId()),"Evaluation");
                            System.out.println("\t\t\t\t\t\tIl y a " +lEval.size()+" evaluations associees a ce detailbulletin");
                            if(!lEval.isEmpty())
                            {
                                for(int g=0;g<lEval.size();g++)
                                {  
                                    
                                    tempoE=(Evaluation) lEval.get(g);
                                    System.out.println("\t\t\t\t\t\t  dont " +tempoE.getNote()+"  apppr:"+tempoE.getAppreciation());
                                    totmoyenne+=tempoE.getNote();
                                     System.out.println("---addition moyenne  "+totmoyenne +"pour un nouveau total de :     "+(nbnote+1));
                                    nbnote++;
                                }
                            }
                            else
                                System.out.println("\t\t\tAucune Eval trouvée");
                        }
                    }
                    else
                        System.out.println("\t\tAucun Detail bulletin trouvé");

                }
            }
            else
            System.out.println("\tAucun bulletin trouvé");
        if(nbnote!=0)
            finalmoyenne=(double)totmoyenne/(double)nbnote;
        else
            finalmoyenne=-1.0;
        return finalmoyenne;
    }
    
    public void afficher_info_reporting()
    {
        int i;
        System.out.println("Nom tds:" );
        if(!nomsTD.isEmpty()){
        for(i=0;i<nomsTD.size();i++)
            System.out.print(" "+ nomsTD.get(i));
        }
        i=0;
        System.out.println("Moyennes:" );
        if(moyennesTD==null) { System.out.print("Aucune moyenne à afficher");
        } else {
            System.out.print("moyenne sont:");
            for(i=0;i<moyennesTD.size();i++)
                System.out.print(" "+ moyennesTD.get(i) );
        }
        
    }
    
    public void tracer_graphe_reporting()
    {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<nomsTD.size();i++){
        dataset.addValue(moyennesTD.get(i),"Moyennes", nomsTD.get(i));
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Moyenne par TD", // chart title
                "TD", // domain axis label
                "Moyenne", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                false, // tooltips?
                false // URLs?
        );
       
        ChartFrame frame = new ChartFrame("Reporting", chart);
        frame.pack();
        frame.setVisible(true);
    }
}

