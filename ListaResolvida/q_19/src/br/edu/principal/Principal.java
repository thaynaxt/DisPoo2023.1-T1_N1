package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println ("\n ------ QUANTIDADE DE DEGRAUS ------ \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do degrau da escada: ");
		double adeg = sc.nextDouble();
		System.out.println("Digite a altura que você deseja alcançar subindo a escada: ");
		double ausu = sc.nextDouble();
		double qtd_degraus = ausu / adeg;
		System.out.println("Você irá subir "+qtd_degraus+" degraus");
	}
}
