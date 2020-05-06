package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.Vehicule;

public class VehiculeModele {
	private String motCle;
    private Vehicule vehicule=new Vehicule();
    private List<Vehicule> vehicules=new ArrayList<Vehicule>();
    private String error;
    
    public VehiculeModele() {
        // TODO Auto-generated constructor stub
        
    }

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
    
    
    
}