package annuaire;

import java.util.HashMap;
import java.util.TreeMap;

public class Annuaire {
	HashMap< String ,Fiche > TA ;

	public Annuaire(HashMap<String, Fiche> tA) {
		super();
		TA = new HashMap<>(tA);
	}
	

	public Annuaire() {
		TA = new HashMap<>();
	}


	public HashMap<String, Fiche> getTA() {
		return TA;
	}

	public void setTA(HashMap<String, Fiche> tA) {
		TA = tA;
	}
	
	
	public void getNBconttacts(){
		System.out.println(TA.size());
	}
	
	public void addContact(String s, Fiche f) {
		TA.put(s,f);
	}
	
	public void getContact(String name) {
		for (String i : TA.keySet()) {
			 if(i == name) {
			 System.out.println(TA.get(i).toString());
			}}
	}

	public void affiche() {
		for (String i : TA.keySet()) {
			 System.out.println(i);
			}
	
	}
	
	public void afficher() {
		TreeMap<String , Fiche> TM = new TreeMap<String, Fiche>(TA);
		for (String i : TM.keySet()) {
			 System.out.println(i);
			}
	}

	
}
