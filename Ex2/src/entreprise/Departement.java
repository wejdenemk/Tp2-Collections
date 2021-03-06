package entreprise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class Departement {
	private int idDep;
	private int Capacity;
	Set<employe> LEmployes;
	
	public Departement(int idDep, int capacity, Set<employe> lEmployes) {
		super();
		this.idDep = idDep;
		Capacity = capacity;
		LEmployes = new HashSet<>(lEmployes);
	}

	public Departement(int idDep, int capacity) {
		super();
		this.idDep = idDep;
		Capacity = capacity;
		LEmployes = new HashSet<>();
	}



	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public Set<employe> getLEmployes() {
		return LEmployes;
	}

	public void setLEmployes(Set<employe> lEmployes) {
		LEmployes = lEmployes;
	}
	
	public void ajoutEmploye(employe E) {
		int S=E.getCin();
		if(S>0) {
				LEmployes.add(E);
				S++;
		}
	}
	
	public void retirerEmploye(employe E) {
		LEmployes.remove(E);

	}

	public String afficheDep() {
		return "Departement [idDep=" + idDep + ", Capacity=" + Capacity + ", List d'Employes=" + LEmployes.toString() + "]";
	}
	
	public boolean exicteE(int cin) {
		if(LEmployes.contains(cin)) {
			return true;
		}
		else {
		return false;}
	}
	
	public employe getEmpSalMax() {
		TreeSet<employe> TS=new TreeSet<>(LEmployes);
			 return TS.last();
	}

	@Override
	public String toString() {
		return "Departement [idDep=" + idDep + ", Capacity=" + Capacity + ", LEmployes=" + LEmployes + "]";
	}

	public Integer keySet() {
		// TODO Auto-generated method stub
		return idDep ;
	}
	

	
	
	
}
