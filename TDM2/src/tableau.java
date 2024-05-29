import java.util.Scanner;

public class tableau{
	public static float calcul_moyenne(float[] notes, float[] coeff) {
		float moyenne = 0;
		float den = 0 ;
		for(int i = 0 ; i<notes.length;i++) {
			moyenne += notes[i]*coeff[i];
			den += coeff[i];
		}
		return moyenne/den;
	}
	public static void main(String[] args) {
		System.out.println("Merci de saisir le nombre de notes :");
		Scanner entree = new Scanner (System.in);
		int nombre_note = entree.nextInt();
		float[] notes = new float[nombre_note];
		float[] coeff = new float[nombre_note];
		for (int i=0;i<nombre_note;i++) {
			System.out.println("Merci de saisir la note "+ (i+1));
			notes[i] = entree.nextFloat();			
		}
		for (int i=0;i<nombre_note;i++) {
			System.out.println("Merci de saisir le coeff "+ (i+1));
			coeff[i] = entree.nextFloat();			
		}
		float moyenne = calcul_moyenne(notes,coeff);
		System.out.println("Votre moyenne est de "+ moyenne);
		entree.close();
	}
}