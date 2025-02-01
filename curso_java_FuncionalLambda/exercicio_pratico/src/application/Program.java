/*
	Fazer um programa para ler os dados (nome, email e salário)
	de funcionários a partir de um arquivo em formato .csv.
	
	Em seguida mostrar, em ordem alfabética, o email dos
	funcionários cujo salário seja superior a um dado valor
	fornecido pelo usuário.
	
	Mostrar também a soma dos salários dos funcionários cujo
	nome começa com a letra 'M'.
 */


package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao leitor de colaboradores!");
		System.out.print("Qual o salário mínimo para comparação? R: ");
		double salary = sc.nextDouble();
		
		String path = "C:\\temp\\ws-eclipse\\curso_java_FuncionalLambda\\arquivoExecPratico.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> listEmployees = new ArrayList<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				listEmployees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> compEmpName = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> listEmails = listEmployees.stream()
													.filter(emp -> emp.getSalary() > salary)
													.map(emp -> emp.getEmail())
													.sorted(compEmpName)
													.collect(Collectors.toList());
			listEmails.forEach(System.out::println);
			
			double media = listEmployees.stream()
					.filter(emp -> emp.getName().charAt(0) == 'M')
					.map(emp -> emp.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Média dos salários com a inicial M: " + media);
			System.out.println("Fim!");
					
			
		} catch (IOException e){
			System.out.println(e);
		}
		
		
		sc.close();

	}

}
