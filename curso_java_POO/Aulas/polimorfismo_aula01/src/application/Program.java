/*
 * Nesta aula é apresentado o polimorfismo e um exemplo prático dele.
 * 
 * O que é polimorfismo: 
 	Em Programação Orientada a Objetos, polimorfismo é recurso que
	permite que variáveis de um mesmo tipo mais genérico possam
	apontar para objetos de tipos específicos diferentes, tendo assim
	comportamentos diferentes conforme cada tipo específico.
 
 * */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int qntEmployees = sc.nextInt();
		
		
		
		for(int i = 0; i < qntEmployees; i++) {
			System.out.println("---- Employee #" + (i + 1) + " ----");
			
			System.out.print("Outsourced? (y/n) ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value Per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(resp == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employees(name, hours, valuePerHour));
			}
			
		}
		
		for(Employees emp : list) {
			System.out.println(emp.getName() + " - R$" + emp.payment());
		}
		
		sc.close();
		
	}

}
