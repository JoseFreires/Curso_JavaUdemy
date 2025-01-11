/*

Um site de internet registra um log de acessos dos usuários. Um
registro de log consiste no nome de usuário (apenas uma palavra) e o
instante em que o usuário acessou o site no padrão ISO 8601,
separados por espaço, conforme exemplo. Fazer um programa que leia
o log de acessos a partir de um arquivo, e daí informe quantos usuários
distintos acessaram o site.


*/
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Logs;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\temp\\ws-eclipse\\curso_java_GenericsSetMap\\arquivoLog_exercicio\\logs.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<Logs> setLogs = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date dateLogin = Date.from(Instant.parse(fields[1]));
				
				setLogs.add(new Logs(username, dateLogin));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + setLogs.size());
			
		} catch(IOException error) {
			System.out.print("Error: " + error);
		}
		
		sc.close();
	}

}
