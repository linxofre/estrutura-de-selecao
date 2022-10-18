package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a origem: ");
		int origem = entrada.nextInt();
		System.out.print("Informe o valor: ");
		double valor = entrada.nextInt();
		
		if ((origem != 1)&&(origem != 2)&&
				(origem != 3)&&(origem != 4)&&
				(origem != 5)&&(origem != 6)&&
				(origem != 7)&&(origem != 8)) {
			System.out.print("Produto do IMPORTADO no valor de: R$"+valor);
		}
		if (origem == 1) {
			System.out.print("Produto do SUL no valor de: R$"+valor);
		}
		if (origem == 2) {
			System.out.print("Produto do NORTE no valor de: R$"+valor);
		}
		if (origem == 3) {
			System.out.print("Produto do LESTE no valor de: R$"+valor);
		}
		if (origem == 4) {
			System.out.print("Produto do OESTE no valor de: R$"+valor);
		}
		if ((origem == 5)||(origem == 6)) {
			System.out.print("Produto do NORDESTE no valor de: R$"+valor);
		}
		if ((origem == 7)||(origem == 8)) {
			System.out.print("Produto do CENTRO-OESTE no valor de: R$"+valor);
		}
		
		entrada.close();
	}

}
