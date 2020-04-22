package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import requetes.VehiculeConnect;

public class CatalogueVehicule implements Catalogue {

	public void addVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("insert into vehicule (immatricule,categorie,modele,nbreplace,prix) values (?,?,?,?,?)");
            ps.setString(1, v.getImmatricule());
            ps.setString(2, v.getModele());
            ps.setString(3, v.getCategorie());
            ps.setInt(4, v.getNbreplace());
            ps.setFloat(5, v.getPrix());
           
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public List<Vehicule> listVehicules() {
		List<Vehicule> vehi=new ArrayList<Vehicule>();
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("select immatricule,categorie,modele,nbreplace,prix from vehicule");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                Vehicule vh=new Vehicule();
            vh.setImmatricule(rs.getString("immatricule"));
            vh.setModele(rs.getString("modele"));
            vh.setCategorie(rs.getString("categorie"));
            vh.setNbreplace(rs.getInt("nbreplace"));
            vh.setPrix(rs.getFloat("prix"));
            
            vehi.add(vh);
            }
            ps.close();
           
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       return vehi;
    }
	 public List<Vehicule> VehiculesParMC(String mc)
	 {
		 List<Vehicule> vehi=new ArrayList<Vehicule>();
	        Connection cn=VehiculeConnect.getConnection();
	        try {
	            PreparedStatement ps=cn.prepareStatement("select immatricule,categorie,modele,nbreplace,prix from vehicule where modele like ?");
	            ps.setString(1, "%"+mc+"%");
	            ResultSet rs=ps.executeQuery();
	            while(rs.next()) {
	                Vehicule vh=new Vehicule();
	            vh.setImmatricule(rs.getString("immatricule"));
	            vh.setModele(rs.getString("modele"));
	            vh.setCategorie(rs.getString("categorie"));
	            vh.setNbreplace(rs.getInt("nbreplace"));
	            vh.setPrix(rs.getFloat("prix"));
	            
	            vehi.add(vh);
	            }
	            ps.close();
	           
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	       return vehi;
	 }
	

	
	public Vehicule getVehicule(String immatricule) {
        Vehicule v=null;
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("select immatricule,categorie,modele,nbreplace,prix from vehicule where immatricule=?");
            ps.setString(1, immatricule);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
            v=new Vehicule();
            v.setImmatricule(rs.getString("immatricule"));
            v.setModele(rs.getString("modele"));
            v.setCategorie(rs.getString("categorie"));
            v.setNbreplace(rs.getInt("nbreplace"));
            v.setPrix(rs.getFloat("prix"));
           
            }
            ps.close();
           
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(v==null) throw new RuntimeException ("vehicule introuvable");
        return v;
    }

	
	public void updateVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("update vehicule set categorie=?, modele=?, nbreplace=?,prix=? where immatricule=?");
            ps.setString(5, v.getImmatricule());
            ps.setString(2, v.getModele());
            ps.setString(1, v.getCategorie());
            ps.setInt(3, v.getNbreplace());
            ps.setFloat(4, v.getPrix());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}

	
	public void deleteVehicule(String immatricule) {
		// TODO Auto-generated method stub
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("delete vehicule where immatricule=?");
            ps.setString(1, immatricule);
           
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}
	public void addReservation(Reservation r)
	{
		
		Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("insert into louer (immatricule,id_client) values (?,?)");
           System.out.println(r.getIdClient());
            ps.setString(1,  r.getImmatricule());
            ps.setInt(2,  r.getIdClient());
 
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
    
    
    public List<Reservation> listReservations()
    {
    	List<Reservation> reserv=new ArrayList<Reservation>();
        Connection cn=VehiculeConnect.getConnection();
        try {
            PreparedStatement ps=cn.prepareStatement("SELECT nom,prenom,modele,categorie FROM client c, vehicule v, louer l WHERE c.id_client = l.id_client and v.immatricule=l.immatricule");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	Reservation vh=new Reservation();
            	vh.setCategorie(rs.getString("categorie"));
            	vh.setModele(rs.getString("modele"));
            	vh.setNom(rs.getString("nom"));
            	vh.setIdClient(rs.getInt("id_client"));
            
            vh.setImmatricule(rs.getString("immatricule"));
           
           
            
            reserv.add(vh);
            }
            ps.close();
           
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       return reserv;
    	
    }

}
