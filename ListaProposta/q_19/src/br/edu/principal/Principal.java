package br.edu.principal;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ ÁREA DA DIMENSÃO E POTÊNCIA DE ILUMINAÇÃO ------ \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma das dimesões do cômodo em metros:");
		double per1 = sc.nextDouble();
	    System.out.println("Informe a outra dimensão em metros:");
	    double per2= sc.nextDouble();
	    double área = per1*per2;
	    int pot = (int) área*18;
	    DecimalFormat formatador= new DecimalFormat("0.00");
	    System.out.println("A área do comodo é: " + formatador.format(área)+"²." + "\nA potencia de iluminação a ser utilizada é: " +pot + " W" );
	}
}
