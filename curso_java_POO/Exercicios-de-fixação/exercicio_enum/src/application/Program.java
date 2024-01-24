/* 
	Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um 
	sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser 
	o instante do sistema: new Date()
*/


package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Order order = new Order();
		
		System.out.println("Insira os dados do cliente:");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();		
		System.out.print("Data de nascimento(dd/mm/yyy): ");
		Date dataNascimento = sdf.parse(sc.next());
		Client client = new Client(name, email, dataNascimento);
		
		System.out.println("Insira o status de seu pedido:");
		System.out.print("Status: ");
		String status = sc.next();
		
		
		order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		System.out.print("Qnt. de items do pedido: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Pedido #" + (i + 1));
			
			System.out.print("Nome do produto: ");
			String nameProduct = sc.next();
			System.out.print("Valor: ");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantidade: ");
			int qntProduct = sc.nextInt();
			
			Product product = new Product(nameProduct, priceProduct);
			OrderItem item = new OrderItem(qntProduct, priceProduct, product);
			
			order.addItem(item);
			
		}
		
		System.out.print("");
		System.out.println(order);
		
		sc.close();

	}

}
