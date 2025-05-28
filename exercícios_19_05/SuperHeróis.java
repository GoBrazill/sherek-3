package exercícios_19_05;

import java.util.Scanner;

public class SuperHeróis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
	String  Super1= "Superman" , Super2= "Batman", Super3= "Lanterna verde", Super4 ="";
	int força[] = {100, 10, 65, 0}; int inteligência[] = {20, 100, 30, 0}; 
	int velocidade[] = {75, 15, 50, 0}; int poderT[]= {0, 0, 0, 0};
	int supers = 0;
	
	
	do {
		System.out.println("Qual super herói você quer ver os poderes? "
				+ "\n 1.Super man "
				+ "\n 2.Batman "
				+ "\n 3.Lanterna verde "
				+ "\n 4.Criação Super herói "
				+ "\n 5.Classificação "
				+ "\n 6.Sair");
				supers = scn.nextInt();
	switch (supers) {
	case 1:	
		System.out.println(Super1);
		System.out.println("Força: " + força[0]);
		System.out.println("Inteligência: " + inteligência[0]);
		System.out.println("Velocidade: " + velocidade[0]);
		
		break;
	case 2:	
		System.out.println(Super2);
		System.out.println("Força: " + força[1]);
		System.out.println("Inteligência: " + inteligência[1]);
		System.out.println("Velocidade: " + velocidade[1]);
		
		break;
	case 3:	
		System.out.println(Super3);
		System.out.println("Força: " + força[2]);
		System.out.println("Inteligência: " + inteligência[2]);
		System.out.println("Velocidade: " + velocidade[2]);
		
		break;
	case 4:
		System.out.println("Qual o nome do seu super herói?");
		Super4 = scn.next();
		
		System.out.println("De 0 a 100 quanto de força ele tem?");
		força[3] = scn.nextInt();
		
		System.out.println("De 0 a 100 quanto de inteligência ele tem?");
		inteligência[3] = scn.nextInt();
		
		System.out.println("De 0 a 100 quanto de velocidade ele tem?");
		velocidade[3] = scn.nextInt();
		
		break;
	case 5 :
		poderT[0] = (força[0] + inteligência[0] + velocidade[0]) / 3;
		System.out.println("O poder Total do Superman é: " + poderT[0]);
		
		poderT[1] = (força[1] + inteligência[1] + velocidade[1]) / 3;
		System.out.println("O poder Total do Batman é: " + poderT[1]);
		
		poderT[2] = (força[2] + inteligência[2] + velocidade[2]) / 3;
		System.out.println("O poder Total do Lanterna verde é: " + poderT[2]);
		
		poderT[3] = (força[3] + inteligência[3] + velocidade[3]) / 3;
		System.out.println("O poder Total do" + Super4 + " é: " + poderT[3]);
		break;
	default:
		break;
	case 6: 
		System.out.println("Saindo...");
	}
	
	}while (supers != 6);
	
	scn.close();
	}

}
