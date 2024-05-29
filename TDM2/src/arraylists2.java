import java.util.ArrayList;
import java.util.Scanner;

public class arraylists2{
	public static void tri_a_bulles(ArrayList<Float> tableau) {
		for(int i = (tableau.size())-1;i>=1;i--) {
			for(int j = 0;j<=i-1;j++) {
				if(tableau.get(j+1)>tableau.get(j)) {
					float a = tableau.get(j+1);
					tableau.set(j+1,tableau.get(j));
					tableau.set(j,a) ;
				}
			}
		}	
	}
	public static void afficher_array(ArrayList<Float> tableau) {
		for(int i = 0;i<tableau.size()-1;i++) {
			System.out.print(tableau.get(i) + " ");
		}
	}
	public static void main(String[] args) {
		Scanner entree = new Scanner (System.in);
		ArrayList<Float> notes= new ArrayList<>();
		ArrayList<Float> coeff= new ArrayList<>();
		System.out.println("Merci de saisir la note (-1) si vous avez fini");
		float en = entree.nextFloat();
		notes.add(en);
		while(en!=(-1)) {
			System.out.println("Merci de saisir la note (-1) si vous avez fini");
			en = entree.nextFloat();
			notes.add(en);
		}
		System.out.println("Voilà l'array trié");
		tri_a_bulles(notes);
		afficher_array(notes);
		System.out.println();
		System.out.println("Note max = " + notes.get(0) + " note min = " + notes.get(notes.size()-2));
		entree.close();
	}
}