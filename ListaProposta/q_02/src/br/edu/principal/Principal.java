package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ MULTIPLICAÇÃO DE TRÊS NÚMEROS ------ \n");
		Scanner sc  = new Scanner (System.in);
		System.out.println("Digite o primeiro número a ser multiplicado:");
		double N1 = sc.nextDouble ();
		System.out.println("Digite o segundo número a ser multiplicado: ");
		double N2 = sc.nextDouble ();
		System.out.println("Digite o terceiro número a ser multiplicado: ");
		double N3 = sc.nextDouble ();
		double MT = N1 * N2* N3;
		System.out.println("O resultado da multiplicação é: "+ MT);
	}
}
