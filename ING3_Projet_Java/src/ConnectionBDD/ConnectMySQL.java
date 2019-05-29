/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConnectionBDD;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import modele.*;
/**
 *
 * @author Elias
 */
public class ConnectMySQL {
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        cnx=connecterDB();
        
        AnneeScolaire a=new AnneeScolaire(700,1990,1998);
        Bulletin b= new Bulletin(800, 1900, 1500, "Ok ijij");
        Classe c= new Classe(900,"5B", 1200, 1600, 700);
        DetailBulletin d= new DetailBulletin(1000, 800, 1300,"gggg");
        Discipline dis= new Discipline(1100, "Maths");
        Ecole ec=new Ecole(1200,"ECE");
        Enseignement ens=new Enseignement(1300, 900, 1100, 1800);
        Evaluation ev= new Evaluation(1400, 1000, 16, "woaah");
        Inscription i=new Inscription(1500, 900, 1700);
        Niveau n= new Niveau(1600, "5eme");
        Eleve e= new Eleve(1700, "Jack", "NJQ");
        Enseignant ensg= new Enseignant(1800,"Hina", "Minolo");
        modele.Date debut= new modele.Date(22,02,1990);
        modele.Date fin= new modele.Date(30,12,2001);
        Trimestre t= new Trimestre(1900, 1, debut, fin, 700);
        
        System.out.println("Tous les elements on été créé");
        
        AjouterP(a);
        AjouterP(dis);
        AjouterP(ec);
        AjouterP(n);
        AjouterP(e);
        AjouterP(ensg);
        
        AjouterP(c); //Ecole Niveau AnneeScolaire
        AjouterP(i); //Classe Eleve
        AjouterP(ens); //Classe Discipline Personne
        AjouterP(t); //AnneeScolaire
        AjouterP(b); //Trimestre et Inscription
        AjouterP(d); //Bulletin Enseignement
        AjouterP(ev); //DetailBulletin
        
        //SupprimerParID(1400, "Evaluation");
        /*
        ArrayList<Object> k=new ArrayList<Object>();
        k=rechercherParId(1500, "Inscription");
        
        for (Object sublist : k) {
            System.out.println(sublist.toString());
        }
        */
    }
    
    public static Connection connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url="jdbc:mysql://localhost:8889/Ecole";
            String user="root";
            String password="root";
            Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établié");
            return cnx;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
   
    public static void AjouterP(Object o){
        try{
            st=cnx.createStatement();
            String query="";
            
            if(o instanceof AnneeScolaire){
                query=((AnneeScolaire) o).ajouterBDD();
            }
            
            if(o instanceof Bulletin){
                query=((Bulletin) o).ajouterBDD();
            }
            
            if(o instanceof Classe){
                query=((Classe) o).ajouterBDD();
            }
            
            if(o instanceof DetailBulletin){
                query=((DetailBulletin) o).ajouterBDD();
            }
            
            if(o instanceof Discipline){
                query=((Discipline) o).ajouterBDD();
            }
            
            if(o instanceof Ecole){
                query=((Ecole) o).ajouterBDD();
            }
            
            if(o instanceof Personne){
                query=((Personne) o).ajouterBDD();
            }
            
            if(o instanceof Enseignement){
                query=((Enseignement) o).ajouterBDD();
            }
            
            if(o instanceof Evaluation){
                query=((Evaluation) o).ajouterBDD();
            }
            
            if(o instanceof Inscription){
                query=((Inscription) o).ajouterBDD();
            }
            
            if(o instanceof Niveau){
                query=((Niveau) o).ajouterBDD();
            }
            
            if(o instanceof Trimestre){
                query=((Trimestre) o).ajouterBDD();
            }
            
            st.executeUpdate(query);
            System.out.println("Produit ajouté "+o.getClass());
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
   
    public static void SupprimerParID(int id, String NomBDD){
        try{
           String query="DELETE FROM "+ NomBDD +" WHERE Id = "+id;
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Produit supprimé");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static ArrayList<Object> rechercherParId(int id, String NomBDD){
        
        String req = "SELECT * FROM "+NomBDD+" WHERE Id =?";
        ArrayList<Object> temp = new ArrayList<Object>();
        
        //System.out.println(req);
        try {
            st=cnx.createStatement();
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, id); 
            ResultSet resultat = pst.executeQuery(); 

            if(!resultat.next()){
                System.out.println("Cette Id n'est pas dans la table");
            }
            else{
                System.out.println("Voici les résultat :");
                do{ 
                    temp.add(resultat);
                }while(resultat.next());
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return temp;
    }
}