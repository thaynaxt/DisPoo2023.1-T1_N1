package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println ("\n ------ VALOR DO SALDO ------ \n");
		Scanner sc = new Scanner (System.in);
	    System.out.println ("Informe o valor do salário:");
	    double salario= sc.nextDouble();
	    System.out.println ("Informe o valor do primeiro cheque retirado:");
	    double cheque1= sc.nextDouble();
	    System.out.println ("Informe o valor do segundo cheque retirado:");
	    double cheque2= sc.nextDouble();
	    double cpmf1= cheque1*0.38/100;
	    double cpmf2= cheque2*0.38/100;
	    double saldo= salario - cheque1 - cheque2 - cpmf1 - cpmf2;
	    DecimalFormat formatador= new DecimalFormat("0.00");
		System.out.println ("O valor do saldo é: R$"+ formatador.format(saldo));
	}
}