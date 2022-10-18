package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*2. Faça um Programa que peça um valor e 
		 * mostre na tela se o valor é 
		 * positivo, negativo ou zero. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor: ");
		double num = entrada.nextInt();
		
		if (num == 0) {
			System.out.println("o "+ num + " é zero!");
			
		}
		else {
			if (num > 0) 
				System.out.println("o "+ num + " é positivo");
				
			if (num < 0) 
				System.out.println("o "+ num + " é negativo");
			;	
		}
		entrada.close();
	}

}
