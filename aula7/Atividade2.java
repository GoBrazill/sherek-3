package aula7;

public class Atividade2 {

	public static void main(String[] args) {
			
		double nota1Obj = 8.5, nota1Dis = 9, nota2Obj = 7, nota2Dis = 8, nota3Obj = 9, 
				nota3Dis = 9.5, nota4Obj = 6, nota4Dis = 7, nota5Obj = 8, nota5Dis = 8.5,
				mediaNotaObj, mediaNotaDis;
		
		mediaNotaObj = (nota1Obj + nota2Obj + nota3Obj + nota4Obj + nota5Obj) / 5;
		System.out.println("A média das provas objetivas é: " + mediaNotaObj);
		
		mediaNotaDis = (nota1Dis + nota2Dis + nota3Dis + nota4Dis + nota5Dis) / 5;
		System.out.println("A média das provas discursivas é: " + mediaNotaDis);
				
	}

}