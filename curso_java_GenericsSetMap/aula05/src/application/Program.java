/* hashCode e equals
	• São operações da classe Object utilizadas para comparar se um objeto é igual a outro
	• equals: lento, resposta 100%
	• hashCode: rápido, porém resposta positiva não é 100%
 */


package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Marcos Oliveira", "marcosOliveira@gmail.com");
		Client client2 = new Client("Manuel Oliveira", "manuelOliveira@gmail.com");
		
		System.out.println(client1.hashCode()); // Gera um código único baseado no objeto, mas pode acabar gerando um falso positivo
		System.out.println(client2.hashCode());
		System.out.println(client1.equals(client2)); // Método que compara se o objeto é igual a outro, retornando true ou false. 
	}

}
