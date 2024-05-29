import java.lang.Math ;
public class pi{
	public static void main(String[] args) { 
		int N = 800 ;
		float PI = 4 * boucle(N);
		System.out.println("pi a pour valeur : "+PI);
	}
	
	private static float boucle(int args) { 
		float sum = 0 ;
		for (int i=0;i<args;i++) {
			sum += (Math.pow(-1, i))/((2*i)+1);
		}
		return sum;
	}
}