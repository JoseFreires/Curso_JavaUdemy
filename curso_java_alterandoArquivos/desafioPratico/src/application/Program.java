/* 	Fazer um programa para ler o caminho de um arquivo .csv
	contendo os dados de itens vendidos. Cada item possui um
	nome, preço unitário e quantidade, separados por ponto e vírgula. Você
	deve gerar um novo arquivo, localizado
	em uma subpasta a partir da pasta original do
	arquivo de origem, contendo apenas o nome e o valor total para
	aquele item (preço unitário multiplicado pela quantidade).

*/

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao gerador de relatório!");
		System.out.println("Iniciando... ");
		
		String inPath = "C:\\temp\\ws-eclipse\\curso_java_alterandoArquivos\\arquivos de dados\\relatorios_pendentes\\vendasMensal.csv";
		String outPath = "C:\\temp\\ws-eclipse\\curso_java_alterandoArquivos\\arquivos de dados\\relatorios_prontos\\resumoVendas.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(inPath))){
			
			List<List> listOfList = new ArrayList<>();
			String line = br.readLine();
			
			while(line != null) {
				List<String> listItensArray = new ArrayList<>();
				String[] listItensVector = line.split(";");
				String valueTotal = listItensVector[1].replace(",", ".");
				Double newTotal = Double.valueOf(valueTotal) * Double.valueOf(listItensVector[2]);
				
				
				for(int item = 0; item < listItensVector.length; item++) {
					String teste = listItensVector[item];
					listItensArray.add(teste);
				}
				
				listItensArray.remove(1);
				listItensArray.remove(1);
				listItensArray.add(newTotal.toString());
				
				listOfList.add(listItensArray);
				
				line = br.readLine();
				
				
				
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){
				for(List list : listOfList) {
					for(Object item : list) {
						bw.write(item.toString());
						bw.write(";");
					}	
					bw.newLine();
				}
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.print("Terminou!");
		sc.close();
	}

}
