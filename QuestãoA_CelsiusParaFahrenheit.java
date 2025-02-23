package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoA_CelsiusParaFahrenheit {

	public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
		
        //variáveis
		double Celsius, fahrenheit;
		
		//entrada
		System.out.print("Digite a temperatura: ");
		Celsius = scn.nextDouble();
		
		//cálculo
		fahrenheit = Celsius * 9 / 5 + 32;
		
		//saída
		System.out.print("A temperatura em fahrenheit é: " + fahrenheit + "F°");
		
		scn.close();

	}

}



