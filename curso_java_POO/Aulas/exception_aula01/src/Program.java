/* Nesta aula foi apresentado o que são exceptions  e os blocos try-catch
 * 
 * O que são exceptions:
	Uma exceção é qualquer condição de erro ou comportamento 
	inesperado encontrado por um programa em execução.
 * 
*/

import java.util.InputMismatchException;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		sc.close();
	}
}
