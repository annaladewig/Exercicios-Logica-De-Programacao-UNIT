package Switch;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		int num;
		String dia = "";
		boolean erro = false;
		
		System.out.println("Digite um n�mero correspondente ao dia da semana para saber o dia � �til ou n�o:");
		num = teclado.nextInt();
		
		switch (num) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3: 
			dia = "Ter�a";
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
			dia = "S�bado";
			break;
		default:
			System.out.println("Dia inv�lido.");
			erro = true;
			break;
		}
		
		if (erro == false) {
			if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("ter�a") || dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("sexta")) {
				
				System.out.printf("%s � um dia �til.", dia);
			
			} else {
				
				System.out.printf("%s � final de semana.", dia);
			}
		}
		teclado.close();

	}

}
