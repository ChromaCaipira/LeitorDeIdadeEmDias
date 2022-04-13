package aplicação;

import modelagem.Idade;
import java.util.Scanner;

public class App {
	private static Idade calcidade;
	public static void main(String[] args) {
		int anos;
		int meses;
		int dias;
		
		try(Scanner scan = new Scanner(System.in)){ //Desta forma, o scanner pode ser fechado usando-o dentro de try
			System.out.println("De acordo com sua idade, quantos anos você tem? ");
			anos = scan.nextInt();
			System.out.println("..e quantos meses? ");
			meses = scan.nextInt();
			System.out.println("..e quantos dias? ");
			dias = scan.nextInt();
			
			calcidade = new Idade(anos, meses, dias); //Armazena a nova idade, inserida pelo usuário, na classe Idade
			
			System.out.println(calcidade.idade());
		}
	}
}