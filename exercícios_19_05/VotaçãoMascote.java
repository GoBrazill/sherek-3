package exercícios_19_05;

import java.util.Scanner;

public class VotaçãoMascote {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int soma, votos[] = {0, 0, 0}; 
		double porcentagem[] = new double [3];
		String seleção = "";
		
		do {
			System.out.println("Vamos votar em nosso mascote? "
					+ "\n- Ronald"
					+ "\n- Sam"
					+ "\n- Baianinho"
					+ "\n- Encerrar");
			seleção = scn.nextLine();
			switch (seleção) {
			case "Ronald": {
				System.out.println("Você votou no mascote 1");
				votos[0]++;
				
				break;
			}
			case "Sam": {
				System.out.println("Você votou no mascote 2");
				votos[1]++;
				break;
			}
			case "Baianinho": {
				System.out.println("Você votou no mascote 3");
				votos[2]++;
				break;
			}
			default:
				System.out.println("Essa não é uma das opções. Por favor digite novamente.");
			}	
		} while(!seleção.equalsIgnoreCase("encerrar"));
		
		System.out.println("Votação encerrada!");
		
		soma = votos[0] + votos[1] + votos[2];
		porcentagem[0] = ((double) votos[0] / soma) * 100;
		porcentagem[1] = ((double) votos[1] / soma) * 100;
		porcentagem[2] = ((double) votos[2] / soma) * 100;
		
		System.out.printf("Ronald: %.2f%%\n", porcentagem[0]);
		System.out.printf("Sam: %.2f%%\n", porcentagem[1]);
		System.out.printf("Baianinho: %.2f%%\n", porcentagem[2]);
		scn.close();	 
	
	}

}
