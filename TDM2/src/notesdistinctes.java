import java.util.Scanner;
// programme qui ne fonctionne pas. algorithme à revoir
public class notesdistinctes{
	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		System.out.println("Donnez le nombre de notes ");
		int N = entree.nextInt();
		float[] notes = new float[N];
		System.out.println("Donnez les notes");
		for (int i=0;i<N;i++) {
			notes[i] = entree.nextFloat();
		}
		int diff = N;
		int nsame = 0 ;
		for(int i = 0;i<N-1;i++) {
			for(int j = 0;j<N-1;j++) {
				//System.out.println("notes i " + notes[i] + " notes j "+  notes[j]+ " : " +( notes[i]!=notes[j]) );
				if(notes[i]!=notes[j]) nsame ++;
			}
			if (nsame == 0) diff --;
		}
		System.out.println(diff);
		entree.close();
	}
}