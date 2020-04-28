package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0, contador = 0, maiores = 0;
		
		while (contador <7) {
			System.out.print("Digite a idade:");
			idade = teclado.nextInt();
			
			
			if(idade < 0 || idade > 130) {
				
				System.out.println("Idade inválida. Digite novamente a idade.");
				continue;
				
			} else if(idade >= 18) {
				
				maiores++;
			}
				contador++;
		}
	
		System.out.printf("O total de maiores de idade é de %d.", maiores);
		teclado.close();

	}
}

