package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_5 {

	public static void main(String[] args) {
		/*5. Fa�a um Programa que verifique 
		 * se uma letra digitada � vogal.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a letra: ");
		String letra = entrada.next();
		
		if ((letra.equalsIgnoreCase("a"))
			|| (letra.equalsIgnoreCase("e")) 
			|| (letra.equalsIgnoreCase("i")) 
			|| (letra.equalsIgnoreCase("o")) 
			|| (letra.equalsIgnoreCase("u"))){
			System.out.println("a letra '"+letra+"' � uma vogal");
		}
		else {
			System.out.println("o ano '"+letra+ "' N�O � uma vogal");	
		}
		entrada.close();
	}

}
