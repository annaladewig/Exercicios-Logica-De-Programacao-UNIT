package ExerciciosAulaOnline;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome, primeiraLetra;
		int contVogal = 0, contCons = 0;
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("Digite o %d� nome: ", i + 1);
			nome = teclado.nextLine();
			
			primeiraLetra = nome.substring(0,1).toUpperCase();
			if(primeiraLetra.equals("A") || primeiraLetra.equals("E") || primeiraLetra.equals("I") || primeiraLetra.equals("O") || primeiraLetra.equals("U")) {
				contVogal++;
			} else {
				contCons++;
			}
		}
		System.out.printf("Um total de %d nomes come�aram com vogal. \n", contVogal);
		System.out.printf("Um total de %d nomes come�aram com consoante. \n", contCons);
		
		teclado.close();
	}

}
