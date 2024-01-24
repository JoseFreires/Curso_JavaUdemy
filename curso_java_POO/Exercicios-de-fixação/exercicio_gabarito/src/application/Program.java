/* 
 * Exercício: O usuário responde 1 para cada questão que acertou da prova e 0 para cada questão que errou.
 * No final mostra quantas acertou e se tem chance de passar. O minímo de acertos para passar são 40.
 * 
 * */


package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[55];
		int qntAcertos = 0;
		
		for(int i = 1; i < vect.length; i++) {
			System.out.println("Questão " + i );
			vect[i] = sc.nextInt();
			
		}
		for(int j = 0; j < vect.length; j++) {
			if(vect[j] == 1) {
				qntAcertos = qntAcertos + 1;
			}
			
		}
		if(qntAcertos > 40) {
			System.out.print("Você passou!!!!");
		} else {
			System.out.println("É o fim...");
			System.out.printf("Acertos: " + qntAcertos);
		}
		
		sc.close();
	}

}
