package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int iqa;
		
		do {
			System.out.println("Digite o valor do índice de qualidade do ar: ");
			iqa = teclado.nextInt();
			
			if (iqa < 0) {
				System.out.println("O iqa não pode ser menor que 0. Digite novamente.\n");
			}
		} while (iqa < 0);
		
		System.out.println("----------------------------------------------------");
		
		if (iqa >= 0 && iqa <= 50) {
			
			System.out.println(" Classificação: Boa \n Efeitos: Ausência de sintomas.");
		
		} else if (iqa <= 100) {
			
			System.out.println(" Classificação: Regular \n Efeitos: Ausência de sintomas.");
		
		} else if (iqa <= 199) {
		
			System.out.println(" Classificação: Inadequada \n Efeitos: Leve agravamento dos sintomas.");
		
		} else if (iqa <= 299){
			
			System.out.println(" Classificação: Má \n Efeitos: Decréscimo da resistência física.");
		
		} else if (iqa <= 399) {
		
			System.out.println(" Classificação: Péssima \n Efeitos: Aparecimento prematuro de certas doenças.");
		
		} else {
			System.out.println(" Classificação: Crítica \n Efeitos: Morte prematura de pessoas doentes e pessoas idosas.");
			
		}
		teclado.close();
	}
}
