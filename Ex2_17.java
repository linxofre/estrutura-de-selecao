package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double n1 = entrada.nextInt();
		System.out.print("Informe a SEGUNDA nota: ");
		double n2 = entrada.nextInt();
		double media = (n1+n2)/2;
		
		if ((media < 0)||(media > 10)) {
			System.out.println("digite as notas corretamente");
		}
		if ((media >= 0)&&(media <= 4)) {
			System.out.println("nota 1: "+n1+", nota 2: "+n2);
			System.out.println("Media: "+media);
			System.out.println("conceito: E");
			System.out.println("REPROVADO");
		}
		if ((media > 4)&&(media <= 6)) {
			System.out.println("nota 1: "+n1+", nota 2: "+n2);
			System.out.println("Media: "+media);
			System.out.println("conceito: D");
			System.out.println("REPROVADO");
		}
		if ((media > 6)&&(media <= 7.5)) {
			System.out.println("nota 1: "+n1+", nota 2: "+n2);
			System.out.println("Media: "+media);
			System.out.println("conceito: C");
			System.out.println("APROVADO");
		}
		if ((media > 7.5)&&(media <= 9)) {
			System.out.println("nota 1: "+n1+", nota 2: "+n2);
			System.out.println("Media: "+media);
			System.out.println("conceito: B");
			System.out.println("APROVADO");
		}
		if ((media > 9)&&(media <= 10)) {
			System.out.println("nota 1: "+n1+", nota 2: "+n2);
			System.out.println("Media: "+media);
			System.out.println("conceito: A");
			System.out.println("APROVADO");
		}
		entrada.close();
	}

}
