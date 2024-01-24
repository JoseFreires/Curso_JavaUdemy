/* Nesta aula é apresentado um exemplo de como somos capazes de executar uma função de cada classe e receber um resultado correspondente
 * a classe que desejamos.
 * 
 * */

package aplication;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(001, "Marcelo", 1000.0);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(002, "Marcos", 1000.0, 500.0);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAcount(003, "Maria", 1000.0, 500.0);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance());

	}

}
