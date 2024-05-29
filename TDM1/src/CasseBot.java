import java.util.Scanner;

public class CasseBot {
	public static void main(String[] args) {
		System.out.println("Quel est votre nom?");
		Scanner entree = new Scanner (System.in);
		String name = entree.nextLine();
		System.out.println("Bonjour "+ name);
		System.out.println("Choisissez le changement de casse que vous souhaitez opérer : Majuscule, Minuscule, Titre");
		String chgmt = entree.nextLine();
		System.out.println("Quelle entrée doit être traitée?");
		String line = entree.nextLine();
		System.out.println("changement is "+ chgmt+ " and line is "+line);
		switch(chgmt) {
			case("Majuscule"): 
				Majuscule(line); break ;
			case("Minuscule"): 
				Minuscule(line); break ;
			case("Titre"): 
				Titre(line); break ;
		}
		System.out.println();
		entree.close();
	}
	
	public static void Majuscule(String args) {
		System.out.print(args.toUpperCase());
	}
	public static void Minuscule(String args) {
		System.out.print(args.toLowerCase());
	}
	public static void Titre(String args) {
		String[] words = args.split(" ");
		for (String word : words) {
			Majuscule(word.substring(0,1));
			Minuscule(word.substring(1));
			System.out.print(" ");
        }
	}
}