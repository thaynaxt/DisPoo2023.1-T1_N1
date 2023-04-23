package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ QUANTIDADE DE SALÁRIOS MÍNIMOS ------ \n");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor do salário: ");
		double sal = sc.nextDouble ();
		double salmin = 1302;
		double qtsalmin = sal/salmin ;
		DecimalFormat formatador= new DecimalFormat("0.0");
		System.out.println("O funcionário recebe: "+ formatador.format(qtsalmin) +" salários mínimos.");
	}
}
