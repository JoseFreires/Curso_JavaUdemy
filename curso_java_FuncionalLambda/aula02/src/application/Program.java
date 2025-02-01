//Problema exemplo
//Fazer um programa que, a partir de uma lista de produtos, remova da
//lista somente aqueles cujo preço mínimo seja 100.


package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		// 1ª Versão: Implementação da interface
		list.removeIf(new ProductPredicate());
		
		// 2ª Versão: Reference method com método estático
		list.removeIf(Product::staticProductPredicate);
		
		// 3ª Versão: Reference method com método não estático
		list.removeIf(Product::nonStaticProductPredicate);
		
		// 4ª Versão: Expressão lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		list.removeIf(pred);
		
		// 5ª Versão:  Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Product item : list) {
			System.out.println(item);
		}

	}

}
