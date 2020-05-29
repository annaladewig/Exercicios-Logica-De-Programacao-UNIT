package Array;

public class Array_Basico {

	public static void main(String[] args) {
		
		int [] numeros = {150, 18, 540, 320, 7, 1350, 25, 2777, 3, 87};
		
		System.out.println("Os n�meros �mpares s�o:");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] % 2 != 0) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("Os elementos das posi��es pares s�o:");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (i % 2 == 0) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");	
		
		System.out.println("Os elementos menores que 500 s�o: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] < 500 ) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("Os elementos que s�o da ordem de centena s�o: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] >= 100 && numeros[i] <=999) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("Os elementos que s�o da ordem de dezena ou milhar s�o: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] >= 10 && numeros[i] <= 99 || numeros[i] >= 1000 && numeros[i] <= 9999) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("A primeira metade do array s�o os n�meros: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (i <= (numeros.length - 1)/2) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("A segunda metade do array s�o os n�meros: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (i > (numeros.length - 1)/2) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		System.out.println("\n-------------------------------------------------");
		
		System.out.println("Todos os elementos na ordem inversa das posi��es (da �ltima at� a primeira):");
		
		for (int i = numeros.length - 1; i >= 0; i--) {
				System.out.print(" " + numeros[i] + " ");
		}
		System.out.println("\n-------------------------------------------------");
	}
}
