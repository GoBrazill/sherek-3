package exercíciosAAtéH;

import java.util.Scanner;

public class CálculoIMC {

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in); 
			
			//variáveis
			double Peso, Altura, IMC;

			//entrada
			System.out.print("Digite o seu peso: ");
			Peso = scn.nextDouble();
			
			System.out.print("Digite o sua altura: ");
			Altura = scn.nextDouble();
			
			//cálculo
			IMC = Peso / (Altura * Altura);
			
			//saída
			System.out.print("O seu IMC é: " + IMC);
			
			if (IMC <18.5) System.out.print(", Você está abaixo do peso");
			
			else if(IMC >18.5 && IMC<24.9) System.out.print(", Você está no peso ideal");
			
			else if (IMC >24.9 && IMC<29.9) System.out.print(", Você tem sobrepeso");
			
			else if (IMC >29.9 && IMC<34.9) System.out.print(", Você tem obesidade grau I");
			
			else if (IMC >34.9 && IMC<39.9) System.out.print(", Você tem obesidade grau II");
			
			else if (IMC >39.9) System.out.print(", Você tem obesidade grau III");
			
			scn.close();

		}

	}
		

	


