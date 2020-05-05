package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int iqa;
		
		do {
			System.out.println("Digite o valor do �ndice de qualidade do ar: ");
			iqa = teclado.nextInt();
			
			if (iqa < 0) {
				System.out.println("O iqa n�o pode ser menor que 0. Digite novamente.\n");
			}
		} while (iqa < 0);
		
		System.out.println("----------------------------------------------------");
		
		if (iqa >= 0 && iqa <= 50) {
			
			System.out.println(" Classifica��o: Boa \n Efeitos: Aus�ncia de sintomas.");
		
		} else if (iqa <= 100) {
			
			System.out.println(" Classifica��o: Regular \n Efeitos: Aus�ncia de sintomas.");
		
		} else if (iqa <= 199) {
		
			System.out.println(" Classifica��o: Inadequada \n Efeitos: Leve agravamento dos sintomas.");
		
		} else if (iqa <= 299){
			
			System.out.println(" Classifica��o: M� \n Efeitos: Decr�scimo da resist�ncia f�sica.");
		
		} else if (iqa <= 399) {
		
			System.out.println(" Classifica��o: P�ssima \n Efeitos: Aparecimento prematuro de certas doen�as.");
		
		} else {
			System.out.println(" Classifica��o: Cr�tica \n Efeitos: Morte prematura de pessoas doentes e pessoas idosas.");
			
		}
		teclado.close();
	}
}
