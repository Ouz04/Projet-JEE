package model;

public class Vehicule {
	
	String immatricule,modele,categorie;
	int codecat,nbreplace;
	float prix;

		public Vehicule() {
		super();
	}
	public Vehicule(String immatricule, String modele, String categorie, int nbreplace,float prix) {
		super();
		this.immatricule = immatricule;
		this.modele = modele;
		this.categorie = categorie;
		
		this.nbreplace = nbreplace;
		this.prix = prix;
	}






		/**
	 * @return the prix
	 */
	public float getPrix() {
		return prix;
	}



	/**
	 * @param prix the prix to set
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}



		public String getImmatricule() {
	        return immatricule;
	    }

	 

	    public void setImmatricule(String immatricule) {
	        this.immatricule = immatricule;
	    }

	 

	    public int getNbreplace() {
	        return nbreplace;
	    }

	 

	    public void setNbreplace(int nbreplace) {
	        this.nbreplace = nbreplace;
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



		/**
		 * @return the codecat
		 */
		public int getCodecat() {
			return codecat;
		}



		/**
		 * @param codecat the codecat to set
		 */
		public void setCodecat(int codecat) {
			this.codecat = codecat;
		}
	    
	}
	
	


