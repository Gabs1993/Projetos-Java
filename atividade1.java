package Gabriel;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o segundo valor: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o terceiro valor: ");
		c = leia.nextInt();
		
		if (a > b && a > c) {
			System.out.println("\nO maior valor é: "+a);
		} 
		else if (b > c && b > a) {
			System.out.println("\nO maior valor é: "+b);
		}
		if (c > a && c > b) {
			System.out.println("\nO maior valor é: "+c);
		}
		
	}
		
	
}
	
		
	


