package ExerciciosAulaOnline;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Digite um número inteiro:");
		num = teclado.nextInt();
		
		for(int i=0; i<= num; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		teclado.close();	

	}

}
