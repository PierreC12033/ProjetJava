/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionBDD;
/**
 * Bibliothèques et packages
 */
import java.sql.*;
import java.util.ArrayList;
import modele.*;
import controleur.*;
import Reporting.*;

/**
 *
 * @author Elias
 */
public class ConnectMySQL {

    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    static boolean accepted;
    private String user;
    private String password;
    private String NomTable;
    /**
     * Constructeur par défault
     */
    public ConnectMySQL() {
        user="";
        password="";
        NomTable="";
    }
    /**
     * Getter de String user
     * @return user String
     */
    public String getUser() {
        return user;
    }
    /**
     * Getter de String password
     * @return password String
     */
    public String getPassword() {
        return password;
    }
    /**
     * Getter de String Nom Table
     * @return NomTable String
     */
    public String getNomTable() {
        return NomTable;
    }
    /**
     * Setter de String User
     * @param user String
     */
    public void setUser(String user) {
        this.user = user;
    }
    /**
     * Setter de String Password
     * @param password String
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Setter de NomTable
     * @param NomTable String
     */
    public void setNomTable(String NomTable) {
        this.NomTable = NomTable;
    }
    /**
     * Constructeur surchargé
     * @param user String
     * @param password String
     * @param NomTable String
     */
    public ConnectMySQL(String user, String password, String NomTable) {
        this.user = user;
        this.password = password;
        this.NomTable = NomTable;
    }

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here

        cnx = connecterDB("localhost","3306","ecole","root","");

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



