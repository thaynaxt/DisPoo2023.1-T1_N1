package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println ("\n ------ MÉDIA PONDERADA ------ \n");
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Informe a primeira nota:");
	    double n1= sc.nextDouble();
	    System.out.println ("Informe o peso desta nota:");
	    double p1= sc.nextDouble();
	    System.out.println ("Informe a segunda nota:");
	    double n2= sc.nextDouble();
	    System.out.println ("Informe o peso desta nota:");
	    double p2= sc.nextDouble();
	    System.out.println ("Informe a terceira nota:");
	    double n3= sc.nextDouble();
	    System.out.println ("Informe o peso desta nota:");
	    double p3= sc.nextDouble();
	   double media = (n1*p1 + n2*p2 + n3*p3)/ (p1 + p2 + p3);
	System.out.println ("A média ponderada das  notas é:"+ media);
	}
}
