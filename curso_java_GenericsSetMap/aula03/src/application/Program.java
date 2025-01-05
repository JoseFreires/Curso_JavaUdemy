/* 
Tema: Introdução ao Curinga
O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga.

Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo";
Porém não é possível adicionar dados a uma coleção de tipo curinga, porque o compilador não
sabe qual é o tipo específico que foi instanciada.

 */

package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
