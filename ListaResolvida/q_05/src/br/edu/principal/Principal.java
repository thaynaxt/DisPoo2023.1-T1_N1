package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		 System.out.println ("\n ------ AUMENTO DE SALÁRIO ------ \n");
		    Scanner sc = new Scanner (System.in);
		    System.out.println ("Informe o valor do sálario:");
		    double sal= sc.nextDouble();
		    System.out.println ("Qual foi o percentual de aumento?");
		    double per= sc.nextDouble();
		    double aum = sal*per/100;
		    double novosal= sal + aum;
		    System.out.println ("O aumento é: R$"+aum);
		System.out.println ("O novo sálario é: R$"+novosal);
		
	}

}