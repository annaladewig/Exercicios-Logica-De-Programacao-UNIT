package ExerciciosAulaOnline;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Digite um n�mero inteiro: ");
		num = teclado.nextInt();
		
		for(int i = num; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		teclado.close();

	}

}
