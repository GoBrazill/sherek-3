package aula08;

public class Exercício11 {

	public static void main(String[] args) {
		
		int vetor[] = {1, 2, 3, 4, 5};
		
		System.out.print("Array original: ");
		for (int num : vetor) {
			System.out.print(num + " ");
		}
		
		for (int i = 0; i < 1; i++) {
			// armazenando o ultimo valor antes de fazer a troca fora do loop que irá fazer a troca dos outros valores
			int temp1 = vetor[4];
			for (int j = vetor.length - 1;j > 0; j--) {
			//eu ainda não muito bem como essa troca funciona pra explicar :)	
				vetor[j] = vetor[j - 1];
			}
			// atribuindo o valor do primeiro elemento para não ficar 1 1 2 3 4
			vetor[0] = temp1;
		}
		
		System.out.println();
		System.out.print("Array rotacionada: ");
		for (int num : vetor) {
			System.out.print(num + " ");
		}
	}

}

// primeiro fiz dessa forma sem usar nenhum loop, basicamente só armazenando cada valor individualmente 
// e ter certeza de não perder nenhum valor no meio da troca xD 
//		temp [0] = vetor [0];
//		temp [1] = vetor [1];
//		temp [2] = vetor [2];
//		temp [3] = vetor [3];
//		temp [4] = vetor [4];

// trocando os valores
//		vetor [0] = temp [4];
//		vetor [1] = temp [0];
//		vetor [2] = temp [1];
//		vetor [3] = temp [2];
//		vetor [4] = temp [3];

//		System.out.println("Array rotacionada: " + vetor [0] + ", " + vetor [1] + ", " + vetor [2] + ", " + vetor [3] + ", " + vetor [4]);



