package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ CONVERSÃO DE TEMPERATURA: CELSIUS PARA FAHRENHEIT ------ \n");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a temperatura em Celsius: ");
			int C = sc.nextInt();
			int F = (int) (C*1.8 + 32);
		System.out.println("A temperatura em Fahrenheit é: "+ F +"°F");
	}
}