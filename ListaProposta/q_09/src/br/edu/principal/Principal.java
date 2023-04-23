package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ ÁREA DE UM TRAPÉZIO ------ \n");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base maior do trapézio: ");
		double B1 = sc.nextDouble ();

		System.out.println("Digite o valor da base menor do trapézio: ");
		double b2 = sc.nextDouble ();
		
		System.out.println("Digite o valor da altura do trapézio: ");
		double h = sc.nextDouble ();

		double área = (B1+b2) * h / 2 ;
		System.out.println("A área do trapézio é : "+ área); 
	}
}