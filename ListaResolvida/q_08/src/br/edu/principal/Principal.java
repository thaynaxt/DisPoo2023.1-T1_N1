package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ VALOR DE RENDIMENTO ------\n");
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Informe o valor do depósito:");
	    double dep= sc.nextDouble();
	    System.out.println ("Qual foi o percentual de juros?");
	    double juros= sc.nextDouble();
	    double rend = dep*juros/100;
	    double total= dep + rend;
	System.out.println ("O rendimento foi: "+rend +"%."+ "\nO valor total depois do rendimento foi: R$"+total+".");	
	}
}