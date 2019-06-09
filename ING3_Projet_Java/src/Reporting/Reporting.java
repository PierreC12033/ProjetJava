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
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 * @author elias
 */
public class Reporting {
    
   
    private ArrayList<String> nomsTD= new ArrayList<>();
    private ArrayList<Double> moyennesTD= new ArrayList<>();
    
    private ArrayList<Double> MoyennesMat= new ArrayList<>();
    private ArrayList<String> nomsMat= new ArrayList<>();
    
    
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
    
    public void notes_elev(ConnectMySQL bdd,String nomEleve,int trim)
    {
        ArrayList<Object> L_pers= new ArrayList<>();
        ArrayList<Object> L_Inscriptions= new ArrayList<>();
        ArrayList<Object> L_Bulletins= new ArrayList<>();
        ArrayList<Object> L_DetailBulletin = new ArrayList<>();
        ArrayList<Object> L_Evaluations = new ArrayList<>();
        ArrayList<Object> L_Enseignements = new ArrayList<>();
        ArrayList<Object> L_Disciplines = new ArrayList<>();
        L_pers=bdd.rechercher("Nom",nomEleve,"Personne");
        int ID_eleve=0;
        int ID_inscription=0;
        int trouver=0;
        int ID_lebulletin=0;
        int ID_DetailBulletin=0;
        double tempo=0;
        double NBnotes=0;
        if(!L_pers.isEmpty())
            {
                ID_eleve=((Personne)L_pers.get(0)).getId();
                L_Inscriptions=bdd.rechercher("IdPersonne", Integer.toString(ID_eleve),"Inscription");
                if(!L_pers.isEmpty())
                    {
                          ID_inscription=((Inscription)L_Inscriptions.get(0)).getId();
                          L_Bulletins=bdd.rechercher("IdInscription", Integer.toString(ID_inscription),"Bulletin");
                          if(!L_Bulletins.isEmpty())
                            {
                               for(int i=0;i<L_Bulletins.size();i++)
                               {
                                   if(trim==(((Bulletin)L_Bulletins.get(i)).getIdTrimestre()))
                                   {
                                       ID_lebulletin=((Bulletin)L_Bulletins.get(i)).getId();
                                       L_DetailBulletin=bdd.rechercher("IdBulletin", Integer.toString(ID_lebulletin),"DetailBulletin");
                                       trouver=1;
                                       if(!L_DetailBulletin.isEmpty())
                                            {
                                                for(int g=0;g<L_DetailBulletin.size();g++)
                                                {
                                                    ID_DetailBulletin=((DetailBulletin)L_DetailBulletin.get(g)).getId();
                                                    
                                                    //Recherche du noms de la matière
                                                    int tempppo=((DetailBulletin)L_DetailBulletin.get(g)).getIdEnseignement();
                                                    
                                                    Enseignement biiii= new Enseignement();
                                                    
                                                    
                                                    L_Enseignements=bdd.rechercherParId(tempppo, biiii);
                                                   
                                                    if(!L_Enseignements.isEmpty())
                                                        {
                                                             System.out.println("ok24");
                                                            L_Disciplines=bdd.rechercher("Id", Integer.toString(((Enseignement)L_Enseignements.get(0)).getIdDiscipline()),"Discipline");
                                                            if(!L_Disciplines.isEmpty())
                                                                {
                                                                    System.out.println("ok1");
                                                                    nomsMat.add(((Discipline)L_Disciplines.get(0)).getNom());
                                                                }
                                                            else
                                                                System.out.println("\t\t\t\tImpossible de trouver le nom de la matiere");
                                                        }
                                                    else
                                                        System.out.println("\t\t\t\tImpossible de trouver le nom de la matiere");
                                                    
                                                    
//                                                    recherche de la moyenne de la matiere
                                                    System.out.println("ok2");
                                                    NBnotes=0;
                                                    L_Evaluations=bdd.rechercher("IdDetailBulletin", Integer.toString(ID_DetailBulletin),"Evaluation");
                                                    if(!L_Evaluations.isEmpty())
                                                        {
                                                            tempo=0;
                                                            System.out.println("ok3");
                                                            
                                                            for(int h=0;h<L_Evaluations.size();h++)
                                                            {
                                                                System.out.println("ok4");
                                                                tempo+=((Evaluation)L_Evaluations.get(h)).getNote();
                                                                NBnotes++;
                                                                System.out.println(NBnotes);
                                                            }
                                                            System.out.println("calcule de la moyenne   total note: "+tempo+"  nombre de note: "+NBnotes);
                                                            MoyennesMat.add(tempo/NBnotes);
                                                        }
                                                    else
                                                    {
                                                        System.out.println("\t\t\t\tAucune Evaluations lié à cette matiere pour ce Trimestre trouvée");
                                                        MoyennesMat.add(0.0);
                                                    }
                                                    
                                                }
                                            }
                                       else
                                           System.out.println("\t\t\t\tAucuns DetailBulletin lié à ce nom de ce Trimestre trouvée");
                                   }
                               }
                               if(trouver==0)
                                   System.out.println("\t\t\t\tAucuns Bulletin lié à ce nom de ce Trimestre trouvée");
                            }
                          else
                              System.out.println("\t\t\tAucuns Bulletin lié à ce nom trouvée");
                    }
                else
                    System.out.println("\t\tAucune Inscription lié à ce nom trouvée");
                
            }
        else
            System.out.println("\tAucune Personne de ce nom trouvée");
    }
    
    public void reporting_elev_enseignant(ConnectMySQL bdd)
    {
        ArrayList<Object> L_eleves= new ArrayList<>();
        ArrayList<Object> L_enseignant= new ArrayList<>();
        L_eleves=bdd.rechercher("Type_P", "0","Personne");
        L_enseignant=bdd.rechercher("Type_P", "1","Personne");
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        for(int i=0;i<L_enseignant.size();i++){
        dataset.setValue("Eleve",L_eleves.size());
        dataset.setValue("Enseignants",L_enseignant.size());
        }
        
        // create a chart...
        JFreeChart chart = ChartFactory.createPieChart(
                "Camembert Enseignants/Etudiants",
                dataset,
                true, // legend?
                true, // tooltips?
                false // URLs?
        );
        // create and display a frame...
        ChartFrame frame = new ChartFrame("Camembert Enseignants/Etudiants", chart);
        frame.pack();
        frame.setVisible(true);
        
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
    
     public void afficher_info_reporting2()
    {
        int i;
        System.out.println("Nom Matieres:" );
        if(!nomsMat.isEmpty()){
        for(i=0;i<nomsMat.size();i++)
            System.out.print(" "+ nomsMat.get(i));
        }
        i=0;
        System.out.println("Moyennes:" );
        if(MoyennesMat==null) { System.out.print("Aucune moyenne à afficher");
        } else {
            System.out.print("moyenne sont:");
            for(i=0;i<MoyennesMat.size();i++)
                System.out.print(" "+ MoyennesMat.get(i) );
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
    
    public void tracer_graphe_reporting2()
    {
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i=0;i<nomsMat.size();i++){
        dataset.addValue(MoyennesMat.get(i),"Moyennes", nomsMat.get(i));
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Moyenne de l'eleve", // chart title
                "Matières", // domain axis label
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

