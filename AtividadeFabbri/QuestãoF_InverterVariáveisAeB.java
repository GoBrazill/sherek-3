package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoF_InverterVariáveisAeB {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		//variáveis
		int a, b, variávelTemporária;
		
		//entrada
		System.out.print("Digite a variável A: ");
		a = scn.nextInt();
		
		System.out.print("Digite a variável B: ");
		b = scn.nextInt();
		
		//troca de valores
		variávelTemporária = a;
		a = b;
		b = variávelTemporária;
		
		//saída
		System.out.print("O valor de A é: " + a + ", e o valor de B é: " + b);
		
		scn.close();

	}

}
