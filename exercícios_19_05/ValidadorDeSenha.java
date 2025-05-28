	package exercícios_19_05;
	
	import java.util.Scanner;
	
	public class ValidadorDeSenha {
	
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			String senha;
	
			System.out.println("digite a sua senha: ");
			senha = scn.next();
//			int num = Integer.parseInt(senha);
			
			System.out.println(senha);
//			if (senha.matches(".*[^a-zA-Z0-9].*"))
//				System.out.println("Senha válida!");
//			
//			else 
//				System.out.println("Senha inválida");
//	
			
// sei que não funciona só estou checando se tem caracteres especiais e ia tentar usar o parseInt que o copilot ama e tenta usar em toda situação possível			
			scn.close();
		}
	
	}
