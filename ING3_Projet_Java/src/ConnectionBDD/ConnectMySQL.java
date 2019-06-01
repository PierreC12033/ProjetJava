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

        AnneeScolaire a = new AnneeScolaire(700, 10, 20);
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
        
        System.out.println("Tous les elements on été créé ");
        
        modifierParId(t.getId(), t);
          /*
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
       
      
        Object lllll = d;
        
        ArrayList<Object> k=new ArrayList<Object>();
        k=rechercherParId(t.getId(), t);
        
        for (Object sublist : k) {
        System.out.println(sublist.toString());
        } 
        */
        
        
         
    }

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
            return null;
        }
    }

    public static void AjouterP(Object o) {
        try {
            st = cnx.createStatement();
            String query = "";

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

    public static ArrayList<Object> rechercherParId(int id, Object o) {
        
        String mdd = String.valueOf(o.getClass());
        
        String NomBDD= mdd.substring(13);
        Object temmObj =null;
        
        if(o instanceof Enseignant || o instanceof Eleve) {
            NomBDD = "Personne";
        }
        
        String req = "SELECT * FROM " + NomBDD + " WHERE Id =?";
        System.out.println(req);
        ArrayList<Object> temp = new ArrayList<>();

        //System.out.println(req);
        try {
            st = cnx.createStatement();
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, id);
            ResultSet resultat = pst.executeQuery();

            if (!resultat.next()) {
                System.out.println("Cette Id n'est pas dans la table");
            } else {
                System.out.println("Voici les résultat :");
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
