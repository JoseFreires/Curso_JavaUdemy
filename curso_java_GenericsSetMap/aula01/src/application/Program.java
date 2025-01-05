/* 
Generics permitem que classes, interfaces e métodos possam ser 
parametrizados por tipo. Seus benefícios são:
• Reuso
• Type safety
• Performance

USO COMUM: coleções

EXEMPLO: Deseja-se fazer um programa que leia uma quantidade N, e depois N números
inteiros. Ao final, imprima esses números de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado

Explicação:
Criamos um Generic para conseguir adaptar o código para diferentes variaveis
Neste exemplo podemos trocar apenas um detalhe na parte de chamar a classe para aceitar um 
novo tipo de variavel

*/


package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.print(ps.first());
		
		sc.close();

	}

}
