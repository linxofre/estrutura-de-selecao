package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_14 {

	public static void main(String[] args) {
		/*14. Fa�a um Programa que leia um n�mero 
		 * e exiba o dia correspondente da semana. 
		 * (1-Domingo, 2-Segunda, etc.), 
		 * se digitar outro valor deve 
		 * aparecer valor inv�lido.
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int dia = entrada.nextInt();
		
		if ((dia !=1) && (dia != 2) &&(dia != 3) 
				&&(dia != 4) &&(dia != 5) 
				&&(dia != 6) &&(dia != 7)){
			System.out.print("esse dia n�o existe");
		}
		if (dia == 1) {
			System.out.print("Domingo");
		}
		if (dia == 2) {
			System.out.print("Segunda");
		}
		if (dia == 3) {
			System.out.print("Ter�a");
		}
		if (dia == 4) {
			System.out.print("Quarta");
		}
		if (dia == 5) {
			System.out.print("Quinta");
		}
		if (dia == 6) {
			System.out.print("Sexta");
		}
		if (dia == 7) {
			System.out.print("S�bado");
		}
			
		entrada.close();
	}

}
