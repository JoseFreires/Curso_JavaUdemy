/*
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
*/


import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	
		int y = sc.nextInt();
		int[][] matriz = new int[x][y];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt(); 
				
			}
		}
		
		int numeroProcurado = sc.nextInt();
		int contador = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numeroProcurado) {
					System.out.println("x: " + i + " y: " + j); 
					if(i == 0 && j == 0) { // Esquerda superior
						System.out.println("Embaixo: " + matriz[i+1][j]);
						System.out.println("Na direita: " + matriz[i][j+1]);
						
					} else if((j + 1) == matriz[i].length && i == 0) { // Direita superior
						System.out.println("Embaixo : " + matriz[i+1][j]);
						System.out.println("Na esquerda : " + matriz[i][j-1]);
						
					} else if((i + 1) == matriz.length && (j + 1) == matriz[i].length) { // Direita inferior
						System.out.println("Emcima : " + matriz[i-1][j]);
						System.out.println("Na esquerda : " + matriz[i][j-1]);
						
					} else if(j == 0 && (i + 1) == matriz.length) { // Esquerda inferior
						System.out.println("Emcima : " + matriz[i-1][j]);
						System.out.println("Na direita : " + matriz[i][j+1]);

					} else if(i == 0 && j > 0) { // No meio na primeira linha
						System.out.println("Em baixo : " + matriz[i+1][j]);
						System.out.println("Na esquerda : " + matriz[i][j-1]);
						System.out.println("Na direita : " + matriz[i][j+1]);

					} else if(i > 0 && j > 0 && (i + 1) < matriz.length && (j + 1) < matriz[i].length) { // No meio
						System.out.println("Em cima : " + matriz[i-1][j]);
						System.out.println("Em baixo : " + matriz[i+1][j]);
						System.out.println("Na esquerda : " + matriz[i][j-1]);
						System.out.println("Na direita : " + matriz[i][j+1]);

					} else if(j > 0 && (i + 1) == matriz[i].length) { 
						System.out.println("Em cima : " + matriz[i-1][j]);
						System.out.println("Na esquerda : " + matriz[i][j-1]);
						System.out.println("Na direita : " + matriz[i][j+1]);

					} else if(i > 0 && (j + 1) == matriz[i].length) { 
						System.out.println("Em cima : " + matriz[i-1][j]);
						System.out.println("Na esquerda : " + matriz[i][j-1]);
						System.out.println("Em baixo: " + matriz[i + 1][j]);

					} else if(j == 0 && i > 0) { 
						System.out.println("Em cima : " + matriz[i-1][j]);
						System.out.println("Na direita : " + matriz[i][j+1]);
						System.out.println("Em baixo: " + matriz[i + 1][j]);

					} else if((i + 1) == matriz.length && j > 0) { 
						System.out.println("Em cima : " + matriz[i-1][j]);
						System.out.println("Na direita : " + matriz[i][j+1]);
						System.out.println("Na esquerda: " + matriz[i][j-1]);

					}
					
				} else {
					contador++;
				}
				
			}
		}
		
		if (contador == (x * y)) {
			System.out.println("Não existe esse número na matriz.");
		}
		
		
		sc.close();
	}

}
