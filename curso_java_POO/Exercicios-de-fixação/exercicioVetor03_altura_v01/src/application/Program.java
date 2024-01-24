// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver.

package application;

import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao Clínica do Zé");
		
		System.out.print("Quantas pessoas vão compartilhar suas informações? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Pessoa " + (i + 1));
			
			System.out.print("Me diga seu nome: ");
			nomes[i] = sc.next();
			
			System.out.print("Me diga sua idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Me diga sua altura: ");
			alturas[i] = sc.nextDouble();
		};
		int contador = 0;
		double somaDeAlturas = 0.0;
		
		for(int i = 0; i < n; i++) {
			somaDeAlturas = somaDeAlturas + alturas[i];
			if(idades[i] < 16) {
				contador = contador + 1;
			}
		}
		
		double mediaAlturas = somaDeAlturas/n;
		double porcentagem = (contador * 100.00)/n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAlturas);
		System.out.printf("Porcentagem de menores de 16: %.1f%%%n", porcentagem);
		
		
		sc.close();

	}

}
