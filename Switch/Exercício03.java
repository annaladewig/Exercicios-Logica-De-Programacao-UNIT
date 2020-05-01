package Switch;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numMes;
		String temporada = "";
		
		do {
		System.out.println("Escreva um número inteiro correspondente ao número de um mês: ");
		numMes = teclado.nextInt();
		
		if(numMes < 1 || numMes >12) {
			System.out.println(" -> -> Digite apenas números de 1 a 12. <- <- \n");
		}
			
		} while (numMes < 1 || numMes >12);
			
		switch (numMes) {
		case 1:
		case 2:
		case 6:
		case 7:
		case 12: 
			temporada = "ALTA temporada";
			break;
		case 3:
		case 4:
		case 5:
		case 8:
		case 9:
		case 11:
		case 10:
			temporada = "BAIXA temporada";
			break;
		}
		
		System.out.printf("O mês digitado é de %s.", temporada);
		teclado.close();
	}


}
