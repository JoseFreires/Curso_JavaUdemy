/*
Estrutura Consumer: 
	public interface Consumer<T> {
		void accept(T t);
	}

*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.UpdatePriceProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		// 1° Método: Implementação da interface
		list.forEach(new UpdatePriceProduct());
		
		// 2° Método: Reference method com método estático
		list.forEach(Product::staticUpdatePrice);
		
		// 3° Método: Reference method com método não estático
		list.forEach(Product::nonstaticUpdatePrice);
		
		// 4° Método: Expressão lambda declarada
		Consumer<Product> comp = p -> p.setPrice(p.getPrice() + 1.1);
		
		list.forEach(comp);
		
		// 5° Método: • Expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() + 1.1));
		
		
		list.forEach(System.out::println);

	}

}
