package exercícios_19_05;

	import java.util.Scanner;

	public class RepeatCaracterCopilot {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
// 	NÃO FUNCIONA E EU NÃO SEI O PORQUE
	        
	        System.out.print("Digite um número seguido de um caractere (exemplo: 4a): ");
	        String input = scanner.nextLine();

	        // Verifica se a entrada tem pelo menos um número e um caractere
	        if (input.matches("\\d+[a-zA-Z]")) { // Confirma que há número seguido de letra
	            int repeatCount = Integer.parseInt(input.replaceAll("[^0-9]", "")); // Extrai o número
	            char letter = input.replaceAll("[^a-zA-Z]", "").charAt(0); // Extrai o caractere

	            // Cria a string repetida
	            String result = String.valueOf(letter).repeat(repeatCount);

	            System.out.println(result);
	        } else {
	            System.out.println("Entrada inválida! Certifique-se de digitar um número seguido de uma única letra.");
	        }

	        scanner.close();
	    }
	}