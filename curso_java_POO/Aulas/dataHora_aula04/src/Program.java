/*
Nesta aula é demonstrado como fazer cálculos com variáveis de data. 
 * */


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-12-31"); 
		LocalDateTime d02 = LocalDateTime.parse("2023-11-30T20:37:12"); 
		Instant d03 = Instant.parse("2024-02-29T01:00:12Z"); 
		
		LocalDate semanaPassadaLocalDate = d01.minusWeeks(1);
		LocalDate semanaFuturaLocalDate = d01.plusWeeks(1);
		LocalDate cincoDiasAtras = d01.minusDays(5);
		LocalDate cincoDiasAFrente = d01.plusDays(5);
		
		System.out.println(semanaPassadaLocalDate);
		System.out.println(semanaFuturaLocalDate);
		System.out.println(cincoDiasAtras);
		System.out.println(cincoDiasAFrente);
		
		System.out.println("----------------");
		
		LocalDateTime cincoHorasAtrasLocalDateTime = d02.minusHours(5);
		LocalDateTime cincoHorasAFrenteLocalDateTime  = d02.plusHours(5);
		
		System.out.println(cincoHorasAtrasLocalDateTime);
		System.out.println(cincoHorasAFrenteLocalDateTime);
		
		System.out.println("----------------");
		
		Instant doisDiasAtrasInstant = d03.minus(2, ChronoUnit.DAYS);
		Instant doisDiasAFrenteInstant = d03.plus(2, ChronoUnit.DAYS);
		
		System.out.println(doisDiasAtrasInstant );
		System.out.println(doisDiasAFrenteInstant);
		
		System.out.println("----------------");
		
		Duration t1 = Duration.between(d01.atStartOfDay(), d02);
		Duration t2 = Duration.between(d02, cincoHorasAFrenteLocalDateTime);
		Duration t3 = Duration.between(doisDiasAtrasInstant, d03);
		
		System.out.println(t1.toDays());
		System.out.println(t2.toHours());
		System.out.println(t3.toDays());
		
		System.out.println("----------------");


	}

}
