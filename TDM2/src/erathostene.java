import java.util.ArrayList;
import java.util.Scanner;
public class erathostene{
	public static void afficher_array(ArrayList<Integer> tableau) {
		for(int i = 0;i<tableau.size();i++) {
			System.out.print(tableau.get(i) + " ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Donnez le plus grand nombre entier à examiner : ");
		Scanner entree = new Scanner(System.in);
		int N = entree.nextInt();
		ArrayList<Integer> liste= new ArrayList<>();
		for(int i=1;i< N+1;i++) {
			liste.add(i);
		}
		int racine  = (int) Math.sqrt(N);
		System.out.println("racine = "+racine);
		for(int j =2;j<=racine;j++) {
			for(int x= 1;x<liste.size();x++) {
//				System.out.print("x ="+ liste.get(x) + " j = "+ j + " ");
//				System.out.println((liste.get(x)%j)==0);
				
				if((liste.get(x)%j)==0) {
					if(liste.get(x)==j) continue;
					else liste.remove(x);
				}
				
			}
		}
		System.out.println("Entre 1 et "+ N + " les nombres premiers sont : ");
		afficher_array(liste);
		entree.close();
	}
	
}