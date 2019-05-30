/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author elias
 */
public class DetailBulletin {
    private int id;
    private int idBulletin;
    private int idEnseignement;
    private String Appreciation;

    public DetailBulletin() {
    }
    
    public DetailBulletin(int id, int idBulletin, int idEnseignement, String Appreciation) {
        this.id = id;
        this.idBulletin = idBulletin;
        this.idEnseignement = idEnseignement;
        this.Appreciation = Appreciation;
    }

    @Override
    public String toString() {
        return "id=" + id + ", idBulletin=" + idBulletin + ", idEnseignement=" + idEnseignement + ", Appreciation=" + Appreciation;
    }
    
    public String ajouterBDD(){
        return "INSERT INTO DetailBulletin VALUES("+this.id+","+this.idBulletin+","+this.idEnseignement+",'"+this.Appreciation+"')";
    }
    
    public DetailBulletin recupererInfo(ResultSet r){ 
        DetailBulletin a = null;
        try{
            a=new DetailBulletin(r.getInt(1), r.getInt(2), r.getInt(3), r.getString(4));
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return a;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBulletin() {
        return idBulletin;
    }

    public void setIdBulletin(int idBulletin) {
        this.idBulletin = idBulletin;
    }

    public int getIdEnseignement() {
        return idEnseignement;
    }

    public void setIdEnseignement(int idEnseignement) {
        this.idEnseignement = idEnseignement;
    }

    public String getAppreciation() {
        return Appreciation;
    }

    public void setAppreciation(String Appreciation) {
        this.Appreciation = Appreciation;
    }
    
    
}
