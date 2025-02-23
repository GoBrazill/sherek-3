package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoG_Ler4ValoresNuméricos {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		//variáveis
		int a ,b, c, d, multiA, multiB, multiC, soma;
		
		//entrada
		System.out.print("Digite a variável A: ");
		a = scn.nextInt();
		
		System.out.print("Digite a variável B: ");
		b = scn.nextInt();
		
		System.out.print("Digite a variável C: ");
		c = scn.nextInt();
		
		System.out.print("Digite a variável D: ");
		d = scn.nextInt();
		
		//cálculo
		multiA = a * b;
		multiB = a * c;
		multiC = a * d;
		soma = multiA + multiB + multiC;
		
		//saída
		System.out.print("O resultado do cálculo é: " + soma);
		
		scn.close();
	}

}
