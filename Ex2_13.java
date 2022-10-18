package exercicio2_estruturas_selecao;

import java.util.Scanner;

public class Ex2_13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salário: ");
		double salario= entrada.nextInt();
		System.out.print("Informe as horas trabalhadas: ");
		double horas= entrada.nextInt();
		double bruto = (salario * horas);
		double inss ;
		double fgts = ((11 * bruto)/100);
		double ir ;
		//double liquido = bruto-inss-ir;
		
		if (bruto <= 0) {
			System.out.println("não trabalhou ou tá devendo!");
		}
		if ((bruto > 0) && (bruto <= 900)) {
			System.out.println("salário bruto: "+bruto);
			System.out.println("IR: Isento");
			System.out.println("INSS: "+(inss=(10 * bruto)/100));
			System.out.println("FGTS: "+fgts);
			System.out.println("total de descontos: "+inss);
			System.out.println("Salário líquido: "+(bruto-inss));
		}
		if ((bruto > 900) && (bruto < 1500)){
			System.out.println("salário bruto: "+bruto);
			System.out.println("IR: "+(ir= (bruto * 5)/100));
			System.out.println("INSS: "+(inss=(10 * bruto)/100));
			System.out.println("FGTS: "+fgts);
			System.out.println("total de descontos: "+(inss+ir));
			System.out.println("Salário líquido: "+(bruto - (ir + inss)));
		}
		if ((bruto >= 1500) && (bruto < 2500)){
			System.out.println("salário bruto: "+bruto);
			System.out.println("IR: "+(ir = (10 * bruto)/100));
			System.out.println("INSS: "+(inss=(10 * bruto)/100));
			System.out.println("FGTS: "+fgts);
			System.out.println("total de descontos: "+(inss+ir));
			System.out.println("Salário líquido: "+(bruto - (ir + inss)));
		}
		if ((bruto >= 2500)) {
			System.out.println("salário bruto: "+bruto);
			System.out.println("IR: "+(ir=(20 * bruto)/100));
			System.out.println("INSS: "+(inss=(10 * bruto)/100));
			System.out.println("FGTS: "+fgts);
			System.out.println("total de descontos: "+(inss+ir));
			System.out.println("Salário líquido: "+(bruto - (inss + ir)));
		}			
		entrada.close();
	}

}
