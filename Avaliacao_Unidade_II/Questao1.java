package Avaliacao_Unidade_II;

public class Questao1 {

	public static void main(String[] args) {
		int[] dados = {10300, 11320, 9500, 12120, 10500, 8300, 9700,
				 11350, 12500, 1350, 8500, 11200, 10900, 12400,
				 13300, 11700, 8900, 9500, 10850, 13100, 11600,
				 12300, 11960, 11870, 9300, 13100, 9700, 8900}; 
		
		System.out.println("---------------------------------------------");
		
		//A média de passageiros transportados no 1º, no 2º, ... e no 7º dia das semanas). 
		int somaDia1 = 0, somaDia2 = 0, somaDia3 = 0, somaDia4 = 0, somaDia5 = 0, somaDia6 = 0, somaDia7 = 0;
		final int media = 4;
		
		for (int i = 0; i < dados.length; i++) {
			if(i == 0) {
				somaDia1 = dados[i] + dados[i+7] + dados[i+14] + dados[i+21];
			}
			
			if(i == 1) {
				somaDia2 = dados[i] + dados[i+7] + dados[i+14] + dados[i+21];
			}
			
			if(i == 2) {
				somaDia3 = dados[i] + dados[i+7] + dados[i+14] + dados[i+21];
			}
			
			if(i == 3) {
				somaDia4 = dados[i] + dados[i+7] + dados[i+14] + dados[i+21];
			}
			
			if(i == 4) {
				somaDia5 = dados[i] + dados[i+7] + dados[i+14] + dados[i+21];
			}
			
			if(i == 5) {
				somaDia6 = dados[i] + dados[i+7] + dados[i+14] + dados[i+21];
			}
			
			if(i == 6) {
				somaDia7 = dados[i] + dados[i+7] + dados[i+14] + dados[i+21];
			}
		}
		
		System.out.printf("\nA média de passageiros transportados nos 1º dias das semanas foi de %.2f.", (float) somaDia1/media);
		System.out.printf("\nA média de passageiros transportados nos 2º dias das semanas foi de %.2f.", (float) somaDia2/media);
		System.out.printf("\nA média de passageiros transportados nos 3º dias das semanas foi de %.2f.", (float) somaDia3/media);
		System.out.printf("\nA média de passageiros transportados nos 4º dias das semanas foi de %.2f.", (float) somaDia4/media);
		System.out.printf("\nA média de passageiros transportados nos 5º dias das semanas foi de %.2f.", (float) somaDia5/media);
		System.out.printf("\nA média de passageiros transportados nos 6º dias das semanas foi de %.2f.", (float) somaDia6/media);
		System.out.printf("\nA média de passageiros transportados nos 7º dias das semanas foi de %.2f.\n", (float) somaDia7/media);
		
		
		System.out.println("\n---------------------------------------------\n");
		// A quantidade de passageiros que foram transportados em cada semana. 
		int acum1 = 0, acum2 = 0, acum3 = 0, acum4 = 0;

		for (int i = 0; i < dados.length; i++) {
			
			if (i >= 0 && i <= 6) {
				acum1 += dados[i]; 
			}
			
			if (i >= 7 && i <= 13) {
				acum2 += dados[i]; 
			}
			
			if (i >= 14 && i <= 20) {
				acum3 += dados[i]; 
			}
			
			if (i >= 21 && i <= 27) {
				acum4 += dados[i]; 
			}
		}
		
		System.out.printf("\nA quantidade total de passageiros na 1º semana foi de %d passageiros.\n", acum1);
		System.out.printf("\nA quantidade total de passageiros na 2º semana foi de %d passageiros.\n", acum2);
		System.out.printf("\nA quantidade total de passageiros na 3º semana foi de %d passageiros.\n", acum3);
		System.out.printf("\nA quantidade total de passageiros na 4º semana foi de %d passageiros.\n", acum4);
	
		System.out.println("\n---------------------------------------------\n");
		
		//A semana (1ª, 2ª, 3ª ou 4º) em que foram transportados mais passageiros. Considerar que não houveram semanas com igual quantidade de pessoas transportadas. 
		
		int maisPassageiros;
		 
		int num [] = new int [4];
		num[0] = acum1;
		num[1] = acum2;
		num[2] = acum3;
		num[3] = acum4;
		
		String semana[] = {"1º semana", "2º semana", "3º semana", "4º semana"};
		
		int aux;
		String auxSemana;
		for (int i = 0; i < num.length-1; i++) {
			int menorValor = i;

			for (int j = i+1 ; j < num.length; j++) {
				
				if (num[j] < num[menorValor]) {
					menorValor = j;					
				}
			}
			//ordena a quantidade de pessoas.
			aux = num[i];
			num[i] = num[menorValor];
			num[menorValor] = aux;
			
			//ordena as semanas.
			auxSemana = semana[i];
			semana[i] = semana[menorValor];
			semana[menorValor] = auxSemana;
		}
		
		System.out.printf("A %s foi a semana que teve mais passageiros transportados.", semana[semana.length-1]);
	}


}


