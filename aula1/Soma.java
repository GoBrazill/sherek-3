package aula1;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1;
	    int num2;
	    int soma;

	    System.out.print("digite o numero 1 = ");
	    num1 = scn.nextInt();
	    
	    System.out.print("digite o segundo numero = ");
	    num2 = scn.nextInt();
	    
	    soma = num1 + num2;
	    
	    System.out.print("Soma =" + soma);
	    
	   scn.close(); 
	}

}
