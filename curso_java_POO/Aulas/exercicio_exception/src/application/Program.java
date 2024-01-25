/*
Fazer um programa para ler os dados de uma conta bancária e depois realizar um 
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer 
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de 
saque da conta.
 * 
 * 
 * */


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("--- Enter account data ---");
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		
			System.out.println("");
			System.out.print("Enter amount for withdraw: ");
			double value = sc.nextDouble();
			account.withdraw(value);
			
			System.out.print("New balance: " + account.getBalance());
			
		} catch(WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
