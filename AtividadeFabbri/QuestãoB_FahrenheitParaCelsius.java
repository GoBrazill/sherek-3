package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoB_FahrenheitParaCelsius {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		//variáveis
		double Celsius, fahrenheit;
		
		//entrada
		System.out.print("Digite a temperatura: ");
		fahrenheit = scn.nextDouble();
		
		//cálculo
		Celsius = ((fahrenheit - 32) * 5) / 9;
		
		//saída
		System.out.print("A temperatura é: " + Celsius + "C°");

		scn.close();
		
	}

}
