package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoC_VolumeLataDeÓleo {

	public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
		
        //variáveis
	double Volume, Raio, Altura;
		
	//entrada
	System.out.print("digite a altura: ");
	Altura = scn.nextDouble();
		
	System.out.print("digite o raio: ");
	Raio = scn.nextDouble();
		
	//cálculo
	Volume = 3.14159 * Raio * Raio * Altura;
		
	//saída
	System.out.print("o volume é: " + Volume);
		
	scn.close();

	}

}
