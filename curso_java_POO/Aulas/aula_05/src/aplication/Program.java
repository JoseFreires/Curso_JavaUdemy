/* 
 * Nesta aula é o exemplo da aula anterior, mas agora utilizando funções que estão presentes no objeto Product.
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
		
		System.out.println();
		System.out.printf("Dados do produto: ",  product);
		
		System.out.println();
		System.out.printf("Digite o quanto de produtos serão adicionados: ");
		int quant = sc.nextInt();
		product.addProducts(quant);
		
		System.out.println();
		System.out.printf("Dados atualizados do produto: ", product);
		
		System.out.println();
		System.out.printf("Digite o quanto de produtos serão removidos: ");
		quant = sc.nextInt();
		product.removeProducts(quant);
		
		System.out.println();
		System.out.printf("Dados atualizados do produto: ", product);
		
		
		
		sc.close();
		

	}

}
