package OrdenacaoDeVetores;

public class Exercício02 {
	
	public static void main(String[] args) {
		String [] nome = {"Anna", "Victor", "Lícia", "Anna", "Raphael", "Anna", "Aldo", "Victor", "Eduarda", "Lícia", "Ursula", "Anna"};
		
		// Nomes em ordem alfabética

		System.out.println("Os nomes em ordem alfabética ficam:");
		
		int menorNome;
		
		for (int i = 0; i < nome.length-1; i++) {
			menorNome = i;

			for (int j = i + 1 ; j < nome.length; j++) {
				
				if (nome[j].compareTo(nome[menorNome]) < 0) {
					menorNome = j;					
				}
			}
			
			String temp = nome[i];
			nome[i] = nome[menorNome];
			nome[menorNome] = temp;
		}
		
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("\n[%d] = %s", i, nome[i]);
		}
		
		// Nomes que comecem por Vogal
		
		System.out.println("\n");
		System.out.println("Apenas os nomes que começam com vogal:");
		
		for (int i = 0; i < nome.length; i++) {
			if (nome[i].substring(0,1).equalsIgnoreCase("A") || nome[i].substring(0,1).equalsIgnoreCase("E") || nome[i].substring(0,1).equalsIgnoreCase("I") || nome[i].substring(0,1).equalsIgnoreCase("O") || nome[i].substring(0,1).equalsIgnoreCase("U")) {
			System.out.printf("\n[%d] = %s", i, nome[i]);
			}
		}
		
		//Quantidade de nomes duplicados e quantas vezes os nomes duplicados aparecem
		
		
	    int qtdNomesIguais = 0;
	    boolean [] nomeRepetido = new boolean[nome.length];
	    
	    for (int i = 0; i < nome.length-1; i++) {
	    	for (int j = i+1 ; j < nome.length; j++) {
			
				if (nome[j].compareTo(nome[i]) == 0) {
					nomeRepetido[i] = true;
				}
			}
		}
	    System.out.println("\n");
	    for (int i = 0; i < nomeRepetido.length; i++) {
	    	System.out.println(nomeRepetido[i]);
	    }
	    System.out.println();
		System.out.printf("Existem %d nomes repetidos.\n", qtdNomesIguais);
		
		}
	
		//Fazer os desafios anteriores sem ordenar o Array
	}


