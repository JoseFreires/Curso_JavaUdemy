/*
Nesta aula foi apresentado as classes Abstratas que estão presentes no Java.

O que são classes Abstratas?

São classes que não podem ser instanciadas
É uma forma de garantir herança total: somente subclasses não 
abstratas podem ser instanciadas, mas nunca a superclasse abstrata
*/

package aplication;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Carlinhos", 1200.0); // A classe Account é uma classe abstrata.
		Account acc2 = new SavingsAccount(1001, "Carla", 1200.0, 500.0);
		Account acc3 = new BusinessAcount(1001, "Carlormeu", 1200.0, 5000.0);

	}

}
