package exercícios_19_05;

import java.util.Scanner;

public class Cofrinho {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 

		double moedas = 0, umCen, cincoCen, dezCen, vinteCincoCen, cinquentaCen, umReal, semanasRes; 
		int i = 0;

		do {			
			System.out.println("Olá! Vamos começar a ecconomizar?  "
					+ "\n Qual tipo de moeda irá depositar? "
					+ "\n 1.Um centavo "
					+ "\n 2.Cinco centavos "
					+ "\n 3.Dez centavos "
					+ "\n 4.Vinte cinco centavos "
					+ "\n 5.Cinquenta centavos "
					+ "\n 6.Um real" 
					+ "\n 7.Sair");
			i = scn.nextInt();

			switch (i) {
			case 1:
				System.out.println("Deseja depositar quantas moedas?");
				umCen = scn.nextDouble();

				umCen = umCen * 0.01;

				semanasRes = Math.ceil(((100 - umCen) / umCen));


				semanasRes = (int) ((int) 100 - moedas / moedas);

				System.out.println("Se você depositar esse mesmo valor semana que vem chegará na sua meta em " + semanasRes);
				System.out.println("Você depositou R$" + umCen);
				moedas = scn.nextInt();
				
				break;
			case 2:
				System.out.println("Deseja depositar quantas moedas?");
				cincoCen = scn.nextDouble();

				cincoCen = cincoCen * 0.05;

				semanasRes = Math.ceil(((100 - cincoCen) / cincoCen));

				System.out.println("Se você depositar esse mesmo valor semana que vem chegará na sua meta em " + semanasRes);
				System.out.println("Você depositou R$" + cincoCen);
				moedas += scn.nextInt();
				
				break;
			case 3: 
				System.out.println("Deseja depositar quantas moedas?");
				dezCen = scn.nextDouble();

				dezCen = dezCen * 0.10;

				semanasRes = Math.ceil(((100 - dezCen) / dezCen));

				System.out.println("Se você depositar esse mesmo valor semana que vem chegará na sua meta em " + semanasRes);
				System.out.println("Você depositou R$" + dezCen);
				moedas = scn.nextInt();
				
				break;
			case 4: 
				System.out.println("Deseja depositar quantas moedas?");
				vinteCincoCen = scn.nextDouble();

				vinteCincoCen = vinteCincoCen * 0.25;

				semanasRes = Math.ceil(((100 - vinteCincoCen) / vinteCincoCen));

				System.out.println("Se você depositar esse mesmo valor semana que vem chegará na sua meta em " + semanasRes);
				System.out.println("Você depositou R$" + vinteCincoCen);
				moedas = scn.nextInt();
				
				break;
			case 5: 
				System.out.println("Deseja depositar quantas moedas?");
				cinquentaCen = scn.nextDouble();

				cinquentaCen = cinquentaCen * 0.50;

				semanasRes = Math.ceil(((100 - cinquentaCen) / cinquentaCen));

				System.out.println("Se você depositar esse mesmo valor semana que vem chegará na sua meta em " + semanasRes);
				System.out.println("Você depositou R$" + cinquentaCen);
				moedas = scn.nextInt();
				
				break;
			case 6: 
				System.out.println("Deseja depositar quantas moedas?");
				umReal = scn.nextDouble();

				semanasRes = Math.ceil(((100 - umReal) / umReal));

				System.out.println("Se você depositar esse mesmo valor semana que vem chegará na sua meta em " + semanasRes + " semanas!");

				System.out.println("Se você depositar esse mesmo valor semana que vem chegará na sua meta em " + semanasRes);
				System.out.println("Você depositou R$" + umReal);
				moedas = scn.nextInt();
				
				break;		
			case 7:
				System.out.println("Obrigado por usar o Cofrinho! Até mais!");
				
				break;
			default:
				System.out.println("Opção inválida! Escolha um número entre 1 e 7.");
				
				break;
			}
		} while (i != 7);

		scn.close();
	}

}
