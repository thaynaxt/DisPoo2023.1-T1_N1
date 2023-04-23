package br.edu.principal;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ PREÇO DE UM PRODUTO COM 10% DE DESCONTO ------ \n");
		Scanner sc  = new Scanner (System.in);
		System.out.println("Digite o preço do produto:");
		double pre = sc.nextDouble ();
        double npre = pre*10/100;
        double r = pre-npre;
        DecimalFormat formatador= new DecimalFormat("0.00");
        System.out.println("Com 10% de desconto o preço do produto fica: "+formatador.format(r));

	}
}
