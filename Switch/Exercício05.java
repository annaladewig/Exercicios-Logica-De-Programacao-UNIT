package Switch;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String data ="", dia ="",  mes ="", ano = ""; 
		boolean erro = false;
		
		System.out.print("Escreva uma data no formato (dd/mm/aaaa): ");
		data = teclado.next();
		
		dia = data.substring(0, 2);
		ano = data.substring(6);
		switch (data.substring(3,5)) {
		case "01": 
			mes = "janeiro";
			break;
		case "02": 
			mes = "fevereiro";
			break;
		case "03": 
			mes = "março";
			break;
		case "04": 
			mes = "abril";
			break;
		case "05": 
			mes = "maio";
			break;
		case "06": 
			mes = "junho";
			break;
		case "07": 
			mes = "julho";
			break;
		case "08": 
			mes = "agosto";
			break;
		case "09": 
			mes = "setembro";
			break;
		case "10": 
			mes = "outubro";
			break;
		case "11": 
			mes = "novembro";
			break;
		case "12": 
			mes = "dezembro";
			break;
		default:
			System.out.println("Mês incorreto.");
			erro = true;
			break;
		}
		if (erro == false) {
			System.out.printf("A data digitada foi %s de %s de %s.", dia, mes, ano);			
		}
		teclado.close();
	}

}
