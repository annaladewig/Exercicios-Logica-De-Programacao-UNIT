package OrdenacaoDeVetores;

public class Exercício01 {

	public static void main(String[] args) {
		
		int [] num = {34, 56, 12, 90, 04, 23, 81, 100, 79, 48};
		
		
		// Ordem Crescente 
		
		int menorValor;
		
		System.out.println("A ordenação de forma crescente:");
		
		for (int i = 0; i < num.length-1; i++) {
			menorValor = i;

			for (int j = i+1 ; j < num.length; j++) {
				
				if (num[j] < num[menorValor]) {
					menorValor = j;					
				}
			}
			int temp = num[i];
			num[i] = num[menorValor];
			num[menorValor] = temp;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("\n[%d] = %d", i, num[i]);
		}
		
		
		//Ordem Decrescente
		
		int maiorValor;
		System.out.println("\n");
		System.out.println("A ordenação de forma decrescente:");
		
		for (int i = 0; i < num.length-1; i++) {
			maiorValor = i;

			for (int j = i+1 ; j < num.length; j++) {
				
				if (num[j] > num[maiorValor]) {
					maiorValor = j;					
				}
			}
			int temp = num[i];
			num[i] = num[maiorValor];
			num[maiorValor] = temp;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("\n[%d] = %d", i, num[i]);
		}
		
		//O Maior Valor
		System.out.println("\n");
		System.out.printf("O maior valor é: %d.", num[0]);
		
		//O menor Valor
		System.out.println("\n");
		System.out.printf("O menor valor é: %d.", num[9]);
	}

}
