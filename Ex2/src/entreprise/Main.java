package entreprise;

public class Main {

	public static void main(String[] args) {
		employe E1 = new employe(123,"ETUD1",12.5,1);
		employe E2 = new employe(456,"ETUD2",18.6,1);
		employe E3 = new employe(789,"ETUD3",17.7,2);
		employe E4 = new employe(741,"ETUD4",13,2);
		employe E5 = new employe(78,"ETUD5",15.3,3);
		employe E6 = new employe(76,"ETUD6",17,3);
		
		Departement D1 = new Departement(1, 20);
		Departement D2 = new Departement(2, 30);
		Departement D3 = new Departement(3, 40);
		
		entreprise E = new entreprise("Entrep");
		
		D1.ajoutEmploye(E1);
		D1.ajoutEmploye(E2);
		D2.ajoutEmploye(E3);
		D2.ajoutEmploye(E4);
		D3.ajoutEmploye(E5);
		D3.ajoutEmploye(E6);
		
		E.ajoutDep(D1);
		E.ajoutDep(D2);
		E.ajoutDep(D3);
		
		
		System.out.print("Les departement: \n");
		System.out.println(D1.afficheDep());
		System.out.println(D2.afficheDep());
		System.out.println(D3.afficheDep());
		
		
		D1.retirerEmploye(E1);
		System.out.println("\n Retirer un employe E1 du deprt D1:  "+D1.afficheDep());
		
		
		
		System.out.println("\n Entrprise: ");
		System.out.println(E.afficheE());
		
		System.out.println("\n Checking if D2 existe ou non dans lentreprise :"+E.existeD(D2));
		
		System.out.println("\n ID du deprt qui a le min capacity :"+E.DepMinCapacity());
		
		
		System.out.println("\n Deplacer E6 au Dprmt 1: ");
		E.UpdateDep(E6 , 1);
		System.out.println(E.afficheE()+"\n");
		
		E.retirerDep(D1);
		
		System.out.println("\n Checking if un employe de cin donn� existe ou non dans le depmt D2: "+D2.exicteE(111));

	}
}
