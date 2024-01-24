/*
 * Exercício: O usuário coloca as informações de um trabalhador, como: nome, salário atual e imposto que tem sobre ele.
 * Depois diz qual a porcentagem de aumento que ele vai receber.
 * Então, o programa apresenta o novo salário após aumento.
 * 
 * */


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee salaryEmployee = new Employee();
		
		System.out.print("Nome: ");
		salaryEmployee.name = sc.nextLine();
		
		System.out.print("Salário: ");
		salaryEmployee.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		salaryEmployee.tax = sc.nextDouble();
		
		System.out.println(salaryEmployee.toString());
		
		System.out.print("Qual a porcetagem do aumento? ");
		double porcentagem = sc.nextDouble();
		
		System.out.print("Novo salário: " + salaryEmployee.upgradeSalary(porcentagem));
		
		
		
		
		sc.close();
		

	}

}
