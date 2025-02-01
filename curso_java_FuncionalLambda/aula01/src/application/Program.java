package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("iPhone", 150000.0));
		list.add(new Product("Armario", 2000.0));
		list.add(new Product("Teclado", 50.0));
		
		// 1° Método de criar um CompareTo: Objeto de Classe Separada
		
		list.sort(new MyCompareTo());
		
		// 2° Método de criar um Comparator: Classe Anônima
		
		Comparator<Product> comp = new Comparator<Product>() { 
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			};
			
		};
		
		list.sort(comp);
		
		// 3° Método de criar um Comparator: Expressão lambda com chaves
		
		Comparator<Product> comp2 = (p1, p2) -> { 
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			
		};
		
		list.sort(comp2);
		
		// 4° Método de criar um Comparator: Expressão lambda sem chaves
		
		Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp3);
		
		// 5° Método de criar um Comparator: Expressão lambda "direto no argumento"
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product item : list) {
			System.out.println(item);
		}

	}

}
