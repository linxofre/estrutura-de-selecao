package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args) {
		/*6. Fa�a um Programa que pe�a um 
		 * n�mero inteiro e se este n�mero for 
		 * par, transforme-o em impar e vice-versa. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o n�mero: ");
		int num = entrada.nextInt();
		
		if (num == 0){
			System.out.println("o n�mero '"+num+"' � par");
			System.out.println("mas agora � �mpar: "+(num+1));
		}
		else {
			if (num == 1) {
				System.out.println("o n�mero '"+num+"' � �mpar");
				System.out.println("mas agora � par: "+(num+1));	
			}else
				if (num % 2 == 0) {
					System.out.println("o n�mero '"+num+"' � par");
					System.out.println("mas agora � �mpar: "+(num+1));
				}else
					System.out.println("o n�mero '"+num+"' � �mpar");
					System.out.println("mas agora � par: "+(num+1));
		}
		entrada.close();
	}

}
