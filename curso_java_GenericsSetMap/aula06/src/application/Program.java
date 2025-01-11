/* 
SET<T>
Representa um conjunto de elementos (similar ao da Álgebra)
• Não admite repetições
• Elementos não possuem posição
• Acesso, inserção e remoção de elementos são rápidos
• Oferece operações eficientes de conjunto: interseção, união, diferença.

*/

package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> exampleHashSet = new HashSet<>(); // mais rápido (operações O(1) em tabela hash) e não ordenado
		Set<String> exampleTreeSet = new TreeSet<>(); // mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
		Set<String> exampleLinkedHashSet = new LinkedHashSet<>(); // velocidade intermediária e elementos na ordem em que são adicionados
		
		exampleHashSet.add("Notebook");
		exampleHashSet.add("TV");
		exampleHashSet.add("Tablet");
		
		exampleTreeSet.add("TV");
		exampleTreeSet.add("Notebook");
		exampleTreeSet.add("Tablet"); 
		
		exampleLinkedHashSet.add("TV");
		exampleLinkedHashSet.add("Notebook");
		exampleLinkedHashSet.add("Tablet"); 
		
		System.out.println(exampleHashSet.contains("Notebook"));// Verificar se contém um especifico objeto e retorna um boolean
		exampleTreeSet.remove("TV"); // Remove um objeto
		exampleHashSet.removeIf(x -> x.length() <= 3); // Remove um objeto depedendo da condição
		
		System.out.println();
		System.out.println("Sequência em ordem própria de itens: ");
		for (String x : exampleHashSet) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Sequência em ordem alfabética: ");
		
		for (String x : exampleTreeSet) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Sequência em ordem da adição de itens: ");
		
		for (String x : exampleLinkedHashSet) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Tamanho de exampleTreeSet: " + exampleTreeSet.size());

	}

}
