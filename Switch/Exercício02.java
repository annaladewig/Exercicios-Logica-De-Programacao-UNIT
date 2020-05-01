package Switch;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		int num;
		String dia = "";
		boolean erro = false;
		
		System.out.println("Digite um número correspondente ao dia da semana para saber o dia é útil ou não:");
		num = teclado.nextInt();
		
		switch (num) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3: 
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			System.out.println("Dia inválido.");
			erro = true;
			break;
		}
		
		if (erro == false) {
			if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("sexta")) {
				
				System.out.printf("%s é um dia útil.", dia);
			
			} else {
				
				System.out.printf("%s é final de semana.", dia);
			}
		}
		teclado.close();

	}

}
