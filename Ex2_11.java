package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_11 {

	public static void main(String[] args) {
		/*11.Faça um Programa que pergunte 
		 * em que turno você estuda. Peça para 
		 * digitar M-Matutino ou V-Vespertino 
		 * ou N- Noturno. 
		 * Imprima a mensagem "Bom Dia!", "Boa 
		 Tarde!" ou "Boa Noite!" , conforme o caso. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu turno de estudo: ");
		String turno= entrada.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("MATUTINO");
			System.out.println("Bom dia!");
		}else
			if (turno.equalsIgnoreCase("v")) {
				System.out.println("VESPERTINO");
				System.out.println("Boa tarde!");
			}else
				if (turno.equalsIgnoreCase("n")) {
					System.out.println("NOTURNO");
					System.out.println("Boa noite!");
				}else
					System.out.println("que horário é esse meu jovem?");
				
		entrada.close();
		
	}

}
