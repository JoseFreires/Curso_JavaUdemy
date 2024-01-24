/* 
 * Exercício: Criar uma aplicação que recebe informações de quantas reservas serão feitas e as informações de quem está fazendo a reserva.
 * Após isso apresentar as reservas feitas
 * Desta vez utilizando uma classe para o Aluguel
 * 
 * */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] quartos = new Aluguel[10];
		
		
		System.out.println("Pensão do Zé! O lugar que você descansa.");
		System.out.print("Quantos quartos vão ser alugados? ");
		
		int qntAluguel = sc.nextInt();
		
		for (int i = 0; i < qntAluguel; i++) {
			System.out.println();
			System.out.println("Aluguel " + (i + 1));
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
		
			
			quartos[quarto] = new Aluguel(nome, email);
	
			
		}
		
		System.out.println();
		System.out.println("Reserva: ");
		for (int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println("Quarto " + i + ": " + quartos[i]);
			}
			
		}
		
	
		sc.close();
	}
}
