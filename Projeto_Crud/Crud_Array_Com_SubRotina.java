package Projeto_Crud;

import java.util.Scanner;

public class Crud_Array_Com_SubRotina {
	static Scanner scan = new Scanner(System.in);
	
	static int opcao, qtdElementos;
	static float [] array =  null;
	static float dado, valorAlterado = 0, entradaElemento;
	static boolean opcaoMenu = true, arrayExiste = false, encontrado = false, arrayCheio = false, elementoDuplicado = false;
	static int posicoesDisponiveis =0;
	
	public static void main(String[] args) {
		
		
		
		do {
			menu();
			System.out.println("Digite a opção:");
			opcao = scan.nextInt();
			
			switch (opcao) {
			
			case 0:
				
				opcaoMenu = false;
				System.out.println("----> FIM DAS OPERAÇÕES <----");
				break;
				
			case 1:
				criarArray();
				break;
				
			case 2:
				incluirElemento();	
				break;
				
			case 3:
				consultarElemento();
				break;
				
			case 4:
				
				alterarElemento();
				break;
				
			case 5:
				
				excluirElemento();
				break;
			
			
			case 6:
					
				listarArray();
				break;
				
	
			case 7:
				classificar();
				break;
				
			
			case 8:
				
				inicializar();		
				break;
				
			}
			
		}
			
		while(opcaoMenu);
		scan.close();
		
	}

	public static void menu() {
		System.out.println("\n* Seletor de Opções *\n");
		System.out.println(" 1 - Criar Array "
				+ "\n 2 - Incluir elemento "
				+ "\n 3 - Consultar elemento "
				+ "\n 4 - Alterar elemento "
				+ "\n 5 - Excluir elemento "
				+ "\n 6 - Listar array "
				+ "\n 7 - Classificar "
				+ "\n 8 - Inicializar array "
				+ "\n 0 - Fim \n");
	}
	
	public static void criarArray() {
		if (arrayExiste == false) {
			System.out.print("Digite a quantidade de elementos do array: ");
			qtdElementos = scan.nextInt();
			
			array = new float [qtdElementos];
			System.out.println("-----> Array Criado <-----\n");
			arrayExiste = true;
			
		} else {
			System.out.println("*** Array já existe ***\n");
		}
	}
	
	public static void incluirElemento() {
		System.out.println("-----> Inclusão de Elemento <-----\n");
		
		if(arrayExiste) {
			for (int i = 0; i < array.length; i++) {
				if(array [i] == 0) {
					posicoesDisponiveis = posicoesDisponiveis +1;
				}
				
			}	
		
			if((arrayExiste  && posicoesDisponiveis == 0)) {
				System.out.println("*** ARRAY CHEIO ***\n");
				arrayCheio = true;
			}
		
			if(arrayExiste && (arrayCheio == false || posicoesDisponiveis > 0) ) {
				
				System.out.print("Digite o elemento para inclusão ou 0(zero) para cancelar: ");
				entradaElemento = scan.nextFloat();
				
				if(entradaElemento != 0) {
					
					for (int i = 0; i < array.length; i++) {
						if(array[i] == entradaElemento) {
							System.out.println("-----> Não é permitido duplicidade de elementos <-----");
							elementoDuplicado = true;
							break;
						}
					}
					
					for (int i = 0; i < array.length; i++) {
						if(array[i] != 0) {
							continue;		
						}
					
						else if (array[i] == 0 && elementoDuplicado == false){
							array[i] = entradaElemento;
							System.out.printf("-----> Elemento %.2f incluído com sucesso na posição %d <-----\n", array[i],(i+1));
							opcaoMenu = true;
							posicoesDisponiveis = 0;
							break;
							
						}
						else if(arrayExiste == false) {
							System.out.println("*** Array Cheio ***");
							continue;
						}
					}					
				}		
				
				 else {
					System.out.println("-----> Operação Cancelada <-----");
				}
				
				elementoDuplicado = false;
					
			}
		
		}
		else  {
			System.out.println(" *** Array não Criado ***");		
		}
	}

