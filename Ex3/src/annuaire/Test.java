package annuaire;

public class Test {

	public static void main(String[] args) {
		
		
		Fiche F1 = new Fiche("Fiche 1");
		Fiche F2 = new Fiche("Fiche 2");
		Fiche F3 = new Fiche("Fiche 3");
		Fiche F4 = new Fiche("Fiche 4");
		
		Annuaire An1 = new Annuaire();
		
		An1.addContact("c",F2);
		An1.addContact("a",F1);
		An1.addContact("b",F3);
		An1.addContact("k",F4);
		
		
		System.out.println("Annuaire:  ");
		An1.affiche();
		
		System.out.println("\n");
		System.out.print("Fiche du contact:  ");
		An1.getContact("a");
		
		System.out.print("Nombre du contact:  ");
		An1.getNBconttacts();
		
		
		System.out.println("Annuaire:  ");
		An1.afficher();
	}
}
