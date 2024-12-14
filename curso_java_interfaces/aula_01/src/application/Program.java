// Demonstrando exemplo real de um uso de INTERFACE


package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Bem-vindo ao Aluguel de Carros do Zé");
		System.out.println("Digite abaixo as informações solicitadas: ");
		System.out.print("Modelo do veículo: ");
		String carModel = sc.nextLine();
		System.out.print("Inicio (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço em hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço em dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA");
		System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		
		sc.close();

	}

}
