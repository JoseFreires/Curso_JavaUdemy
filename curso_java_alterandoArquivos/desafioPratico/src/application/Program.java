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
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao gerador de relatório!");
		System.out.println("Iniciando... ");
		
		String inPath = "C:\\temp\\ws-eclipse\\curso_java_alterandoArquivos\\arquivos de dados\\relatorios_pendentes\\vendasMensal.csv";
		String outPath = "C:\\temp\\ws-eclipse\\curso_java_alterandoArquivos\\arquivos de dados\\relatorios_prontos\\resumoVendas.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(inPath))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] listItens = line.split("[;]");
				String valueTotal = listItens[1].replace(",", ".");
				Double newTotal = Double.valueOf(valueTotal) * Double.valueOf(listItens[2]);
				System.out.println(listItens[0] +  newTotal);
				
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){
					for(String item : listItens) {
						bw.write(item);
						bw.newLine();
					}
				}
				
				
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		sc.close();
	}

}
