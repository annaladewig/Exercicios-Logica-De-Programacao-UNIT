package Projeto_Crud;

import java.util.Scanner;

public class Crud_Array {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int opcao, qtdElementos;
			float [] array =  null;
			float dado, valorAlterado = 0, entradaElemento;
			boolean opcaoMenu = true, arrayExiste = false, encontrado = false, arrayCheio = false, elementoDuplicado = false;
			int posicoesDisponiveis =0;
			
			
			do {
				System.out.println("\n* Seletor de Op��es *\n");
				System.out.println(" 1 - Criar Array "
						+ "\n 2 - Incluir elemento "
						+ "\n 3 - Consultar elemento "
						+ "\n 4 - Alterar elemento "
						+ "\n 5 - Excluir elemento "
						+ "\n 6 - Listar array "
						+ "\n 7 - Classificar "
						+ "\n 8 - Inicializar array "
						+ "\n 0 - Fim \n");
				System.out.println("Digite a op��o:");
				opcao = scan.nextInt();
				
				switch (opcao) {
				
				case 0:
					
					opcaoMenu = false;
					System.out.println("----> FIM DAS OPERA��ES <----");
					break;
					
				case 1:
					
					if (arrayExiste == false) {
						System.out.print("Digite a quantidade de elementos do array: ");
						qtdElementos = scan.nextInt();
						
						array = new float [qtdElementos];
						System.out.println("-----> Array Criado <-----\n");
						arrayExiste = true;
						
					} else {
						System.out.println("*** Array j� existe ***\n");
					}
					break;
					
				case 2:
					
					System.out.println("-----> Inclus�o de Elemento <-----\n");
					
					if(arrayExiste) {
						
					
						for (int i = 0; i < array.length; i++) {
							if(array [i] == 0) {
								posicoesDisponiveis = posicoesDisponiveis +1;
							}
							
						}	
					
						if((arrayExiste  && posicoesDisponiveis == 0)) {
							System.out.println("*** ARRAY CHEIO ***\n");
							arrayCheio = true;
							break;
						}
					
						if(arrayExiste && (arrayCheio == false || posicoesDisponiveis > 0) ) {
							
							System.out.print("Digite o elemento para inclus�o ou 0(zero) para cancelar: ");
							entradaElemento = scan.nextFloat();
							
							if(entradaElemento != 0) {
								
								for (int i = 0; i < array.length; i++) {
									if(array[i] == entradaElemento) {
										System.out.println("-----> N�o � permitido duplicidade de elementos <-----");
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
										System.out.printf("-----> Elemento %.2f inclu�do com sucesso na posi��o %d <-----\n", array[i],(i+1));
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
								System.out.println("-----> Opera��o Cancelada <-----");
							}
							
							elementoDuplicado = false;
								
						}
					
					}
					else  {
						System.out.println(" *** Array n�o Criado ***");		
					}
							
					break;
					
				case 3:
					
					if (arrayExiste == true) {
						System.out.println("Digite o dado que voc� deseja encontrar ou 0 (zero) para cancelar: ");
						dado = scan.nextInt();
						
						if(dado!=0) {
					
							for (int i = 0; i < array.length; i++) {
								if(dado == array[i]) {
									encontrado = true;
									System.out.printf("\n-----> Elemento %.2f encontrado na posi��o %d. <-----\n", dado, i + 1);
									break;
								}
							}
							if (encontrado == false) {
								System.out.printf("\n-----> Elemento %.2f n�o encontrado <-----\n", dado);
							}
							
						} else {
							System.out.println("\n-----> OPERA��O CANCELADA <-----\n");
						}
					} else  {
						
							System.out.println("\n*** Array n�o existe ***\n");
					}
					encontrado = false;
					break;
					
				case 4:
					
					System.out.println("-----> Altera��o de Elemento <-----\n");
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
							System.out.printf("-----> Dado %.2f n�o encontrado. <-----",dado);
							break;
						 }
						 else {
								System.out.print("Digite o novo elemento do array:");
								valorAlterado = scan.nextFloat();				 
						 }
													
						for (int i = 0; i < array.length; i++) {
							if (valorAlterado == array[i]) {
								System.out.println("-----> N�o � poss�vel fazer altera��o. O valor digitado j� existe <-----");
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
						System.out.println("-----> OPERA��O DE ALTERA��O CANCELADA <-----");
					}
					break;
					
				case 5:
					
					if (arrayExiste == true) {
						
						System.out.println("Digite o dado que voc� deseja excluir ou 0 (zero) para cancelar: ");
						dado = scan.nextFloat();
						
						if(dado!=0) {
							for (int i = 0; i < array.length; i++) {
								if(dado == array[i]) {
									encontrado = true;
									array[i] = 0;
									System.out.printf("-----> Elemento %.2f exclu�do. <-----\n", dado);
									break;
								}
							}		
							
							for (int i = 0; i < array.length; i++) {
								if(array [i] == array[array.length-1]) {
									posicoesDisponiveis=0;
								}
							}	
								
							if (encontrado == false) {
								System.out.printf("-----> Elemento %.2f n�o encontrado <-----\n", dado);
							}
						
						} else {
							System.out.println("\n----> OPERA��O DE EXCLUS�O CANCELADA <----");
						}
						
					} else {
						
						System.out.println("*** Array n�o existe ***\n");
					}
					encontrado = false;
					break;
				
				
				case 6:
						
					if(arrayExiste == true) {
						System.out.println(" -----> Lista de Array <----");
						for (int i = 0; i < array.length; i++) {	
							System.out.printf("\nElemento %d: %.2f\n", i+1 , array[i]);		
						}
					}
					else {
						System.out.println("*** Crie um array ***");
						break;
					}
					break;
					
		
				case 7:
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
						
						System.out.println("*** Array n�o existe ***\n");
					}
					break;
					
				
				case 8:
					
					if(arrayExiste == true) {
						System.out.println(" -----> Inicializa��o do  Array <----");
						for (int i = 0; i < array.length; i++) {
							array [i] =-99999;	
						}
					}
					else {
						System.out.println("*** Crie um array ***");
						break;
					}				
					break;
					
				}
				
			}
				
			while(opcaoMenu);
			scan.close();
		}

	}
