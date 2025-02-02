/*
Fazer um programa para ler um conjunto de produtos a partir de um
arquivo em formato .csv (suponha que exista pelo menos um produto).
Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
nomes, em ordem decrescente, dos produtos que possuem preço
inferior ao preço médio.

*/
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entitities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\ws-eclipse\\curso_java_FuncionalLambda\\arquivoExecExemplo.txt"))){
			
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double media = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();
			System.out.println("Média: " + String.format("%.2f", media));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()); 
			
			List<String> listNames = list.stream()
										.filter(p -> p.getPrice() < media)
										.map(p -> p.getName())
										.sorted(comp.reversed())
										.collect(Collectors.toList());
			
			listNames.forEach(System.out::println);
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		

	}

}
