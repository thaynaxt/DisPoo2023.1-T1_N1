package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 System.out.println ("\n ------ ÁREA DE UM CÍRCULO ------\n");
		 	Scanner sc = new Scanner (System.in);
		    System.out.println ("Digite o valor do raio do círculo:");
		    double raio= sc.nextDouble();
		    double area= 3.14 *(raio*raio);
		    System.out.println ("A área do círculo é: "+ area);
	}
}