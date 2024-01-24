import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("Menor que 0");
		} else if (x > 5){
				System.out.println("Maior que 5");
			} else {
				System.out.println("Menor que 5");
			}
		
		
		sc.close();
		
	}

}
