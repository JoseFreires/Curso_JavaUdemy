/*
	Na contagem de votos de uma eleição, são gerados vários registros
	de votação contendo o nome do candidato e a quantidade de votos
	(formato .csv) que ele obteve em uma urna de votação. Você deve
	fazer um programa para ler os registros de votação a partir de um
	arquivo, e daí gerar um relatório consolidado com os totais de cada
	candidato.

*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao Contador de Votos!");
		
		String path = "C:\\temp\\ws-eclipse\\curso_java_GenericsSetMap\\arquivoExecPraticoMap.txt";
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(fields[0])) {
					
					int currentVotes = votes.get(name);
					votes.put(name, count + currentVotes);
				} else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) { 
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
