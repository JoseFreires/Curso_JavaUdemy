// Estrutura da Function:
// T = O que vai receber | R = o que vai retornar
// public interface Function<T, R> { 
//		R apply(T t); 
// }



package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// 1° Método: Implementação da interface
		
		List<String> namesUpperCase = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); 
		// NOTA: A função "map" (não confunda com a estrutura de dados Map) é uma função que aplica uma função a todos elementos de uma stream.
		// Por isso precisa converter a lista para stream e dps colocar como list novamente.

		// 2° Método: Reference method com método estático
		List<String> namesUpperCase2 = list.stream().map(Product::staticUpperCaseNames).collect(Collectors.toList()); 

		// 3° Método: Reference method com método não estático
		List<String> namesUpperCase3 = list.stream().map(Product::nonstaticUpperCaseNames).collect(Collectors.toList()); 

		// 4° Método: Expressão lambda declarada
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		List<String> namesUpperCase4 = list.stream().map(func).collect(Collectors.toList()); 
		

		// 5° Método: • Expressão lambda inline
		
		List<String> namesUpperCase5 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); 
		

		namesUpperCase.forEach(System.out::println);
		System.out.println(" ");
		namesUpperCase2.forEach(System.out::println);
		System.out.println(" ");
		namesUpperCase3.forEach(System.out::println);
		System.out.println(" ");
		namesUpperCase4.forEach(System.out::println);
		System.out.println(" ");
		namesUpperCase5.forEach(System.out::println);

	}

}
