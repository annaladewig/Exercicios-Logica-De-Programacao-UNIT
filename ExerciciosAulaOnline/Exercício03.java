package ExerciciosAulaOnline;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qtdAlunos = 0;
		float nota = 0, acumulador = 0, media = 0;
		
		System.out.print("Quantos alunos ir�o fazer a segunda chamada? ");
		qtdAlunos = teclado.nextInt();
		
		if (qtdAlunos > 0) {
			for (int i = 0; i < qtdAlunos; i++) {
				
				System.out.printf("Digite a nota %d� aluno:", i + 1);
				nota = teclado.nextFloat();
				acumulador = acumulador + nota;
			}
			
			media = acumulador/qtdAlunos;
			System.out.printf("A m�dia geral das notas dos alunos foi %.2f.", media);
			
		} else {
			System.out.println("Nenhum aluno far� a segunda chamada.");
		}
		
		teclado.close();
	}
}
