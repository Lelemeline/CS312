import java.util.Arrays;
public class Stats{
	public static void main(String[] args) {
		/*int[] notes= { 6, 13, 16, 3, 10, 8, 3, 20, 5, 9, 10, 11, 15, 15, 5, 1, 0, 16,
				2, 2 } ;*/
		int[] notes = {1, 11, 15, 19, 20, 24, 28, 34, 37, 47, 50, 61};
		Arrays.sort(notes);
		for(int i=0;i<notes.length;i++) {
			System.out.print(notes[i]+" , ");
		}
		System.out.println("la médiane est "+ mediane(notes)+" et le premier quartile est à "+pquartile(notes)+ " et le troisème quartile est à " + tquartile(notes));
	}
	private static int mediane(int[] notes) {
		int taille = notes.length;
		System.out.println("la taille est "+ taille);
		//effectif pair
		if(taille%2==0) {
			int moyenne = (notes[(taille/2)-1] + notes[(taille/2)])/2 ;
			return moyenne;
		}
		//effectif impair
		else {
			return notes[((taille+1)/2)-1];
		}
	}
	private static int pquartile(int[] notes) {
		int p= (notes.length+3)/4 ;
		if(notes.length%2==0) {
			int q = (notes[p-1]+3*notes[p])/4;
			return q;
		}
		else {
			return notes[p-1];
		}
		
	}
	private static int tquartile(int[] notes) {
		int q = 3*((notes.length+1)/4) ;
		if(notes.length%2==0) {
			int p = (notes[q-1]*3 + notes[q])/4;
			return p;
		}
		else {
			return notes[q];
		}
	}
}