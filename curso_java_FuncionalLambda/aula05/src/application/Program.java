/*
Função como parametro de função
Fazer um programa que, a partir de uma lista de produtos, calcule a
soma dos preços somente dos produtos cujo nome começa com "T".
 */

package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filterProducts(list, p -> p.getName().charAt(0) == 'H');
		
		System.out.println("Soma total: " + String.format("%.2f", sum));
		
	}

}
