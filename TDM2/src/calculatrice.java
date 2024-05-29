import java.util.Scanner;
class Operation{
	int op1;
	int op2;
	char op;
}

public class calculatrice {

	public static void operation(Scanner entree,Operation operation) {
		System.out.println("Donnez l'opérande 1 :");
		operation.op1 = entree.nextInt();
		System.out.println("Donnez l'opération :");
		operation.op = entree.next().charAt(0);
		System.out.println("Donnez l'opérande 2 :");
		operation.op2 = entree.nextInt();
	}
	public static void calcul(Operation operation) {
		switch(operation.op) {
		case '+' : 
			System.out.println(operation.op1+" + "+operation.op2+" = "+ (operation.op1+operation.op2)); break;
		case '-' : 
			System.out.println(operation.op1+" - "+operation.op2+" = "+ (operation.op1-operation.op2)); break;
		case '/' : 
			System.out.println(operation.op1+" / "+operation.op2+" = "+ (operation.op1/operation.op2)); break;
		case '*' : 
			System.out.println(operation.op1+" * "+operation.op2+" = "+ (operation.op1*operation.op2)); break;
		case '%' : 
			System.out.println(operation.op1+" % "+operation.op2+" = "+ (operation.op1%operation.op2)); break;
	}
	}
	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		Operation operation = new Operation();
		operation(entree,operation);
		if(operation.op == '/' && operation.op2 == 0) {
			System.out.println("Erreur de type:  boum Cruas") ;
			System.out.println("Veuillez redonner une nouvelle opération");
			operation(entree,operation);
		}
		else {
			calcul(operation);
		}
		
		entree.close();
		}
}