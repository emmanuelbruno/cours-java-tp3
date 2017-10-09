package fr.univtln.bruno.tp.tp3.exDuCours;

public class Personne implements Comparable<Personne> {

	private int id;
	private String nom;
	private String prenom;
	private int anneeDeNaissance;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// @Override
	/*
	 * public boolean equals(Object arg0) { if (arg0 instanceof Personne) return
	 * id == ((Personne) arg0).id; else return super.equals(arg0); }
	 */

	public boolean equals(Personne arg0) {
		// return nom.equals(arg0.nom) && prenom.equals(prenom);
		return id == arg0.id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// return (nom+prenom).hashCode();
		return id;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Personne p1 = new Personne(1, "Durand", "Pierre", 1950);
		Personne p2 = new Personne(1, "Durand", "Pierre", 1950);
		Personne p3 = new Personne(3, "Durand", "Marc", 1950);
		
		System.out.println("P1:" + p1.hashCode() + ",P2:" + p2.hashCode()
				+ ",P3:" + p3.hashCode());

		// p1.id==p2.id
		if (p1.equals(p3))
			System.out.println("OK");
		else
			System.out.println("NON");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + id + ")" + nom + " " + prenom;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the anneeDeNaissance
	 */
	public int getAnneeDeNaissance() {
		return anneeDeNaissance;
	}

	/**
	 * @param anneeDeNaissance
	 *            the anneeDeNaissance to set
	 */
	public void setAnneeDeNaissance(int anneeDeNaissance) {
		this.anneeDeNaissance = anneeDeNaissance;
	}

	public Personne(int id, String nom, String prenom, int anneeDeNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.anneeDeNaissance = anneeDeNaissance;
	}

	@Override
	public int compareTo(Personne arg0) {
		return id - arg0.id;
	}

}
