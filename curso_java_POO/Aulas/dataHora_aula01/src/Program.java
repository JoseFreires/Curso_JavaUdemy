// Mostrando com funciona marcações datas e horas no Java

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// Formatos de data e hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Criando variáveis de tempo 
		LocalDate d01 = LocalDate.now(); // Forma de colocar a data atual em uma variável
		LocalDateTime d02 = LocalDateTime.now(); // Forma de colocar a data e hora atual em uma variável
		Instant d03 = Instant.now(); // Forma de colocar a data e hora mundial(horário de Londres) atual em uma variável
		
		LocalDate d04 = LocalDate.parse("2023-11-16"); // Forma de colocar uma data qualquer em uma variável (Obs: necessário seguir o padrão Zulu)
		LocalDateTime d05 = LocalDateTime.parse("2023-11-16T20:00:12"); // Forma de colocar uma data e hora qualquer em uma variável (Obs: necessário seguir o padrão Zulu)
		Instant d06 = Instant.parse("2023-11-16T20:00:12Z"); // Forma de colocar uma data e hora mundial qualquer em uma variável (Obs: necessário seguir o padrão Zulu)
		Instant d07 = Instant.parse("2023-11-16T20:00:12-03:00"); // Forma de colocar uma data e hora de um país em uma variável, mas sendo mostrada em padrão universal (Obs: necessário seguir o padrão Zulu)
		
		LocalDate d08 = LocalDate.parse("30/09/2023", fmt1); // Forma de colocar uma data qualquer em uma variável utilizando um formato personalizado
		LocalDateTime d09 = LocalDateTime.parse("30/09/2023 20:30", fmt2); // Forma de colocar a data e hora em uma variável utilizando um formato personalizado
		
		LocalDate d10 = LocalDate.of(2020, 7, 30); // Uma forma de gerar uma data usando cada parte dela (ano, mês, dia)
		LocalDateTime d11 = LocalDateTime.of(2025, 12, 25, 00, 30); // Uma forma de gerar uma data usando cada parte dela (ano, mês, dia)
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03); 
		
		System.out.println("---------------"); 
		
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06); 
		System.out.println(d07); 
		
		System.out.println("---------------"); 
		
		System.out.println(d08); 
		System.out.println(d09); 
		
		System.out.println("---------------"); 
		
		System.out.println(d10); 
		System.out.println(d11);
		
		
		

	}

}
