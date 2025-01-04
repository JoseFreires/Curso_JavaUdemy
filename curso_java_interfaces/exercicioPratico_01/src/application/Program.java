package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Contract con = new Contract();
		ContractService contServ = new ContractService(new PaypalService());
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Bem-vindo ao Gerenciador de Contratos do Zé");
		System.out.println("Insira os dados do contrato: ");
		
		System.out.print("N° do contrato: ");
		con.setNumber(sc.nextInt());
		
		System.out.print("Data (DD/MM/yyyy): ");
		LocalDate dateContract = LocalDate.parse(sc.next(), fmt);
		con.setDate(dateContract);
		
		System.out.print("Valor do contrato: ");
		Double contractValue = sc.nextDouble();
		con.setTotalValue(contractValue);
		
		System.out.print("Número das parcelas: ");
		Integer numberInstallment = sc.nextInt();
		
		contServ.processContract(con, numberInstallment);
		
		System.out.println("Parcelas: ");
		
		for(Installment insta : con.getInstallments()) {
			System.out.println(insta);
		}
		
		sc.close();

	}

}
