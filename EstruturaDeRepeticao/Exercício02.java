package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0, contador = 0, maiores = 0, maisVelho = 0;
		
		while (contador <7) {
			System.out.print("Digite a idade:");
			idade = teclado.nextInt();
			
			if(idade >= 18) {
				
				maiores++;
			}
			
			if(idade > maisVelho) {
				
				maisVelho = idade;
			}
				contador++;
		}
	
		System.out.printf("O total de maiores de idade é de %d.", maiores);
		System.out.println("");
		System.out.printf("A pessoa mais idosa tem %d anos.", maisVelho);
		teclado.close();
	}

}
