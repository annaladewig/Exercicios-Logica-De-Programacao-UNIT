package LogicaDeProgramacao;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um n�mero inteiro: ");
		num = teclado.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O n�mero %d � par.", num);
		}
		else {
			System.out.printf("O n�mero %d � �mpar.", num);
		}
		
	}

}
