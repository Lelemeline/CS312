public class Sous{
	public static void main(String[] args) {
		int compteur = 0;
		for(int deux = 0; deux<=50;deux++) {
			for(int cinq= 0;cinq<20;cinq++) {
				for(int dix = 0;dix<=10;dix++) {
					if((dix*10+cinq*5+deux*2)==100) {
						System.out.println("1€= "+dix +"x10c+ "+ cinq+"x5c+ " + deux + "x2c.");
					}
					compteur+=1;
				}
			}
		}
		System.out.println("En tout il y a "+ compteur+" façons de faire 1€.");
	}
}