package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_5 {

	public static void main(String[] args) {
		/*5. Faça um Programa que verifique 
		 * se uma letra digitada é vogal.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a letra: ");
		String letra = entrada.next();
		
		if ((letra.equalsIgnoreCase("a"))
			|| (letra.equalsIgnoreCase("e")) 
			|| (letra.equalsIgnoreCase("i")) 
			|| (letra.equalsIgnoreCase("o")) 
			|| (letra.equalsIgnoreCase("u"))){
			System.out.println("a letra '"+letra+"' é uma vogal");
		}
		else {
			System.out.println("o ano '"+letra+ "' NÃO é uma vogal");	
		}
		entrada.close();
	}

}
