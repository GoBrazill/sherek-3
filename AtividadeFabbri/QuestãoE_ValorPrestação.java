package exercíciosAAtéH;

import java.util.Scanner;

public class QuestãoE_ValorPrestação {

	public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
		
        //Variáveis
	double prestação, valor, juros;
	int mesesSemPagar;
		
	//Entrada
	System.out.print("Digite o valor da prestação:  ");
	prestação= scn.nextDouble();
		
	System.out.print("Digite a taxa de juros:  ");
	juros = scn.nextDouble();
		
	System.out.print("Quantos meses ficou sem pagar?  ");
	mesesSemPagar = scn.nextInt();
		
	//Cálculo
	valor = prestação + (prestação * (juros / 100) * mesesSemPagar);
		
	//Saída
	System.out.print("O valor a ser pago são " + valor + " reais");
		
	scn.close();

	}

}
