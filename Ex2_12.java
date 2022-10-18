package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
/*
 * 12.As Organizações Tabajara resolveram 
 * dar um aumento de salário aos seus 
 * colaboradores e lhe contrataram para 
 * esenvolver o programa que calculará os 
 * reajustes. 
Faça um programa que recebe o salário 
de um colaborador e calcule o reajuste 
segundo o seguinte critério, baseado no 
salário atual: 
salários até R$ 280,00 (incluindo) : 
aumento de 20% 
salários entre R$ 280,00 e R$ 700,00 : 
aumento de 15% 
salários entre R$ 700,00 e R$ 1500,00 : 
aumento de 10% 
salários de R$ 1500,00 em diante : 
aumento de 5% Após o aumento ser 
realizado, informe na tela: 

salário antes do reajuste; 
percentual de aumento aplicado; 
valor do aumento; 
novo salário, após o aumento. */
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salário: ");
		double salario= entrada.nextDouble();
		double reajuste = 0;
		double aumento = 0;
		
		if (salario < 280) {
			System.out.println("salário de:"+salario);
			aumento = (salario*20)/100;
			System.out.println("aumento de 20%:"+aumento);
			reajuste = (aumento + salario);
			System.out.println("salário reajustado:"+reajuste);
		}else
			if ((salario >= 280) && (salario <= 700)){
				System.out.println("salário de:"+salario);
				aumento = (salario*15)/100;
				System.out.println("aumento de 15%:"+aumento);
				reajuste = (aumento + salario);
				System.out.println("salário reajustado:"+reajuste);
			}else
				if ((salario > 700) && (salario < 1500)){
					System.out.println("salário de:"+salario);
					aumento = (salario*10)/100;
					System.out.println("aumento de 10%:"+aumento);
					reajuste = (aumento + salario);
					System.out.println("salário reajustado:"+reajuste);
				}else
					if (salario > 1500){
						System.out.println("salário de:"+salario);
						aumento = (salario*5)/100;
						System.out.println("aumento de 5%:"+aumento);
						reajuste = (aumento + salario);
						System.out.println("salário reajustado:"+reajuste);
					}
		entrada.close();
	}

}
