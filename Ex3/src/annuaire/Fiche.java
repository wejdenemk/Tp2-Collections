package annuaire;

public class Fiche {
	private String nom;
	private int numero= -1;
	private String adresse= null;
	
	public Fiche(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Fiche [nom=" + nom + ", numero=" + numero + ", adresse=" + adresse + "]";
	}

	
}
