package LogicaDeProgramacao;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Vari�veis
		int num1, num2, aux;
		
		//Entradas
		System.out.print("Digite um n�mero inteiro: ");
		num1 = teclado.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		num2 = teclado.nextInt();
		
		//Processamento
		if(num1>num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		//Sa�da
		System.out.printf("Os n�meros s�o: %d e %d.", num1 , num2);
	}

}
