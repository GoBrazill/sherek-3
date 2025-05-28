package exercícios_19_05;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		
		String options[] = {"pedra", "papel", "tesoura", "lagarto", "spock"};
		String escolhaU, escolhaC;
		do {
			System.out.println("Quer jogar pedra, papel, tesoura, lagarto e spock? "
					+ "\nQual você vai jogar:"
					+ "\n- Pedra"
					+ "\n- Papel"
					+ "\n- Tesoura"
					+ "\n- Lagarto"
					+ "\n- Spock"
					+ "\n- Sair");
			escolhaU = scn.nextLine();
			escolhaC = options[ran.nextInt(options.length)];
			
			
			//pedra 
			//ganha: esmaga o lagarto e quebra a tesoura
			//perde: spock vaporiza a pedra e papel cobre o papel
			if (escolhaU.equalsIgnoreCase("pedra") && escolhaC.equals("pedra") ) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Empate");
			} else if (escolhaU.equalsIgnoreCase("pedra") && escolhaC.equals("papel")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			} else if (escolhaU.equalsIgnoreCase ("pedra") && escolhaC.equals("tesoura")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("pedra") && escolhaC.equals("lagarto")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("pedra") && escolhaC.equals("spock")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			}
			
			//papel
			//ganha: cobre a pedra e disprova spock
			//perde: lagarto come o papel, tesoura corta o papel
			if (escolhaU.equalsIgnoreCase("papel") && escolhaC.equals("papel") ) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Empate");
			} else if (escolhaU.equalsIgnoreCase("papel") && escolhaC.equals("tesoura")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			} else if (escolhaU.equalsIgnoreCase ("papel") && escolhaC.equals("pedra")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("papel") && escolhaC.equals("spock")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("papel") && escolhaC.equals("lagarto")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			}
			
			//tesoura
			//ganha: corta o papel e decapita o lagarto
			//perde: spock esmaga a tesoura, e pedra quebra a tesoura
			if (escolhaU.equalsIgnoreCase("tesoura") && escolhaC.equals("tesoura") ) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Empate");
			} else if (escolhaU.equalsIgnoreCase("tesoura") && escolhaC.equals("pedra")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			} else if (escolhaU.equalsIgnoreCase ("tesoura") && escolhaC.equals("papel")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("tesoura") && escolhaC.equals("lagarto")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("tesoura") && escolhaC.equals("spock")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			}
				
			//lagarto
			//ganha: envenena o spock e come o papel
			//perde: pedra esmaga o lagarto e tesoura decapita o lagarto
			if (escolhaU.equalsIgnoreCase("lagarto") && escolhaC.equals("lagarto") ) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Empate");
			} else if (escolhaU.equalsIgnoreCase("lagarto") && escolhaC.equals("tesoura")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			} else if (escolhaU.equalsIgnoreCase ("lagarto") && escolhaC.equals("papel")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("lagarto") && escolhaC.equals("spock")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("lagarto") && escolhaC.equals("pedra")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			}
			
			//spock
			//ganha: esmaga a tesoura e vaporiza a pedra 
			//perde: papel disprova o spock e lagarto envenena o spock
			if (escolhaU.equalsIgnoreCase("spock") && escolhaC.equals("spock") ) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Empate");
			} else if (escolhaU.equalsIgnoreCase("spock") && escolhaC.equals("papel")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			} else if (escolhaU.equalsIgnoreCase ("spock") && escolhaC.equals("pedra")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("spock") && escolhaC.equals("tesoura")) {
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Ganhou :D");
			} else if (escolhaU.equalsIgnoreCase ("spock") && escolhaC.equals("lagarto")){
				System.out.println("O computador escolheu: " + escolhaC);
				System.out.println("Você Perdeu D:");
			}
						
		}while (!escolhaU.equals("sair"));
		
		System.out.println("Até mais! Boa sorte na próxima vez!");
		
		scn.close();

	}

}
