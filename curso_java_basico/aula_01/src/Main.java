// %f = ponto flutuante
// %d = inteiro
// %s = texto
// %n = quebra de linha


public class Main {

	public static void main(String[] args) {
		
		// System.out.print("Cavalo"); // Print do Java sem pular linha
		double y = 1.754545;
		int x = 5;
		char letra = '\u0052'; // Forma de falar um caractere do teclado
		
		System.out.println(y); // Print Normal
		System.out.printf("%.2f%n", y); // Print com formatação e quebra-linha
		System.out.printf("%.4f", y);  // Print com formatação e sem quebra-linha
		System.out.println("--------------");
		System.out.println(y * x); // Print do Java pulando linha
		System.out.println(letra);
		
		System.out.println("total : " + x);
		System.out.printf("altura : %.2f%n", y);
		
		String nome = "Jose";
		int idade = 25;
		double salario = 1200.50;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, salario);
	}

}
