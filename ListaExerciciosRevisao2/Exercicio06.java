package ListaExerciciosRevisao2;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int qtdFilhos, idade, cont = 0, ultimaIdade = 0; 
		float acum = 0;
		final float ajuda = 100;
		final float ajudaGemeo = 120;
		
		System.out.println("Digite a quantidade de filhos que o empregado possui: ");
		qtdFilhos = teclado.nextInt();
		
		while (cont < qtdFilhos) {
			
			System.out.printf("Digite a idade do %dº filho: ", cont + 1);
			idade = teclado.nextInt();
			
			if (idade < 13 && ultimaIdade != idade) {
				
				acum = acum + ajuda;
			}
			if (idade < 13 && ultimaIdade == idade) {
				
				acum = acum + ajudaGemeo;
			} 
			ultimaIdade = idade;
			cont++;
		}
		System.out.printf("O valor total da ajuda de custo é de R$ %.2f.", acum);
		teclado.close();
	}

}
