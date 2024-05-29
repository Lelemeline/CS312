import java.lang.Math ;
import java.util.Scanner;
// code le plus moche que j'ai fait je crois ne surtout pas regarder /!\
public class histogramme{
	public static void tri_a_bulles(int[] tableau) {
		for(int i = (tableau.length)-1;i>=1;i--) {
			for(int j = 0;j<=i-1;j++) {
				if(tableau[j+1]>tableau[j]) {
					int a = tableau[j+1];
					tableau[j+1] = tableau[j];
					tableau[j] = a;
				}
			}
		}	
	}
	public static int max(float a,float b,float c,float d,float e,float f,float g,float h,float j) {
		float max = 0;
		if(a>max) {max =a;}
		if(b>max) {max =b;}
		if(c>max) {max =c;}
		if(d>max) {max =d;}
		if(e>max) {max =e;}
		if(f>max) {max =f;}
		if(g>max) {max =g;}
		if(h>max) {max =h;}
		if(j>max) {max =j;}
		
		return Math.round(max);
	}
	public static void repartition(int[] tableau) {
		// partie répartition
		float a,b,c,d,e,f,g,h,j ; 
		a = b = c = d = e = f = g= h = j = 0;
		for(int i = 0;i<(tableau.length);i++) {
			if(tableau[i]>=0 && tableau[i]<=9) { a++;}
			else if(tableau[i]>=0 && tableau[i]<=9) { a++;}
			else if(tableau[i]>=10 && tableau[i]<=19) { a++;}
			else if(tableau[i]>=20 && tableau[i]<=29) { b++;}
			else if(tableau[i]>=30 && tableau[i]<=39) { c++;}
			else if(tableau[i]>=40 && tableau[i]<=49) { d++;}
			else if(tableau[i]>=50 && tableau[i]<=59) { e++;}
			else if(tableau[i]>=60 && tableau[i]<=69) { f++;}
			else if(tableau[i]>=70 && tableau[i]<=79) { g++;}
			else if(tableau[i]>=80 && tableau[i]<=89) { h++;}
			else if(tableau[i]>=90 && tableau[i]<=99) { j++;}
		}
		a = (a/tableau.length)*100;
		b = (b/tableau.length)*100;
		c = (c/tableau.length)*100;
		d = (d/tableau.length)*100;
		e = (e/tableau.length)*100;
		f = (f/tableau.length)*100;
		g = (g/tableau.length)*100;
		h = (h/tableau.length)*100;
		j = (j/tableau.length)*100;	
		//partie affichage
		for(int i = max(a,b,c,d,e,f,g,h,j) ; i>=0; i--) {
			System.out.print(i+" %"+(char)9);
			if(Math.round(a) >= i ) {System.out.print("****");} 
			System.out.print((char)9);
			if(Math.round(b) >= i) {System.out.print("****");}
			System.out.print((char)9);
			if(Math.round(c) >= i) {System.out.print("****");}
			System.out.print((char)9);
			if(Math.round(d) >= i) {System.out.print("****");}
			System.out.print((char)9);
			if(Math.round(e) >= i) {System.out.print("****");}
			System.out.print((char)9);
			if(Math.round(f) >= i) {System.out.print("****");}
			System.out.print((char)9);
			if(Math.round(g) >= i) {System.out.print("****");}
			System.out.print((char)9);
			if(Math.round(h) >= i) {System.out.print("****");}
			System.out.print((char)9);
			if(Math.round(j) >= i) {System.out.print("****");} 	
			System.out.println(" ");
		}
		System.out.println('\t' + "0-9" + '\t' + "10-19"+ '\t' + "20-29"+ '\t' + "30-39"+ '\t' + "40-49"+ '\t' + "50-59"+ '\t' + "60-69"+ '\t' + "70-79"+ '\t' + "80-89"+ '\t' + "90-99");
		
	}
	
	public static void main(String[] args) {
		//nombre N
		Scanner entree = new Scanner(System.in);
		System.out.println("Donner un nombre N d'entiers à générer aléatoirement");
		int N = entree.nextInt();
		int[] chiffres = new int[N];
		//génération de N nombres aléatoires
		for(int i = 0;i<N;i++) {
			chiffres[i] = (int) (Math.random()*101) ;
		}
		tri_a_bulles(chiffres);
		repartition(chiffres);
		entree.close();
	}
}