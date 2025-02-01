/*
Tema: Pipeline 

O pipeline é composto por zero ou mais operações intermediárias e 
uma terminal.

-> Operação intermediária: 
	• Produz uma nova streams (encadeamento)
	• Só executa quando uma operação terminal é invocada (lazy evaluation)
-> Operação terminal:
	• Produz um objeto não-stream (coleção ou outro)
	• Determina o fim do processamento da stream


*/
package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		// Operação intermediária vindo de uma lista
		List<Integer> list = Arrays.asList(4, 9, 5, 7, 23);
		Stream<Integer> st1 = list.stream().map(e -> e * 12);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x, y) -> x + y); // Operação terminal
		System.out.println("Total: " + sum);
		
		List<Integer> newList = list.stream()
				.filter(num -> num % 2 == 1) // Operação intermediária
				.map(num -> num * 2) // Operação intermediária
				.collect(Collectors.toList()); // Operação terminal
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
