/*
Fazer um programa para ler os dados de N
produtos (N fornecido pelo usuário). Ao final,
mostrar a etiqueta de preço de cada produto na
mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos
importados possuem uma taxa de alfândega, e
produtos usados possuem data de fabricação.

Estes dados específicos devem ser
acrescentados na etiqueta de preço conforme
exemplo (próxima página). Para produtos
importados, a taxa e alfândega deve ser
acrescentada ao preço final do produto
*/

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		for(int i = 0; i < numberProducts; i++) {
			System.out.println("Product #" + (i + 1));
			
			System.out.print("Common, used or imported?(c/u/i) ");
			char typeProduct = sc.next().charAt(0);
			System.out.print("Name product: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(typeProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
				
			} else if (typeProduct == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} else if (typeProduct == 'c'){
				list.add(new Product(name, price));
			}
			
			
		}
		
		System.out.println("PRICE TAGS: ");
		for(Product item : list) {
			System.out.println(item.priceTag());
			
		}
		
		sc.close();
		
	}

}
