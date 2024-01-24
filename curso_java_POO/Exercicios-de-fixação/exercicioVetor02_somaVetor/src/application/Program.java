/* 

Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 

*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		double soma = 0.0;
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite o número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("Seus dados: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];
		}
		
		double media = soma/vect.length;
		System.out.println();
		System.out.println("SOMA: " + soma);
		System.out.println("MÉDIA: " + media);
		
	
		
		sc.close();

	}

}
