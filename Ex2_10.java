package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		/*10.Fa�a um Programa que leia tr�s 
		 * n�meros e mostre o maior e o 
		 * menor deles. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		double n1= entrada.nextInt();
		System.out.print("Informe o SEGUNDO n�mero: ");
		double n2= entrada.nextInt();
		System.out.print("Informe o terceiro n�mero: ");
		double n3= entrada.nextInt();
		double maior = 0;
		double menor = 0;
		
		if ((n1 >= n2)&&(n1 > n3)) {
			maior = n1;
		}
		if ((n2 >= n1)&&(n2 > n3)) {
			maior = n2;
		}
		if ((n3 >= n1)&&(n3 >= n2)) {
			maior = n3;
		}
		if ((n1 <= n2)&&(n1 < n3)) {
			menor = n1;
		}
		if ((n2 <= n1)&&(n2 < n3)) {
			menor = n2;
		}
		if ((n3 <= n2)&&(n3 <= n1)) {
			menor = n3;
		}
		entrada.close();
		System.out.println("o maior �: "+ maior);
		System.out.println("o menor �: "+ menor);
		
	}

}
