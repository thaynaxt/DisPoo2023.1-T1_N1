package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 System.out.println("\n ------ RESTO DO SALÁRIO APÓS PAGAMENTO DE CONTAS ATRASADAS COM MULTA DE 2% ------ \n");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o salário:");
			 double sal = sc.nextDouble();
		 System.out.println("Digite o valor da primeira conta:");
			 double c1 = sc.nextDouble();
		 System.out.println("Digite o valor da segunda conta:");
			 double c2 = sc.nextDouble();
			 double c1a = c1*2/100;
			 double c1j = c1 + c1a ;
			 double c2a = c2*2/100;
			 double c2j = c2 + c2a ;
			 double resul =  sal - (c1j+ c2j);
			 DecimalFormat formatador= new DecimalFormat("0.00");
		 System.out.println("Irá restar "+formatador.format(resul)+" do salário");

	}

}