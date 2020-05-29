package Array;

public class Array_Intermediario {

	public static void main(String[] args) {
		
		int [] numeros = {50, -450, 1, 1587, -8, 755, -3588, 87, -33, 9};
		
		int subtracao;
		
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("A diferença entre os elementos é: (O primeiro menos o segundo, o segundo menos o terceiro...)");
		
		for (int i = 0; i < numeros.length; i++) {
			if (i < numeros.length - 1) {
			
				subtracao = numeros[i] - numeros[i+1];
			
				System.out.printf( "\n %d - %d = %d \n", numeros[i], numeros[i+1], subtracao );
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("Todos os elementos, sendo, primeiro os positivos e depois os negativos, fica:");
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 0) {
			
				System.out.print( " " + numeros[i] + " " );
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				
				System.out.print( " " + numeros[i] + " " );
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		int qtdNumPos = 0, qtdNumNeg = 0;
		double percPos, percNeg;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] >= 0) {
				
				qtdNumPos++;
			
			} else {
			
				qtdNumNeg++;
			}
		}
		
		percPos = (float) qtdNumPos/numeros.length * 100;
		percNeg = (float) qtdNumNeg/numeros.length * 100;
		
		System.out.printf("O percentual de números negativos é: %.2f", percPos);
		System.out.printf("\nO percentual de números positivos é: %.2f", percNeg);
		
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("Os elementos que são da ordem de dezena são: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] <= -10 && numeros[i] >= -99 || numeros[i] >= 10 && numeros[i] <= 99) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		int maior = 0; 
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (i == 0) {
				
				maior = Math.abs(numeros[i]);
			}
			if (Math.abs(numeros[i]) > maior) {
				
				maior = Math.abs(numeros[i]);
			}
		}
		
		System.out.printf("O maior número absoluto é: %d.", maior);
		System.out.println("\n-------------------------------------------------");
	}

}
