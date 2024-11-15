/*
 * Nesta aula foi apresentado outra forma de criar um programa que utiliza objetos, agora com um exemplo de produtos.
 * Ainda não utilizamos as funções de adicionar e retirar produtos que existem no objeto.
 * 
 * */

package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Digite o produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		product.quant = sc.nextInt();
		
		
		System.out.println(product);
		
		sc.close();
		

	}

}
