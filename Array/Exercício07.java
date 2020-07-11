package Array;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String [] nome = { "Maria", "Jose", "Davi", "Marta", "Zelia", "Ivo"};
		int tamanhoMaiorNome = 0, qtdNomesMaiorNome = 0;
		
		
		for (int i = 0; i < nome.length; i++) {
			if(nome[i].length() > tamanhoMaiorNome) {
				tamanhoMaiorNome = nome[i].length();
			} 
		}
			System.out.printf("O maior nome tem %d letras.\n", tamanhoMaiorNome);
			
		for (int i = 0; i < nome.length; i++) {
			if (nome[i].length() == tamanhoMaiorNome) {
				qtdNomesMaiorNome++;
			}
		}
			System.out.printf("Existem %d nomes com a mesma quantidade de letras do maior nome. \n", qtdNomesMaiorNome);
			
			System.out.println("Os nomes que tem a mesma quantidade de letras do maior nome são: ");	
		for (int i = 0; i < nome.length; i++) {
			if (nome[i].length() == tamanhoMaiorNome) {
				System.out.printf(" %s \n", nome[i]);
		}
			teclado.close();
		}
	}
}
	


