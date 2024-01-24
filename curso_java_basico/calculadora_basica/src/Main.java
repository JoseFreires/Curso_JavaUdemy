import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Deseja começar a calculadora? SIM(S) NÃO(N)");
		char resposta = sc.next().charAt(0);
		
		String operacao;
		double resultado;
		
		if (resposta == 'S' || resposta == 'N') {
			while (resposta == 'S') {
				
				System.out.print("Digite o primeiro número : ");
				double x = sc.nextDouble();
				
				System.out.print("Digite o segundo número : ");
				double y = sc.nextDouble();
				
				System.out.print("Qual operação deseja fazer?(+)(-)(/)(*)");
				operacao = sc.next();
				
					switch (operacao) {
						case "+" :
							resultado = x + y;
							System.out.println("O número " + x + " somando com " + y + " é igual = " + resultado);
							break;
						case "-" :
							resultado = x - y;
							System.out.println("O número " + x + " subtraido por " + y + " é igual = " + resultado);
							break;
						case "*" :
							resultado = x * y;
							System.out.println("O número " + x + " multiplicado por " + y + " é igual = " + resultado);
							break;
						case "/" :
							resultado = x / y;
							System.out.printf("O número " + x + " divido por " + y + " é igual = %.2f%n\"", resultado);
							break;
						default :
							System.out.println("Nenhuma opção foi selecionada");
							
					}
				
				System.out.print("Deseja continuar a calculadora? SIM(S) NÃO(N)");
				resposta = sc.next().charAt(0);
			}
			
			System.out.println("Fim da calculadora");			
		} else {
			System.out.println("Nenhuma resposta válida.");
		}
		
		
		sc.close();
		
	}

}
