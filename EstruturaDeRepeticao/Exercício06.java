package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome, pessoaMaisVelha = "";
		int idade = 0, contador = 1, idadeMaisVelha = 0;
		
		while(contador <= 4) {
			System.out.printf("Nome da %dº pessoa: ", contador);
			nome = teclado.next();
			System.out.printf("Idade de %s: ", nome);
			idade = teclado.nextInt();
			
			if(idade > idadeMaisVelha) {
				pessoaMaisVelha = nome;
				idadeMaisVelha = idade;
			}
			contador++;
		}
		System.out.printf("%s é a pessoa mais velha com idade de %d.", pessoaMaisVelha, idadeMaisVelha);
		teclado.close();
	}

}
