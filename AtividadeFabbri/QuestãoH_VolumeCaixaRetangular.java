package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoH_VolumeCaixaRetangular {

	public static void main(String[] args) {
		Scanner scn = new Scanner  (System.in);
		
		//variáveis
		Double volume, comprimento, largura, altura;
		
		//entrada
		System.out.print("Digite o comprimento da caixa: ");
		comprimento = scn.nextDouble();
		
		System.out.print("Digite a largura da caixa: ");
		largura = scn.nextDouble();
		
		System.out.print("Digite a altura da caixa: ");
		altura = scn.nextDouble();
		
		//cálculo
		volume = comprimento * largura * altura;
		
		//saída
		System.out.print("O volume da caixa é: " + volume);
		
		scn.close();

	}

}
