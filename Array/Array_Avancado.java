package Array;

public class Array_Avancado {

	public static void main(String[] args) {
		
		int [] numeros = {100, 852, 16, 72, 7800, 1499, 72, 380, 16, 72};

		System.out.println("Todos os números que começam com 1 são:");
		for (int i = 0; i < numeros.length; i++) {
			
			if (Integer.toString(numeros[i]).substring(0,1).equals("1")) {
				System.out.print(" " + numeros[i] + " ");
			}
		}
		
		System.out.println("\n--------------------------------------");
		
		System.out.println("Todos os elementos, sendo intercalados com a ordem inversa: (Primeiro com último, segundo com penúltimo,..., o último com primeiro))");
		for (int i = 0; i < numeros.length; i++) {
				System.out.print(" | " + numeros[i] + " " + numeros[numeros.length - 1 - i] + " ");
			}
		
		System.out.println("\n--------------------------------------");
		
		System.out.println("Os 5 primeiros elementos, intercalados com os 5 últimos elementos: (Primeiro com o sexto, segundo com o sétimo,..., quinto com o décimo)");
		for (int i = 0; i < numeros.length/2; i++) {
			System.out.print(" " + numeros[i] + " " + numeros[numeros.length/2 + i] + " ");
		}
		
		System.out.println("\n--------------------------------------");
		
		System.out.println("Quantas vezes cada número foi encontrado:\n");
		int cont = 1;
		String [] numConvertidos = new String [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numConvertidos[i] = Integer.toString(numeros[i]);
		}
		
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				
				if (numConvertidos[i].equals(numConvertidos[j])){
					cont++;
					numConvertidos[j] = "-";
				}
			}
			
			if (cont > 1 && !numConvertidos[i].equals("-")) {
				System.out.printf("O número %d aparece %d vezes. \n", numeros[i], cont);
			}
			cont = 1;
		}
		
		System.out.println("\n--------------------------------------");
		
		System.out.println("Para cada posição, separado por “|”:\r\n" + 
				"- a posição atual\r\n" + 
				"- o elemento anterior. No caso do primeiro elemento, como anterior mostrar “->”\r\n" + 
				"- o elemento posterior. No caso do último elemento, como posterior mostrar “<-”");
		
		System.out.println("");
		
		for (int i = 0; i < numeros.length; i++) {
			if(i == 0) {
				System.out.printf( "%2d |   ->  | %5d\n", i, numeros[i + 1]);
				continue;
			}
			if(i == numeros.length - 1) {
				System.out.printf( "%2d | %5d |  <- \n", i,  numeros[i - 1]);
				continue;
			}
			
			System.out.printf( "%2d | %5d | %5d\n", i,  numeros[i - 1], numeros[i + 1]);
		}
	}
}
