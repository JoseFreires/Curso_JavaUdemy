package aula_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Program {

	public static void main(String[] args) {
		String path = "C:\\temp\\teste.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			
		} catch(IOException error) {
			System.out.println("Erro: " + error);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch(IOException error) {
				error.printStackTrace();
			}
			
		}

	}

}
