package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.Vehicule;

public class VehiculeModele {
    private String datelocation;
    private String dateretour;
    private String modele;
    private String motCle;
    private String categorie;
    private int nbreplace;
    private List<Vehicule> vehicules=new ArrayList<Vehicule>();
    public VehiculeModele() {
        // TODO Auto-generated constructor stub
        
    }
    

    /**
	 * @return the motCle
	 */
	public String getMotCle() {
		return motCle;
	}


	/**
	 * @param motCle the motCle to set
	 */
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}


	public String getDatelocation() {
        return datelocation;
    }

    public void setDatelocation(String datelocation) {
        this.datelocation = datelocation;
    }

   public String getDateretour() {
        return dateretour;
    }

    public void setDateretour(String dateretour) {
        this.dateretour = dateretour;
    }

    public String getModele() {
        return modele;
    }
    
   public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getNbreplace() {
        return nbreplace;
    }

    public void setNbreplace(int nbreplace) {
        this.nbreplace = nbreplace;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }
}
