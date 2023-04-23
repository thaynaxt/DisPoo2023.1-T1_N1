package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ VALOR DA HIPOTENUSA ------ \n");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o tamanho do cateto 1:");
		double C1 = sc.nextDouble();
		System.out.println("Digite o tamanho do cateto 2:");
		double C2 = sc.nextDouble();
		double H = Math.sqrt(Math.pow (C1,2) + Math.pow(C2,2));
		System.out.println( "O valor da hipotenusa é: "+H );
			
	}
}
