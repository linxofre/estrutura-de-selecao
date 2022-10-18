package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_9 {

	public static void main(String[] args) {
		/*9. Tendo como dado de entrada a 
		 * altura, peso e sexo, construa 
		 * um algoritmo que calcule o peso 
		 * ideal, utilizando as seguintes fórmulas:
			Para homens: (72.7*h) - 58 
			Para mulheres: (62.1*h) - 44.7 
			(h = altura)
			Ao final o algoritmo deve mostrar:
			- Altura, peso e sexo;
			- Peso Ideal;
			- Mensagem se está acima, 
			  abaixo ou no peso ideal; */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o gênero: ");
		String genero = entrada.next();
		System.out.print("Informe a altura: ");
		double h = entrada.nextDouble();
		System.out.print("Informe o peso atual: ");
		double p = entrada.nextDouble();
		double p_ideal = 0;
		
		if (genero.equalsIgnoreCase("f")) {
			p_ideal = (62.1 * h) - 44.7;
			System.out.println("gênero: "+genero);
			System.out.println("altura: "+h);
			System.out.println("peso atual: "+p);
			System.out.println("peso ideal: "+p_ideal);
		}	
		if (genero.equalsIgnoreCase("m")) {
			p_ideal = (72.7 * h) - 58;
			System.out.println("gênero: "+genero);
			System.out.println("altura: "+h);
			System.out.println("peso atual: "+p);
			System.out.println("peso ideal: "+p_ideal);
		}
		entrada.close();
		
	}

}
