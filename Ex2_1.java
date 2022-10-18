package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		/*1. Faça um Programa que peça dois 
		 * números e imprima o maior deles. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Informe o primeiro número: ");
		double n1= entrada.nextInt();
		System.out.print("Informe o SEGUNDO número: ");
		double n2= entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println("o "+ n1 + " é maior que o "+ n2);
			
		}
		else {
			if (n2 > n1) 
				System.out.println("o "+ n2 + " é maior que o "+ n1);
				
			if (n1 == n2) 
				System.out.println("os dois são iguais");
			;	
		}
		entrada.close();
	}

}
