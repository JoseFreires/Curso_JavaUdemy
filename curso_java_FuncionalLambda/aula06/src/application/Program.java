/* Tema: Stream
 * 
 * É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
 * Fonte de dados: coleção, array, função de iteração, recurso de E/S
 * 
- Stream é uma solução para processar sequências de dados de forma: • Declarativa (iteração interna: escondida do programador)
	• Parallel-friendly (imutável -> thread safe)
	• Sem efeitos colaterais
	• Sob demanda (lazy evaluation)

- Acesso sequencial (não há índices)
- Single-use: só pode ser "usada" uma vez
- Pipeline: operações em streams retornam novas streams. Então é possível 
 */

package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		// Transformando uma lista em uma Stream
		List<Integer> list = Arrays.asList(1, 3, 5, 7);
		Stream<Integer> st1 = list.stream().map(p -> p * 5); // Possivel utilizar o map para aplicar uma função em cada item da Stream
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Criando diretamente uma Stream 
		Stream<String> st2 = Stream.of("Arthur", "Kaiser", "Joui");
		System.out.println(Arrays.toString(st2.toArray()));
		
		// Criando uma Stream "infinita", pois cria o próximo elemento baseado na função que passou
		Stream<Integer> st3 = Stream.iterate(0, v -> v + 2); 
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		// Realizando a sequencia de Fibonnaci
		Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
		
		

	}

}
