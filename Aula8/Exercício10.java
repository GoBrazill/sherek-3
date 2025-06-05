package aula08;

public class Exercício10 {

	public static void main(String[] args) {
		
		int notas [] = {3, 6, 8, 9, 10, 7};
		double media;
		
		// somando cada elemento dentro do vetor e dividindo ppelo tamanho total do vetor que é 6 :)
		media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4] + notas[5]) / notas.length;
		
		System.out.println("Sua média é: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado :D");
		}	else {
			System.out.println("Reprovado D:");
		}
		
	}

}
