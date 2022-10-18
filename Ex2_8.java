package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_8 {

	public static void main(String[] args) {
		/*8. Faça um programa para a leitura de 
		 * duas notas parciais de um aluno. 
		 * O programa deve calcular a média 
		 * alcançada pelo aluno e apresentar: 
		 * 
		 * o A mensagem "Aprovado", se a média 
		 * alcançada for maior ou igual a sete;
		 * 
		 * o A mensagem "Reprovado", se a média 
		 * for menor do que sete; */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double n1 = entrada.nextInt();
		System.out.print("Informe a SEGUNDA nota: ");
		double n2 = entrada.nextInt();
		double media = (n1+n2)/2;
		
		if (media >= 7) {
			System.out.println(media+": APROVADO! UHUUUULLL ");
		}else
			System.out.println(media+": reprovado, que tristeza");
		entrada.close();
	}
}
