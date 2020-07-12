package Array;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int [] num = { 23, -75, 530, -235, 62, 37, -4, -100, 72, 39};
		int pares = 0, impares = 0, positivos = 0, negativos = 0;
		
		for (int i = 0; i < num.length; i++) {
			if ( num[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
			if( num[i] >= 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		
		if (pares > impares) {
			System.out.println("Existem mais números PARES.");
		} else if (pares < impares) {
			System.out.println("Existem mais números ÍMPARES.");
		} else {
			System.out.println("Existe a mesma quantidade de números pares e ímpares.");
		}
		
		if (positivos > negativos) {
			System.out.println("Existem mais números POSITIVOS.");
		} else if (positivos < negativos) {
			System.out.println("Existem mais números NEGATIVOS.");
		} else {
			System.out.println("Existe a mesma quantidade de números positivos e negativos.");
		}
		
		teclado.close();

	}

}
