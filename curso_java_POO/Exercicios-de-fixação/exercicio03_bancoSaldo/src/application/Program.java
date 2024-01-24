/* 
 * Exercício: Criar uma aplicação de um banco fícticio onde o usuário diz suas informações, pode efetuar um depósito ou realizar um saque.
 * Após ele optar por fazer ou não fazer qualquer uma das ações o programa apresenta seus dados atualmente.
 * 
 * */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Bank bank = new Bank();	
		
		System.out.println("Bem vindo ao Banco do Zé");
		
		System.out.print("Me diga o número da sua conta: ");
		int numberAccount = sc.nextInt();
		
		
		System.out.print("Me diga o nome do titular: ");
		String name = sc.next();
		
		
		System.out.print("Deseja colocar um depósito inicial? (s/n) ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.print("Digite seu depósito inicial: R$");
			double saldo = sc.nextDouble();
			
			bank = new Bank(name, saldo, numberAccount);
			
		} else {
			bank = new Bank(name, numberAccount);	
		}
		
		System.out.println();
		System.out.println("Seus dados atualmente: ");
		System.out.println(bank);
		
		System.out.print("Valor de depósito: R$");
		double deposit = sc.nextDouble();
		bank.addDeposit(deposit);
		
		System.out.println();
		System.out.println("Seus dados atualmente: ");
		System.out.println(bank);
		
		System.out.print("Valor de saque: R$");
		double saque = sc.nextDouble();
		bank.removeDeposit(saque);
		
		System.out.println();
		System.out.println("Seus dados atualmente: ");
		System.out.println(bank);
		
		sc.close();

	}

}
