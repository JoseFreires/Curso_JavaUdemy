import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		
		//	              |   condição   |    true     |    false   |
		double desconto = (preco < 20.0) ? preco * 1.0 : preco * 0.5;
		
		System.out.println(desconto);
		
		
		
		sc.close();
		
	}

}
