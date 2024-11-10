/* Ainda não terminado
 * 
 * 
 * */

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao gerador de relatório!");
		System.out.print("Informe o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();
			
			while(line != null) {
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		sc.close();
	}

}
