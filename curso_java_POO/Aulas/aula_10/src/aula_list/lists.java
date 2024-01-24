/* Nesta aula foi apresentado como utilizar listas em Java.
 * 
 * */


package aula_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lists {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		// Adicionar elementos a lista
		list.add("Jose"); 
		list.add("Ana");
		list.add("Carmem");
		list.add("Mario");
		list.add("Janaina");
		
		System.out.println(list.size()); // Mostra o tamanho da lista
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		list.remove("Ana"); // Removendo um elemento da lista usando seu 'nome'
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		list.remove(0); // Removendo um elemento da lista usando sua posição
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Removendo um elemento da lista usando um detalhe
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		System.out.println("Posição da Janaina: " + list.indexOf("Janaina")); // Descobrindo a posição de um elemento
		System.out.println("-----------------");
		
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList()); // Retirando todos os elementos aqueles com essa caracteristica
		for(String x : resultado) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);
		
		sc.close();
		
		
	}
}
