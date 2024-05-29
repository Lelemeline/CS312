import java.util.ArrayList;
import java.util.Scanner;

public class arraylists{
	public static float calcul_moyenne(ArrayList<Float> notes, ArrayList<Float> coeff) {
		float moyenne = 0;
		float den = 0;
		for(int i=0;i<notes.size()-1;i++) {
			moyenne += notes.get(i)*coeff.get(i);
			den += coeff.get(i);
		}
		return moyenne/den;
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
		for (int i = 0;i<notes.size()-1 ;i++) {
			System.out.println("Merci de saisir le coefficient "+ (i+1));
			coeff.add(entree.nextFloat());
		}
		float moyenne = calcul_moyenne(notes,coeff);
		System.out.println("Votre moyenne est "+ moyenne);
		entree.close();
	}
}