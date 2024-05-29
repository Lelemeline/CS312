import java.util.Scanner;
public class tableau2{
	public static void tri_a_bulles(float[] tableau) {
		for(int i = (tableau.length)-1;i>=1;i--) {
			for(int j = 0;j<=i-1;j++) {
				if(tableau[j+1]>tableau[j]) {
					float a = tableau[j+1];
					tableau[j+1] = tableau[j];
					tableau[j] = a;
				}
			}
		}	
	}
	public static void afficher(float[] tableau) {
		for(int i = 0 ; i<tableau.length;i++) {
			System.out.print(tableau[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Merci de saisir le nombre de notes :");
		Scanner entree = new Scanner (System.in);
		int nombre_note = entree.nextInt();
		float[] notes = new float[nombre_note];
		for (int i=0;i<nombre_note;i++) {
			System.out.println("Merci de saisir la note "+ (i+1));
			notes[i] = entree.nextFloat();			
		}
		tri_a_bulles(notes);
		System.out.println("Tableau de notes trié");
		afficher(notes);
		System.out.println(" ");
		System.out.println("La note max est "+ notes[0]+ " la note min est " + notes[notes.length-1]);
		entree.close();
	}
}




