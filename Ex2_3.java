package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		/*3. Fa�a um Programa que verifique se 
		 * uma letra digitada � "F" ou "M". Conforme 
		 *a letra escrever: F - Feminino, M - Masculino 
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a letra: ");
		String letra = entrada.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
			
		}
		else {
			if (letra.equalsIgnoreCase("m")) {
				System.out.println("Masculino");
				
			}else 
				System.out.println("indefinido");
			;	
		}
		entrada.close();
	}

}
