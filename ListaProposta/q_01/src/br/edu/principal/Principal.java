package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ SUBTRAÇÃO DE NÚMEROS ------ \n");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número: ");
			double num1 = sc.nextDouble ();
		System.out.println("Digite outro número: ");
			double num2 = sc.nextDouble ();
			double sub = num1-num2 ;
		DecimalFormat formatador= new DecimalFormat("0.00");
		System.out.println("A subtração dos números é "+ formatador.format(sub));

	}
}