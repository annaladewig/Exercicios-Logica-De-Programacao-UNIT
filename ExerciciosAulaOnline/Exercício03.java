package ExerciciosAulaOnline;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qtdAlunos = 0;
		float nota = 0, acumulador = 0, media = 0;
		
		System.out.print("Quantos alunos irão fazer a segunda chamada? ");
		qtdAlunos = teclado.nextInt();
		
		if (qtdAlunos > 0) {
			for (int i = 0; i < qtdAlunos; i++) {
				
				System.out.printf("Digite a nota %dº aluno:", i + 1);
				nota = teclado.nextFloat();
				acumulador = acumulador + nota;
			}
			
			media = acumulador/qtdAlunos;
			System.out.printf("A média geral das notas dos alunos foi %.2f.", media);
			
		} else {
			System.out.println("Nenhum aluno fará a segunda chamada.");
		}
		
		teclado.close();
	}
}
