import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-12-25"); 
		LocalDateTime d02 = LocalDateTime.parse("2023-11-30T20:37:12"); 
		Instant d03 = Instant.parse("2024-02-29T01:00:12Z"); 
		
		LocalDate r01 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // Converte o instante para ser compatível o sistema
		LocalDate r02 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); // Converte o instante para ser de uma região específica
		LocalDateTime r03 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault()); // Converte o instante para ser compatível o sistema
		LocalDateTime r04 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal")); // Converte o instante para ser de uma região específica
		
		System.out.println(r01);
		System.out.println(r02);
		System.out.println(r03);
		System.out.println(r04);
		
		System.out.println("-----------------");
		
		System.out.println(d01.getDayOfMonth()); // Pega o dia do mês
		System.out.println(d01.getMonth() + " == " + d01.getMonthValue()); // Pega o nome do mês e seu valor
		System.out.println(d01.getYear()); // Pega o ano
		System.out.println(d01.getDayOfYear()); // Pega qual é o dia do ano (entre os 365 dias)
		
		System.out.println("-----------------");
		
		System.out.println(d02.getHour() + "h" + d02.getMinute() + "m"); // Pega o horário
	}

}
