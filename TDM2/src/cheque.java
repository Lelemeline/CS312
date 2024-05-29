import java.util.Scanner ;
import java.lang.Math ;

public class cheque{
	public static void unite(int chiffre) {
		System.out.print(chiffre);
		switch(chiffre) {
		case 0 : System.out.print("zero");break;
		case 1 : System.out.print("un");break;
		case 2 : System.out.print("deux");break;
		case 3 : System.out.print("trois");break;
		case 4 : System.out.print("quatre");break;
		case 5 : System.out.print("cinq");break;
		case 6 : System.out.print("six");break;
		case 7 : System.out.print("sept");break;
		case 8 : System.out.print("huit");break;
		case 9 : System.out.print("neuf");break;			
		}
	}
	public static void dizaine(int chiffre) {
		switch(chiffre) {
			case 0 : System.out.print("zero");break;
			case 1 : System.out.print("dix");break;
			case 2 : System.out.print("vingt");break;
			case 3 : System.out.print("trente");break;
			case 4 : System.out.print("quarante");break;
			case 5 : System.out.print("cinquante");break;
			case 6 : System.out.print("soixante");break;
			case 7 : System.out.print("soixante-dix");break;
			case 8 : System.out.print("quatre-vingt");break;
			case 9 : System.out.print("quatre-vingt-dix");break;	
		}
	}
	public static void ecriture(int montant) {
		int dig = (int) Math.log10(montant)+1;
		System.out.println(dig);
		while(dig>=0) {
			if (dig == 0) {
				int chiffre = montant ;
				unite(chiffre);
				dig --;
			}
			else {
				int chiffre = montant%(dig*10);
				switch (dig) {
					case 4 : unite(chiffre); System.out.print("mille"); break ;
					case 3 : unite(chiffre); System.out.print("cent"); break ;
					case 2 : dizaine(chiffre); break; 
				}
				System.out.print(" ");
				montant -=chiffre;
				montant/=10;
				System.out.println(montant);
				dig -- ;
			}
		}
			
		
	}
	public static void main(String[] args) {
		System.out.println("Donnez un montant");
		Scanner entree = new Scanner(System.in);
		int montant = entree.nextInt();
		ecriture(montant);
		System.out.println(" ");
		entree.close();
	}
}