	public static void consultarElemento() {
		if (arrayExiste == true) {
			System.out.println("Digite o dado que você deseja encontrar ou 0 (zero) para cancelar: ");
			dado = scan.nextInt();
			
			if(dado!=0) {
		
				for (int i = 0; i < array.length; i++) {
					if(dado == array[i]) {
						encontrado = true;
						System.out.printf("\n-----> Elemento %.2f encontrado na posição %d. <-----\n", dado, i + 1);
						break;
					}
				}
				if (encontrado == false) {
					System.out.printf("\n-----> Elemento %.2f não encontrado <-----\n", dado);
				}
				
			} else {
				System.out.println("\n-----> OPERAÇÃO CANCELADA <-----\n");
			}
		} else  {
			
				System.out.println("\n*** Array não existe ***\n");
		}
		encontrado = false;
	}
	
	public static void alterarElemento() {
		System.out.println("-----> Alteração de Elemento <-----\n");
		System.out.print("Digite o dado que  deseja alterar ou 0(zero) para cancelar:");
		dado = scan.nextFloat();
		
		if(dado!=0) {
			int contadorDado=0;
			for (int i = 0; i < array.length; i++) {
				if(dado != array[i]) {
				
					contadorDado++;
				}
			}
			 if(contadorDado == array.length ) {
				System.out.printf("-----> Dado %.2f não encontrado. <-----",dado);
			 }
			 else {
					System.out.print("Digite o novo elemento do array:");
					valorAlterado = scan.nextFloat();				 
			 }
										
			for (int i = 0; i < array.length; i++) {
				if (valorAlterado == array[i]) {
					System.out.println("-----> Não é possível fazer alteração. O valor digitado já existe <-----");
					elementoDuplicado = true;
					break;
				}
			}
			
			for (int i = 0; i < array.length; i++) {
				if(dado == array[i] && elementoDuplicado == false ) {
					array [i] = valorAlterado;
					System.out.println("-----> Elemento Alterado <-----");
					break;
				}		
			}
			elementoDuplicado = false;
		}
		else {
			System.out.println("-----> OPERAÇÃO DE ALTERAÇÃO CANCELADA <-----");
		}
	}

	public static void excluirElemento() {
		if (arrayExiste == true) {
			
			System.out.println("Digite o dado que você deseja excluir ou 0 (zero) para cancelar: ");
			dado = scan.nextFloat();
			
			if(dado!=0) {
				for (int i = 0; i < array.length; i++) {
					if(dado == array[i]) {
						encontrado = true;
						array[i] = 0;
						System.out.printf("-----> Elemento %.2f excluído. <-----\n", dado);
						break;
					}
				}		
				
				for (int i = 0; i < array.length; i++) {
					if(array [i] == array[array.length-1]) {
						posicoesDisponiveis=0;
					}
				}	
					
				if (encontrado == false) {
					System.out.printf("-----> Elemento %.2f não encontrado <-----\n", dado);
				}
			
			} else {
				System.out.println("\n----> OPERAÇÃO DE EXCLUSÃO CANCELADA <----");
			}
			
		} else {
			
			System.out.println("*** Array não existe ***\n");
		}
		encontrado = false;
	}

	public static void listarArray() {
		if(arrayExiste == true) {
			System.out.println(" -----> Lista de Array <----");
			for (int i = 0; i < array.length; i++) {	
				System.out.printf("\nElemento %d: %.2f\n", i+1 , array[i]);		
			}
		}
		else {
			System.out.println("*** Crie um array ***");
		}
	}

	public static void classificar() {
		if (arrayExiste == true) {
			
			int menorValor;
			for (int i = 0; i < array.length-1; i++) {
				menorValor = i;
				
				for (int j = i + 1 ; j < array.length; j++) {
					
					if (array[j] < array[menorValor]) {
						menorValor = j;					
					}
				}
				float temp = array[i];
				array[i] = array[menorValor];
				array[menorValor] = temp;
			}
			
			System.out.println("\n-----> O array foi ordenado <-----\n");
			
			} else {
				
				System.out.println("*** Array não existe ***\n");
			}
	}

	public static void inicializar() {
		if(arrayExiste == true) {
			System.out.println(" -----> Inicialização do  Array <----");
			for (int i = 0; i < array.length; i++) {
				array [i] =-99999;	
			}
		}
		else {
			System.out.println("*** Crie um array ***");
		}		
	}
}
