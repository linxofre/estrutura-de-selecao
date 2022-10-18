package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
/*
 * 12.As Organiza��es Tabajara resolveram 
 * dar um aumento de sal�rio aos seus 
 * colaboradores e lhe contrataram para 
 * esenvolver o programa que calcular� os 
 * reajustes. 
Fa�a um programa que recebe o sal�rio 
de um colaborador e calcule o reajuste 
segundo o seguinte crit�rio, baseado no 
sal�rio atual: 
sal�rios at� R$ 280,00 (incluindo) : 
aumento de 20% 
sal�rios entre R$ 280,00 e R$ 700,00 : 
aumento de 15% 
sal�rios entre R$ 700,00 e R$ 1500,00 : 
aumento de 10% 
sal�rios de R$ 1500,00 em diante : 
aumento de 5% Ap�s o aumento ser 
realizado, informe na tela: 

sal�rio antes do reajuste; 
percentual de aumento aplicado; 
valor do aumento; 
novo sal�rio, ap�s o aumento. */
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o sal�rio: ");
		double salario= entrada.nextDouble();
		double reajuste = 0;
		double aumento = 0;
		
		if (salario < 280) {
			System.out.println("sal�rio de:"+salario);
			aumento = (salario*20)/100;
			System.out.println("aumento de 20%:"+aumento);
			reajuste = (aumento + salario);
			System.out.println("sal�rio reajustado:"+reajuste);
		}else
			if ((salario >= 280) && (salario <= 700)){
				System.out.println("sal�rio de:"+salario);
				aumento = (salario*15)/100;
				System.out.println("aumento de 15%:"+aumento);
				reajuste = (aumento + salario);
				System.out.println("sal�rio reajustado:"+reajuste);
			}else
				if ((salario > 700) && (salario < 1500)){
					System.out.println("sal�rio de:"+salario);
					aumento = (salario*10)/100;
					System.out.println("aumento de 10%:"+aumento);
					reajuste = (aumento + salario);
					System.out.println("sal�rio reajustado:"+reajuste);
				}else
					if (salario > 1500){
						System.out.println("sal�rio de:"+salario);
						aumento = (salario*5)/100;
						System.out.println("aumento de 5%:"+aumento);
						reajuste = (aumento + salario);
						System.out.println("sal�rio reajustado:"+reajuste);
					}
		entrada.close();
	}

}
