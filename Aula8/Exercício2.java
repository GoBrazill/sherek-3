package pacoteXD;

//import java.util.Random;

public class Exercício2 {

	public static void main(String[] args) {
//			Random ale = new Random();
			
//			int num = 10;
			int soma = 0;
			int ale[] = new int[10];
			
			for (int i = 0; i < ale.length; i++) {
				int ale1= (int) (Math.random() * 100)+1;
				
				System.out.println(ale1);
				
				soma = soma + ale1;
			}
				
				System.out.println(soma);
			
			
			
			
	}

}
