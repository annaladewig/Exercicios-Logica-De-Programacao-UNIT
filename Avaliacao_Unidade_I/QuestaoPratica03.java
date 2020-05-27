package Avaliacao_Unidade_I;

import java.util.Scanner;

public class QuestaoPratica03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String indicador1, indicador2, indicadorFinal = "", situacao = "";
		float frequencia;
		
		System.out.println("Digite o primeiro indicador do aluno:");
		indicador1 = teclado.next();
		System.out.println("Digite o segundo indicador do aluno:");
		indicador2 = teclado.next();
		System.out.println("Digite a porcentagem frequência do aluno (de 0 a 100):");
		frequencia = teclado.nextFloat();
		
		if (frequencia >= 75 && frequencia <= 100) {
			
			if (indicador1.equalsIgnoreCase("A") && indicador2.equalsIgnoreCase("A")){
				situacao = "APROVADO";
			} 
		
			if (indicador1.equalsIgnoreCase("A") && indicador2.equalsIgnoreCase("B")){
				situacao = "APROVADO";
			}
		
			if (indicador1.equalsIgnoreCase("B") && indicador2.equalsIgnoreCase("A")){
				situacao = "APROVADO";
			}
		
			if (indicador1.equalsIgnoreCase("B") && indicador2.equalsIgnoreCase("B")){
				situacao = "APROVADO";
			}
			
			if (indicador1.equalsIgnoreCase("C") && indicador2.equalsIgnoreCase("C")){
				situacao = "REPROVADO";
			}
			
			if (indicador1.equalsIgnoreCase("A") && indicador2.equalsIgnoreCase("C") || indicador1.equalsIgnoreCase("C") && indicador2.equalsIgnoreCase("A") || indicador1.equalsIgnoreCase("B") && indicador2.equalsIgnoreCase("C") || indicador1.equalsIgnoreCase("C") && indicador2.equalsIgnoreCase("B")){
				System.out.println("Digite o indicador da avaliação final do aluno:");
				indicadorFinal = teclado.next();
			}
		
			if (indicadorFinal.equalsIgnoreCase("A") || indicadorFinal.equalsIgnoreCase("B") ) {
				situacao = "APROVADO NA FINAL";
			}
		
			if (indicadorFinal.equalsIgnoreCase("C")) {
				situacao = "REPROVADO";
			}
		} else {
			
			situacao = "REPROVADO";
		}
		System.out.printf("O aluno foi %s.", situacao);
		teclado.close();
	}
}
