package Switch;

import java.util.Scanner;

public class Exercício01ComCritica {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		int num;
		String dia = "";
		
		do {
			System.out.println("Digite um número de 1 a 7 para saber o dia da semana:");
			num = teclado.nextInt();
			
			if(num < 1 || num > 7) {
				System.out.println("Por favor, digite um número de 1 a 7.\n");
			}

		} while (num < 1 || num > 7);
	
		
		switch (num) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3: 
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
	}
		
		System.out.printf("O dia da semana é %s.", dia);

		teclado.close();
	}

}
