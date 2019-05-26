/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConnectionBDD;
import java.sql.*;
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

        Connection cnx=connecterDB();
        AjouterP(100,2,4);
        AjouterP(200,54,48);
        SupprimerParID(100, "AnneeScolaire");
     
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
   
    public static void AjouterP(int id,int DD, int DF){
        try{
            String query="INSERT INTO AnneeScolaire VALUES("+id+",'"+DD+"',"+DF+")";
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Produit ajouté");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
   
    public static void SupprimerParID(int id, String NomBDD){
        try{
           String query="DELETE FROM "+ NomBDD +" WHERE id="+id; 
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Produit supprimé");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    } 
}