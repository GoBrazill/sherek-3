package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoD_LitrosDeCombustívelViagem {

	public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    
		//variáveis
		double Tempo, Velocidade, Distância, LitrosUsados;
		
		//entrada
		System.out.print("Digite o tempo gasto: ");
		Tempo = scn.nextDouble();
		
		System.out.print("Digite a velocidade média: ");
		Velocidade = scn.nextDouble();
		
		//cálculos
		Distância = Tempo * Velocidade;
		LitrosUsados = Distância / 12;
		
		//saída
		System.out.print("Você percorreu " + Distância + "KM" + " e utilizou " + LitrosUsados + " litros nessa viagem");
		
		scn.close();
	}

}
