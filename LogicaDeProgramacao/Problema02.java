package LogicaDeProgramacao;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variáveis
		int num1, num2, aux;
		
		//Entradas
		System.out.print("Digite um número inteiro: ");
		num1 = teclado.nextInt();
		System.out.print("Digite outro número inteiro: ");
		num2 = teclado.nextInt();
		
		//Processamento
		if(num1>num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		//Saída
		System.out.printf("Os números são: %d e %d.", num1 , num2);
	}

}
