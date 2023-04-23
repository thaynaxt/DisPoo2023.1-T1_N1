package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		System.out.println("\n ------ TABUADA DE MULTIPLICAÇÃO ------\n");
    int num1;
    int num2;
    int M = 0;
    int T =0;		
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o número que você deseja ver a tabuada:");
    num1 = sc.nextInt();
    System.out.println("Digite até qual número você deseja ver a tabuada:");
    num2= sc.nextInt();
    for (int x= 0; x < num2; x++) {
    	T= num1 * ++M ;
    	System.out.println(num1 + " X " + M + " = " + T); 
    }
	}
}