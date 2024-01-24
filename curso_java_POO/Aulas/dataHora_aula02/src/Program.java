import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-12-25"); 
		LocalDateTime d02 = LocalDateTime.parse("2023-11-30T20:00:12"); 
		Instant d03 = Instant.parse("2024-02-29T20:00:12Z"); 
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME; // Um formato padrão
		DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT; // Um formato padrão
		
		System.out.println(d01.format(fmt01)); // Transformando uma variável de data em um formato personalizado
		System.out.println(fmt01.format(d01)); // Outra forma transformar uma variável de data em um formato personalizado
		
		System.out.println(d02.format(fmt02)); // Transformando uma variável de data e hora em um formato personalizado
		System.out.println(d02.format(fmt04));
		
		System.out.println(fmt03.format(d03)); // Transformando uma variável de data e hora mundial em um formato personalizado (Obs: foi necessário inverter a ordem para que fosse possível formatar)
		System.out.println(fmt05.format(d03)); 
		System.out.println(d03.toString()); 
		
	}

}