        */
    }

    /**
    * Connection à la base de données avec données predefinis
    * @return Connection
    * @see Connection type definis dans les package SQL
    */
    public static Connection connecterDB(String server, String port, String bdd_name, String user, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url = "jdbc:mysql://"+server+":"+port+"/"+bdd_name;
            cnx = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion bien établié");
            setAccepted(true);
            return cnx;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            setAccepted(false);
            return null;

        }
    }
    /**
     * Getter de l'Objet Connection
     * @return cnx objet de classe Connection
     */
    public static Connection getCnx() {
        return cnx;
    }
    /**
     * Défini la valeur de l'attribut Objet Connecion
     * @param cnx un objet de classe Connection
     */
    public static void setCnx(Connection cnx) {
        ConnectMySQL.cnx = cnx;
    }
    /**
     * Getter de l'objet Statement
     * @return st l'objet de classe Statement
     */
    public static Statement getSt() {
        return st;
    }
    /**
     * Définie l'objet Statement
     * @param st objet de classe Statement
     */
    public static void setSt(Statement st) {
        ConnectMySQL.st = st;
    }
    /**
     * Getter de l'objet ResultSet
     * @return rst l'objet de classe ResultSet
     */
    public static ResultSet getRst() {
        return rst;
    }
    /**
     * Défini l'objet ResultSet
     * @param rst objet de classe ResultSet
     */
    public static void setRst(ResultSet rst) {
        ConnectMySQL.rst = rst;
    }
    /**
     * Getter du boolean accepted
     * @return accepted attribut booléen
     */
    public static boolean getAccepted() {
        return accepted;
    }
    /**
     * Défini le boolean accepted
     * @param accepted attribut boolean
     */
    public static void setAccepted(boolean accepted) {
        ConnectMySQL.accepted = accepted;
    }


    /**
     * Permet d'ajouter un object dans une table
     * @param o correspond à l'objet a ajouté
     * @see Object comme il est parent de toute nos classe il permet de moduler notre code
     */
    public void AjouterP(Object o) {
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
     * Supprime un objet d'une table et des tables associés
     * @param o Object envoie à supprimer
     */
    public void Supprimer(Object o) {

        String mdd = String.valueOf(o.getClass());

        String idobj=null;

        String NomBDD= mdd.substring(13);
        ArrayList<Object> f=null;

        String NomT="";

        if(o instanceof Enseignant || o instanceof Eleve) {
            NomBDD = "Personne";
        }

            if (o instanceof AnneeScolaire) {
                f = new ArrayList<>();

                idobj= String.valueOf(((AnneeScolaire) o).getId());
                NomT = "AnneeScolaire";

                f=rechercher("Id"+NomT, idobj, "Classe");
                f.addAll(rechercher("Id"+NomT, idobj, "Trimestre"));

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Bulletin) {

                f = new ArrayList<>();

                idobj= String.valueOf(((Bulletin) o).getId());
                NomT = "Bulletin";

                f=rechercher("Id"+NomT, idobj, "DetailBulletin");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Classe) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Classe) o).getId());
                NomT = "Classe";


                f=rechercher("Id"+NomT, idobj, "Inscription");
                f.addAll(rechercher("Id"+NomT, idobj, "Enseignement"));

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof DetailBulletin) {
                f = new ArrayList<>();

                idobj= String.valueOf(((DetailBulletin) o).getId());
                NomT = "DetailBulletin";

                f=rechercher("Id"+NomT, idobj, "Evaluation");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Discipline) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Discipline) o).getId());
                NomT = "Discipline";

                f=rechercher("Id"+NomT, idobj, "Enseignement");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }
                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Ecole) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Ecole) o).getId());
                NomT = "Ecole";

                f=rechercher("Id"+NomT, idobj, "Classe");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }
                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Personne) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Personne) o).getId());
                NomT = "Personne";

                if(((Personne) o).isType()){
                    System.out.println("PROF");
                    f=rechercher("Id"+NomT, idobj, "Enseignement");
                }else {
                    System.out.println("ELEVE");
                    f=rechercher("Id"+NomT, idobj, "Inscription");
                }

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Enseignement) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Enseignement) o).getId());
                NomT = "Enseignement";

                f=rechercher("Id"+NomT, idobj, "DetailBulletin");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Evaluation) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Evaluation) o).getId());
                NomT = "Evaluation";

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Inscription) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Inscription) o).getId());
                NomT = "Inscription";

                f=rechercher("Id"+NomT, idobj, "Bulletin");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Niveau) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Niveau) o).getId());
                NomT = "Niveau";

                f=rechercher("Id"+NomT, idobj, "Classe");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }

            if (o instanceof Trimestre) {
                f = new ArrayList<>();

                idobj= String.valueOf(((Trimestre) o).getId());
                NomT = "Trimestre";

                f=rechercher("Id"+NomT, idobj, "Bulletin");

                if(f.isEmpty()){
                    System.out.println("Aucun element");
                }else{
                    for(int i=0; i < f.size(); i++){
                        Supprimer(f.get(i));
                    }
                }

                SupprimerAtt("Id", idobj, NomT);
            }
    }
    /**
     * Supprimer les objets qui ont la valeur val pour l'attribut att dans la table NomBDD
     * @param att attribut de recherche
     * @param val valeur de sélection
     * @param NomBDD Nom de la Table pour supprimer
     */
    public void SupprimerAtt(String att, String val, String NomBDD){

        String req = "DELETE FROM " + NomBDD + " WHERE "+att+" ='"+val+"'";

        try {
            st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Element "+att+"="+val+" de la table "+NomBDD+" bien supprime");
        } catch (SQLException e) {
            System.out.println("SQL M: "+e.getMessage());
        }
    }

    /**
     * recherche l'id d'un ojet du type de l'Object o
     * @param id, l'id de l'objet à rechercher dans notre BDD
     * @param o, l'object que l'on recherche dans notre BDD
     * @return Une liste d'object
     * @see Object comme il est parent de toute nos classe il permet de moduler notre code
     */
    public ArrayList<Object> rechercherParId(int id, Object o) {

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
    /**
     * Recherche les objets qui ont la valeur valAtt  pour l'attribut attribut de la table NomBDD
     * @param attribut
     * @param valAtt
     * @param NomBDD
     * @return un arraylist d'objets
     */
    public ArrayList<Object> rechercher(String attribut, String valAtt, String NomBDD) {

        Object temmObj =null;
        Object o = null;

        String req ="SELECT * FROM " + NomBDD;


        if(!valAtt.equals(attribut)){
            req+= " WHERE "+attribut+" = '"+valAtt+"'";
        }

        ArrayList<Object> temp = new ArrayList<>();

        try {
            st = cnx.createStatement();
            ResultSet resultat = st.executeQuery(req);

            if (!resultat.next()) {
                System.out.println("Aucun element n'a cette valeur pour l'attribut "+attribut+" dans la table "+NomBDD);
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
    /**
     * Modifie l'objet du type o et d'id id
     * @param id id de l'objet dans la table
     * @param o type de l'objet / table
     */
    public void modifierParId(int id, Object o){
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
