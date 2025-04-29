package pacote;

import java.util.Scanner;

public class SituaçãoDesafiadora {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// variáveis
		Double vetor [] = new Double[9];
		
		// vetor 0 salário Bruto
		// vetor 1 dependentes
		// vetor 2 plano de saúde
		// vetor 3 vale transporte
		// vetor 4 vale alimentação
		// vetor 5 vale refeição
		// vetor 6 INSS
		// vetor 7 imposto de renda
		// vetor 8 salário líquido 
		
		// entrada
		System.out.println("Quanto é o seu salário bruto?");
		vetor[0] = scn.nextDouble();
		
		System.out.println("Quantos dependentes?");
		vetor[1] = scn.nextDouble();
		
		System.out.println("Qual plano de saúde basico(1) ou avançado(2)? se não tiver digite 0");
		vetor[2] = scn.nextDouble();
		
		System.out.println("Vale de transporte?  se sim digite 1, se não digite 2");
		vetor[3] = scn.nextDouble();
		
		System.out.println("Vale alimentação? se sim digite 1, se não digite 2");
		vetor[4] = scn.nextDouble();
		
		System.out.println("Vale refeição? se sim digite 1, se não digite 2");
		vetor[5] = scn.nextDouble();
		
		// armazenamento saláriio bruto
		vetor[8] = vetor[0];
		
		// alíquota INSS
		if (vetor[0] <= 1302.00 )
			vetor[6] = 0.08;
		
		else if (vetor [0] <= 2571.00) 
			vetor[6] = 0.09;
			
		else if (vetor [0] <= 3856.00) 
			vetor[6] = 0.11;
		
		else if (vetor [0] > 3856.00) 
			vetor[6] = 00.14;
			
		
		// imposto de renda
		vetor [7] = 0.00;
		
		if (vetor [0] <= 1903.98)
			vetor[7] = 0.00;
		
		else if (vetor [0] <= 2826.65) 
			vetor[7] = 0.075;
		
		else if (vetor [0] <= 3751.00) 
			vetor[7] = 0.15;
		
		else if (vetor [0] <= 4664.68) 
			vetor[7] = 0.225;
		
		else if (vetor [0] < 4664.68) 
			vetor[7] = 0.275;
		
		// desconto dependentes
		
		vetor[1] = vetor[1] * 189.59;
		
		// plano de saúde
		if (vetor[2] == 0)
			vetor [2] = 0.00;
		
		else if (vetor [2] == 1) 
			vetor[2] = 150.00;
		
		else if (vetor [2] == 2) 
		vetor[2] = 300.00;
		
		// vale transporte 
		if (vetor[0] == 0)
			vetor [3] = 0.00;
		
		else  
			vetor[3] = 0.06;

		// vale alimentação 
		if (vetor[0] == 1)
			vetor [4] = 0.00;
		
		else  
			vetor[4] = 200.00;
		
		// vale refeição 
		if (vetor[0] == 1)
			vetor [5] = 0.00;
		
		else  
			vetor[5] = 250.00;
		
		// valores percentuais
		// inss, imposto de renda, vale tranporte 
		vetor[6] = vetor[0] * vetor[6];
		vetor[7] = vetor[0] * vetor[7];
		vetor[3] = vetor[0] * vetor[3]; 
		
		// cálculo
		vetor[8] = vetor[8] - vetor[2] - vetor[3] - vetor[4] - vetor[5] - vetor[6] - vetor[7];
		vetor[8] = vetor[8] + vetor[1];
		
		//saída
		System.out.println("o seu sálario líquido é: " + vetor[8]);
		
		scn.close();
	}

}
