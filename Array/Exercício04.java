package Array;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String [] nome = new String [6];
		String procurar;
		int cont = 0;
	
		
		for(int i = 0; i < nome.length; i++) {
			System.out.printf("Digite o %d� nome: ", i + 1);
			nome[i] = teclado.next().toUpperCase();
		}
		
			System.out.println("--------------------------------");
			System.out.println("Qual nome voc� deseja procurar? ");
			procurar = teclado.next().toUpperCase();
			
			for (int i = 0; i < nome.length; i++) {
				if (procurar.equals(nome[i])) {
					System.out.printf("Nome encontrado na %d� posi��o.", i + 1);
					break;
				} else {
						cont++;
					}
				if (cont == (nome.length - 1)) {
					System.out.println("Nome n�o encontrado.");
				}
			} 
			
		}
		
	
	}	
	

	


