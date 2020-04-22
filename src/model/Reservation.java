package model;

import java.util.Date;

public class Reservation {
	
	

	private String immatricule,nom,modele,categorie;
	private int idClient;
	

	public Reservation() {
		super();
	}


	public Reservation(String immatricule,  int idClient) {
		super();
		this.immatricule = immatricule;
		
		this.idClient = idClient;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}


	/**
	 * @param modele the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}


	/**
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}


	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	/**
	 * @return the idClient
	 */
	public int getIdClient() {
		return idClient;
	}


	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the immatricule
	 */
	public String getImmatricule() {
		return immatricule;
	}


	/**
	 * @param immatricule the immatricule to set
	 */
	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}




	


	
	
	
	
}
