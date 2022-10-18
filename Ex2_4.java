package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_4 {

	public static void main(String[] args) {
		/*4. Faça um Programa que peça para 
		 * entrar com um ano com 4 dígitos e 
		 * determine se o mesmo é ou não 
		 * bissexto. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a letra: ");
		int ano = entrada.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println("o ano "+ano+" é bissexto");
			
		}
		else {
			System.out.println("o ano "+ano+ " não é bissexto");	
		}
		entrada.close();
	}

}
