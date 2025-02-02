/*
Nesta aula foi apresentado em um exemplo prático como utilizar as classes abstratas. 
No exemplo a classe abstrata é a 'Shape' e ela é abstrata pois serve para representar as formas geométricas.
 * */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int numberShapes = sc.nextInt();
		
		for(int i = 0; i< numberShapes; i++) {
			System.out.println("Shape #" + (i+1));
			
			System.out.print("Rectangle or Circle? (r/c) ");
			char type = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(type == 'r') {
				System.out.print("Witdh: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				shapes.add(new Rectangle(color, width, height));
				
			} else if(type == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println("");
		System.out.println("Shapes: ");
		for(Shape item : shapes) {
			System.out.println(String.format("%.2f", item.area()));
		}
		
		sc.close();
	}

}
