package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args) {
		/*6. Faça um Programa que peça um 
		 * número inteiro e se este número for 
		 * par, transforme-o em impar e vice-versa. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int num = entrada.nextInt();
		
		if (num == 0){
			System.out.println("o número '"+num+"' é par");
			System.out.println("mas agora é ímpar: "+(num+1));
		}
		else {
			if (num == 1) {
				System.out.println("o número '"+num+"' é ímpar");
				System.out.println("mas agora é par: "+(num+1));	
			}else
				if (num % 2 == 0) {
					System.out.println("o número '"+num+"' é par");
					System.out.println("mas agora é ímpar: "+(num+1));
				}else
					System.out.println("o número '"+num+"' é ímpar");
					System.out.println("mas agora é par: "+(num+1));
		}
		entrada.close();
	}

}
