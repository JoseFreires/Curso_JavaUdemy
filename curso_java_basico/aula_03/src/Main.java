import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		String palavra;
		double fracao;
		char apenasUmaLetra;
		
		x = sc.nextInt();
		fracao = sc.nextDouble();
		palavra = sc.next();
		apenasUmaLetra = sc.next().charAt(0);
		System.out.println("Você digitou este número : " + x);
		System.out.println("Você digitou esta palavra : " + palavra);
		System.out.println("Você digitou esta fração : " + fracao);
		System.out.println("Você digitou esta letra : " + apenasUmaLetra);
		
		sc.close();
	}

}
