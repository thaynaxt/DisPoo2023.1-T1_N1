package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.print ("\n ------ SOMA NÚMERICA DE QUATRO NÚMEROS INTEIROS ------ \n\n");
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Informe o primeiro número inteiro:");
	    int n1= sc.nextInt();
	    System.out.println ("Informe o segundo número inteiro:");
	    int n2= sc.nextInt();
	    System.out.println ("Informe o terceiro número inteiro:");
	    int n3= sc.nextInt();
	    System.out.println ("Informe o quarto número inteiro:");
	    int n4= sc.nextInt();
	    int snum = n1+n2+n3+n4;
	System.out.println ("A soma númerica dos quatro números é: "+ snum);

	}

}
