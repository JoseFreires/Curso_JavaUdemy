

// Absoluto = tirar o negativo, caso exista.


public class Main {

	public static void main(String[] args) {
		
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		double raizQuadrada, elevado, absoluto;
		
		raizQuadrada = Math.sqrt(x); // Apenas precisa de um valor para dizer a raiz
		elevado = Math.pow(x, y); // Precisa de dois valores : um para ser elevado e outro que eleva
		absoluto = Math.abs(z); // Apenas precisa de um valor
		
		System.out.println(raizQuadrada);
		System.out.println(elevado);
		System.out.println(absoluto);
		
	}

}
