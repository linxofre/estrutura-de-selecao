package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_7 {

	public static void main(String[] args) {
		/* Fa�a um Programa que leia tr�s 
		 * n�meros e mostre-os em ordem decrescente
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int a = entrada.nextInt();
		System.out.print("Informe o SEGUNDO n�mero: ");
		int b = entrada.nextInt();
		System.out.print("Informe o terceiro n�mero: ");
		int c = entrada.nextInt();
		int apoio = 0;
		
		if (a < c) {
			apoio = a;
			a = c;
			c = apoio;
		}
		if (a < b) {
			apoio = a;
			a = b;
			b = apoio;
		}
		if (b < c) {
			apoio = b;
			b = c;
			c = apoio;
		}
		entrada.close();
		System.out.println("\n A ordem decrescente �: ");
		System.out.println("\n 1�: "+ a);
		System.out.println("\n 2�: "+ b);
		System.out.println("\n 3�: "+ c);
	}
	

}
