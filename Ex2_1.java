package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		/*1. Fa�a um Programa que pe�a dois 
		 * n�meros e imprima o maior deles. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Informe o primeiro n�mero: ");
		double n1= entrada.nextInt();
		System.out.print("Informe o SEGUNDO n�mero: ");
		double n2= entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println("o "+ n1 + " � maior que o "+ n2);
			
		}
		else {
			if (n2 > n1) 
				System.out.println("o "+ n2 + " � maior que o "+ n1);
				
			if (n1 == n2) 
				System.out.println("os dois s�o iguais");
			;	
		}
		entrada.close();
	}

}
