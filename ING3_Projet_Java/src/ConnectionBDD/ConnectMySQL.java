/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionBDD;

import java.sql.*;
import java.util.ArrayList;
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

        cnx = connecterDB();

        AnneeScolaire a = new AnneeScolaire(701, 99, 20);
        Bulletin b = new Bulletin(800, 1900, 1500, "ca modifié");
        Classe c = new Classe(900, "99", 1200, 1600, 700);
        DetailBulletin d = new DetailBulletin(1000, 800, 1300, "ololllll");
        Discipline dis = new Discipline(1100, "Sport");
        Ecole ec = new Ecole(1200, "Paris");
        Enseignement ens = new Enseignement(1300, 900, 1100, 1800);
        Evaluation ev = new Evaluation(1400, 1000, 16, "dddddddd");
        Inscription i = new Inscription(1500, 900, 1700);
        Niveau n = new Niveau(1600, "5eme");
        Eleve e = new Eleve(1700, "CCC", "CCCC");
        Enseignant ensg = new Enseignant(1800, "GGGGG", "GGGG");
        
        modele.Date debut = new modele.Date(01, 12, 1990);
        modele.Date fin = new modele.Date(04, 01, 2200);
        Trimestre t = new Trimestre(1900, 4, debut, fin, 700);
        
        //modifierParId(t.getId(), t);
          
        /*AjouterP(a);
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
       
      */
        Object lllll = d;
        
        ArrayList<Object> k=new ArrayList<Object>();
        k=rechercher("AnneeDebut", "2017", "AnneeScolaire");
        
        for (Object sublist : k) {
        System.out.println(sublist.toString());
        } 
        
        
        
         
    }
    
    /**
    * Connection à la base de données avec données predefinis
    * @return Connection
    * @see Connection type definis dans les package SQL
    */
    public static Connection connecterDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url = "jdbc:mysql://localhost:8889/Ecole";
            String user = "root";
            String password = "root";
            cnx = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion bien établié");
            return cnx;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * Permet d'ajouter un object dans une table
     * @param o correspond à l'objet a ajouté
     * @see Object comme il est parent de toute nos classe il permet de moduler notre code
     */
    public static void AjouterP(Object o) {
        try {
            st = cnx.createStatement();
            String query = "";

            //Cherche du type de l'objet recu en paramètre 
            
            if (o instanceof AnneeScolaire) {
                query = ((AnneeScolaire) o).ajouterBDD();
            }

            if (o instanceof Bulletin) {
                query = ((Bulletin) o).ajouterBDD();
            }

            if (o instanceof Classe) {
                query = ((Classe) o).ajouterBDD();
            }

            if (o instanceof DetailBulletin) {
                query = ((DetailBulletin) o).ajouterBDD();
            }

            if (o instanceof Discipline) {
                query = ((Discipline) o).ajouterBDD();
            }

            if (o instanceof Ecole) {
                query = ((Ecole) o).ajouterBDD();
            }

            if (o instanceof Personne) {
                query = ((Personne) o).ajouterBDD();
            }

            if (o instanceof Enseignement) {
                query = ((Enseignement) o).ajouterBDD();
            }

            if (o instanceof Evaluation) {
                query = ((Evaluation) o).ajouterBDD();
            }

            if (o instanceof Inscription) {
                query = ((Inscription) o).ajouterBDD();
            }

            if (o instanceof Niveau) {
                query = ((Niveau) o).ajouterBDD();
            }

            if (o instanceof Trimestre) {
                query = ((Trimestre) o).ajouterBDD();
            }

            String mdd = String.valueOf(o.getClass());
        
            String NomBDD= mdd.substring(13);

            if(o instanceof Enseignant || o instanceof Eleve) {
                NomBDD = "Personne";
            }
            
            st.executeUpdate(query);
            System.out.println("Produit ajouté " + NomBDD);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 
     * @param id, l'id de l'objet à supprimer dans notre BDD
     * @param NomBDD, permet de selectionner la table dans laquelle se trouve l'object
     */
    public static void SupprimerParID(int id, String NomBDD) {
        try {
            String query = "DELETE FROM " + NomBDD + " WHERE Id = " + id;
            st = cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Produit supprimé");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 
     * @param id, l'id de l'objet à rechercher dans notre BDD
     * @param o, l'object que l'on recherche dans notre BDD
     * @return Une liste d'object
     * @see Object comme il est parent de toute nos classe il permet de moduler notre code
     */
    public static ArrayList<Object> rechercherParId(int id, Object o) {
        
        String mdd = String.valueOf(o.getClass());
        
        String NomBDD= mdd.substring(13);
        Object temmObj =null;
        
        if(o instanceof Enseignant || o instanceof Eleve) {
            NomBDD = "Personne";
        }
        
        String req = "SELECT * FROM " + NomBDD + " WHERE Id =?";
        ArrayList<Object> temp = new ArrayList<>();
        
        try {
            st = cnx.createStatement();
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, id);
            ResultSet resultat = pst.executeQuery();

            if (!resultat.next()) {
                System.out.println("Cette Id n'est pas dans la table");
            } else {
                do {
                    
                    if (o instanceof AnneeScolaire) {
                        temmObj = ((AnneeScolaire) o).recupererInfo(resultat);
                    }

                    if (o instanceof Bulletin) {
                        temmObj = ((Bulletin) o).recupererInfo(resultat);
                    }
                    

                    if (o instanceof Classe) {
                        temmObj = ((Classe) o).recupererInfo(resultat);
                    }

                    if (o instanceof DetailBulletin) {
                        temmObj = ((DetailBulletin) o).recupererInfo(resultat);
                    }

                    if (o instanceof Discipline) {
                        temmObj = ((Discipline) o).recupererInfo(resultat);
                    }

                    if (o instanceof Ecole) {
                        temmObj = ((Ecole) o).recupererInfo(resultat);
                    }

                    if (o instanceof Personne) {
                        temmObj = ((Personne) o).recupererInfo(resultat);
                    }

                    if (o instanceof Enseignement) {
                        temmObj = ((Enseignement) o).recupererInfo(resultat);
                    }

                    if (o instanceof Evaluation) {
                        temmObj = ((Evaluation) o).recupererInfo(resultat);
                    }

                    if (o instanceof Inscription) {
                        temmObj = ((Inscription) o).recupererInfo(resultat);
                    }

                    if (o instanceof Niveau) {
                        temmObj = ((Niveau) o).recupererInfo(resultat);
                    }

                    if (o instanceof Trimestre) {
                        temmObj = ((Trimestre) o).recupererInfo(resultat);
                    }
                    
                    if(temmObj != null){
                        temp.add(temmObj);
                    }
                    
                    temmObj =null; 
                } while (resultat.next());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return temp;
    }
    
    public static ArrayList<Object> rechercher(String attribut, String valAtt, String NomBDD) {
        
        Object temmObj =null;
        Object o = null;
        
        String req = "SELECT * FROM " + NomBDD + " WHERE "+attribut+" = '"+valAtt+"'";
        System.out.println(req);
        ArrayList<Object> temp = new ArrayList<>();
        
        try {
            st = cnx.createStatement();
            ResultSet resultat = st.executeQuery(req);

            if (!resultat.next()) {
                System.out.println("L'attribut "+attribut+" n'est pas dans la table "+NomBDD);
            } else {
                do {
                    
                    if ("AnneeScolaire".equals(NomBDD) ) {
                        o = new AnneeScolaire();
                        temmObj = ((AnneeScolaire) o).recupererInfo(resultat);
                    }

                    if ("Bulletin".equals(NomBDD)) {
                        o = new Bulletin();
                        temmObj = ((Bulletin) o).recupererInfo(resultat);
                    }

                    if ("Classe".equals(NomBDD)) {
                        o = new Classe();
                        temmObj = ((Classe) o).recupererInfo(resultat);
                    }

                    if ("DetailBulletin".equals(NomBDD)) {
                        o = new DetailBulletin();
                        temmObj = ((DetailBulletin) o).recupererInfo(resultat);
                    }

                    if ("Discipline".equals(NomBDD)) {
                        o = new Discipline();
                        temmObj = ((Discipline) o).recupererInfo(resultat);
                    }

                    if ("Ecole".equals(NomBDD)) {
                        o = new Ecole();
                        temmObj = ((Ecole) o).recupererInfo(resultat);
                    }

                    if ("Personne".equals(NomBDD)) {
                        o = new Personne();
                        temmObj = ((Personne) o).recupererInfo(resultat);
                    }

                    if ("Enseignement".equals(NomBDD)) {
                        o = new Enseignement();
                        temmObj = ((Enseignement) o).recupererInfo(resultat);
                    }

                    if ("Evaluation".equals(NomBDD)) {
                        o = new Evaluation();
                        temmObj = ((Evaluation) o).recupererInfo(resultat);
                    }

                    if ("Inscription".equals(NomBDD)) {
                        o = new Inscription();
                        temmObj = ((Inscription) o).recupererInfo(resultat);
                    }

                    if ("Niveau".equals(NomBDD)) {
                        o = new Niveau();
                        temmObj = ((Niveau) o).recupererInfo(resultat);
                    }

                    if ("Trimestre".equals(NomBDD)) {
                        o = new Trimestre();
                        temmObj = ((Trimestre) o).recupererInfo(resultat);
                    }
                    
                    if(temmObj != null){
                        temp.add(temmObj);
                    }
                    
                    temmObj =null; 
                } while (resultat.next());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return temp;
    }
    
    public static void modifierParId(int id, Object o){
         try {
            st = cnx.createStatement();
            String query = "";

            if (o instanceof AnneeScolaire) {
                query = ((AnneeScolaire) o).modifierBDD();
            }

            if (o instanceof Bulletin) {
                query = ((Bulletin) o).modifierBDD();
            }

            if (o instanceof Classe) {
                query = ((Classe) o).modifierBDD();
            }

            if (o instanceof DetailBulletin) {
                query = ((DetailBulletin) o).modifierBDD();
            }

            if (o instanceof Discipline) {
                query = ((Discipline) o).modifierBDD();
            }

            if (o instanceof Ecole) {
                query = ((Ecole) o).modifierBDD();
            }

            if (o instanceof Personne) {
                query = ((Personne) o).modifierBDD();
            }

            if (o instanceof Enseignement) {
                query = ((Enseignement) o).modifierBDD();
            }

            if (o instanceof Evaluation) {
                query = ((Evaluation) o).modifierBDD();
            }

            if (o instanceof Inscription) {
                query = ((Inscription) o).modifierBDD();
            }

            if (o instanceof Niveau) {
                query = ((Niveau) o).modifierBDD();
            }

            if (o instanceof Trimestre) {
                query = ((Trimestre) o).modifierBDD();
            }

            st.executeUpdate(query);
            System.out.println("Produit modifié " + o.getClass());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
