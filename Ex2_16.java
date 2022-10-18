package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double n1 = entrada.nextInt();
		System.out.print("Informe a SEGUNDA nota: ");
		double n2 = entrada.nextInt();
		double media = (n1+n2)/2;
		
		if ((media >= 0)&&(media <= 3)) {
			System.out.println(media+": REPROVADO");
		}
		if ((media >3)&&(media <= 6.9)) {
			System.out.println(media+": em EXAME");
		}
		if ((media > 6.9)&&(media <= 10)) {
			System.out.println(media+": APROVADO! UHUUUULLL ");
		}
		entrada.close();
	}

}
