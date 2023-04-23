package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    System.out.println("\n ------- IDADE ATUAL E IDADE EM 2005 ------ \n");
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Informe o ano que você nasceu:");
	    int nasc= sc.nextInt();
	    System.out.println ("Informe o ano atual:");
	    int data=sc.nextInt();
	    int idd = data - nasc;
	    System.out.println ("Você tem ou irá completar "+idd+" anos esse ano.\n");
	    int ano05 = 2005 - nasc;
	    
	    if ( nasc == 2005 ) {
	 	   System.out.println ("Você nasceu em 2005");
	    }
	   else if (ano05 <= 0 ) {
		   System.out.println ("Em 2005 você não era nascido.");
	   }
	   else {
	   System.out.println ("Em 2005 você tinha " +ano05+ " anos.");
	   }
	}
}