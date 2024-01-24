/*
 * Exercício: Fazer o usuário colocar a largura e altura de um retangulo e dizer qual é sua área, perímetro e diagonal.
 * Também verificar se é um realmente um retângulo
 * */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Digite a altura e largura do retângulo: ");
		
		System.out.print("Largura: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Altura: ");
		rectangle.height = sc.nextDouble();
		
		if(rectangle.width > rectangle.height || rectangle.width < rectangle.height) {
			double result = rectangle.area();
			System.out.println("Área: " + result);
			
			result = rectangle.perimetro();
			System.out.println("Perímetro: " + result);
			
			result = rectangle.diagonal();
			System.out.println("Diagonal: " + result);
			
		} else {
			System.out.println("Isto não é um retângulo!!");
		}
		
		
		sc.close();
		
	}

}
