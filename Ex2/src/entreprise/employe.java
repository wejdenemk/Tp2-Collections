package entreprise;

public class employe {
	private int cin;
	private String nom;
	private double salaire;
	private int NumDep;
	
	public employe(int cin, String nom, double salaire, int numDep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		NumDep = numDep;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public int getNumDep() {
		return NumDep;
	}

	public void setNumDep(int numDep) {
		NumDep = numDep;
	}

	@Override
	public String toString() {
		return "employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", NumDep=" + NumDep + "]";
	}

	
	
	
}
