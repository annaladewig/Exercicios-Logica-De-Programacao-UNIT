package Switch;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		String dia = "";
		boolean erro = false;
		
		System.out.println("Digite um número de 1 a 7 para saber o dia da semana:");
		num = teclado.nextInt();
		
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
		default:
			System.out.println("Dia inválido.");
			erro = true;
			break;
		}
		
		if (erro == false) {
		System.out.printf("O dia da semana é %s.", dia);
		}
		teclado.close();
	}
		

}
