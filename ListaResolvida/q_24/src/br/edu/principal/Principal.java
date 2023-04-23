package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ CONVERSOR: HORAS PARA MINUTOS ------ \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora: \nObs-> escreva nesse formato: 15,20 \nEsse é só um exemplo, você pode digitar a hora que desejar.");
		double hora = sc.nextDouble();
		int h = (int)hora;
		double m = hora - h;
		double conversão = (h * 60) + (m * 100);
		DecimalFormat formatador= new DecimalFormat("0");
		System.out.println("A conversão em minutos fica: "+ formatador.format (conversão)+ " min");
	
	}
}