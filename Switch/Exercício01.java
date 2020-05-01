package Switch;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		String dia = "";
		boolean erro = false;
		
		System.out.println("Digite um n�mero de 1 a 7 para saber o dia da semana:");
		num = teclado.nextInt();
		
		switch (num) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3: 
			dia = "ter�a";
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
			dia = "s�bado";
			break;
		default:
			System.out.println("Dia inv�lido.");
			erro = true;
			break;
		}
		
		if (erro == false) {
		System.out.printf("O dia da semana � %s.", dia);
		}
		teclado.close();
	}
		

}
