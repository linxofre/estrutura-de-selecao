package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_4 {

	public static void main(String[] args) {
		/*4. Fa�a um Programa que pe�a para 
		 * entrar com um ano com 4 d�gitos e 
		 * determine se o mesmo � ou n�o 
		 * bissexto. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a letra: ");
		int ano = entrada.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println("o ano "+ano+" � bissexto");
			
		}
		else {
			System.out.println("o ano "+ano+ " n�o � bissexto");	
		}
		entrada.close();
	}

}
