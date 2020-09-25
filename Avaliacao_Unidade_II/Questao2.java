package Avaliacao_Unidade_II;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
		int [] array = new int [5];
		int num, cont = 0, menorValor;
		String continuar;
		
		do {
		System.out.println("Digite um n�mero inteiro para adicionar ao array: ");
		num = teclado.nextInt();
		
		// Verifica se o array est� cheio.
		cont = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
			 cont++;
			}
			
			if(cont == 5) {
				System.out.println("\nO Array est� cheio.\n");
				break;
			}
		}

		
		// Verifica se o n�mero � positivo.
				if(num < 0) {
					System.out.println("\nDigite um n�mero positivo.\n");
					continue;
				}
				
				//Verifica se o n�mero � maior que o antecessor.
				Boolean menor = false;
				for (int i = 0; i < array.length; i++) {
					if (array[i] != 0 && num < array [i]) {
						menor = true;
					}
				}
				if (menor == true) {
					System.out.println("\nO n�mero digitado deve ser menor que o antecessor.\n");
					continue;
				}
				
		
		//Acrescenta o n�mero no Array.
		if (cont < 5) {
			for (int i = 0; i < array.length; i++) {
				if(array[i] == 0) {
				 array[i] = num;
				 break;
				}
			}
			
			//Ordena o vetor em ordem crescente
			for (int i = 0; i < array.length-1; i++) {
				menorValor = i;

				for (int j = i+1 ; j < array.length; j++) {
					
					if (array[j] < array[menorValor]) {
						menorValor = j;					
					}
				}
				int temp = array[i];
				array[i] = array[menorValor];
				array[menorValor] = temp;
			}
			
			System.out.println("\n*** N�mero Adicionado ***\n");
			
			//Verifica se o valor j� existe, remove o valor repetido e remaneja.
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] != 0 && array[i] == array[i+1]) {
					array[i+1] = 0;
					break;
				}
			}
			for (int i = 0; i < array.length-1; i++) {
				menorValor = i;

				for (int j = i+1 ; j < array.length; j++) {
					
					if (array[j] < array[menorValor]) {
						menorValor = j;					
					}
				}
				int temp = array[i];
				array[i] = array[menorValor];
				array[menorValor] = temp;
			}
			
			// Pergunta se deseja continuar
			System.out.println("\nDeseja adicionar mais um n�mero? (Digite S para SIM ou qualquer outra tecla para N�O.) ");
			continuar = teclado.next();
		
			if (continuar.equalsIgnoreCase("S")) {
				continue;
			} else {
				System.out.println("\nEncerramento do programa.\n");
				break;
			}
		}
			
		} while (cont < 5);
		
		System.out.println("\n<< ARRAY >>\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			System.out.println("");
		}
	}
}


