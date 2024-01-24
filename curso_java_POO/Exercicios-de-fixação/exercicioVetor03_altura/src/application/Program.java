// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		People people = new People();
		
		System.out.println("Bem vindo ao Clínica do Zé");
		
		System.out.print("Me diga seu nome: ");
		String name = sc.next();
		
		System.out.print("Me diga sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Me diga sua altura: ");
		double altura = sc.nextDouble();
		
		people = new People(name, altura, idade);
		
		System.out.print(people.getName());
		
		
		
		
		
		sc.close();

	}

}
