package Array;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String [] nome = { "Maria", "Jose", "Carlos", "Maria", "Zelia", "Antonio"};
		String procurado;
		int qtdRepetida = 0;
		boolean encontrado = false;
		
		System.out.println("Qual nome você deseja procurar? ");
		procurado = teclado.next();
		
		for (int i = 0; i < nome.length; i++) {
			if (procurado.equalsIgnoreCase(nome[i])) {
				encontrado = true;
				qtdRepetida++;
			} 
		}
		
		if (encontrado == true) {
			System.out.printf("O nome %s foi encontrado %d vez(es).", procurado, qtdRepetida);
		} else {
			System.out.printf("O nome %s não foi encontrado.", procurado);
		}
		teclado.close();
		
	}

}
