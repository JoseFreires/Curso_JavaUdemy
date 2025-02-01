/*
Map<key, value>

É uma coleção de pares chave / valor
• Não admite repetições do objeto chave
• Os elementos são indexados pelo objeto chave (não possuem posição)
• Acesso, inserção e remoção de elementos são rápidos

Uso comum: cookies, local storage, qualquer modelo chave-valor

Principais implementações: 
• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo 
compareTo do objeto (ou Comparator)
• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados

Obs. Implementações são semelhantes com de Set<>

*/
package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		// Adicionando elementos
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		// Removendo elementos
		cookies.remove("email");
		
		// Por utilizar a mesma key, vai sobrepor a que antes existia.
		cookies.put("phone", "99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // Verifica se possui a key
		System.out.println("Phone number: " + cookies.get("phone")); // Traz as informações do elemento usando a key
		System.out.println("Email: " + cookies.get("email")); // Vai trazer o valor null, pois foi removido o elemento
		System.out.println("Size: " + cookies.size()); // Qnt. de elementos presentes
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) { // Vai passar em cada um dos elementos(obs. utiliza um função especifica neste caso: .keySet() a qual retorna um Set
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
