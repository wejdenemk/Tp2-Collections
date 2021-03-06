package entreprise;

import java.util.HashMap;

public class entreprise {
	private String NomEntrprise;
	HashMap<Integer, Departement> Liste_Dep;
	
	public entreprise(String nomEntrprise, HashMap<Integer, Departement> liste_Dep) {
		super();
		NomEntrprise = nomEntrprise;
		Liste_Dep = new HashMap<>(liste_Dep);
	}
	
	public entreprise(String nomEntrprise) {
		NomEntrprise = nomEntrprise;
		Liste_Dep = new HashMap<>();
	}

	public String getNomEntrprise() {
		return NomEntrprise;
	}

	public void setNomEntrprise(String nomEntrprise) {
		NomEntrprise = nomEntrprise;
	}

	public HashMap<Integer, Departement> getListe_Dep() {
		return Liste_Dep;
	}

	public void setListe_Dep(HashMap<Integer, Departement> liste_Dep) {
		Liste_Dep = liste_Dep;
	}
	
	public void ajoutDep(Departement D) {
		Liste_Dep.put(Liste_Dep.size() , D);
	}
	
	public void retirerDep(Departement D) {
		for (Departement i : Liste_Dep.values()) {
			if(i.getCapacity() == D.getCapacity()) { 
				Liste_Dep.remove(D.keySet(),D);
				System.out.println("Departement a ete supprimer  ");
		}	}
	}
	
	public String afficheE() {
		return "entreprise [NomEntrprise=" + NomEntrprise + ", Liste_Dep=" + Liste_Dep.toString() + "]";
	}
	
	public boolean existeD(Departement D) {
		boolean test= false;
		for (Departement i : Liste_Dep.values()) {
			 if(i == D) {
				 test= true;
			}}
		return test;
	}
	
	public int DepMinCapacity() {
		Departement C = new Departement(0,500);
		for (Departement i : Liste_Dep.values()) {
			 if(i.getCapacity()<C.getCapacity()) {
				C = i;
			}}
		return (C.getIdDep());
	}
	
	
	public void UpdateDep(employe E , int idDep) {
		for (Departement i : Liste_Dep.values()) {
			 if(i.getIdDep() == E.getNumDep()) {
				 i.retirerEmploye(E);
			 }
			 if(i.getIdDep() == idDep) {
				 i.ajoutEmploye(E);
			 } 
		}
	
	}
	
}
