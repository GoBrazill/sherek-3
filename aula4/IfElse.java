package aula1;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade:");
		idade = scn.nextInt();
		
		if(idade >59) System.out.println("Você é mó velhaco mané");
			
		else if(idade <=58) System.out.println("Você já é grandão ein mané");
			
		else if(idade <18) System.out.println("Você é novinho mané"); 
		
		scn.close();
		
	}

}
