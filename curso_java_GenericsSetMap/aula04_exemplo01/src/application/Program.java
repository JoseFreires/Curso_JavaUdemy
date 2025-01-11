/* 

Um exemplo mostrando como utilizar o tipo Curinga para diferentes tipo de lista de Objetos

*/
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shapes;

public class Program {

	public static void main(String[] args) {
		List<Shapes> listShapes = new ArrayList<>();
		listShapes.add(new Rectangle(2, 30));
		listShapes.add(new Circle(5.0));
		
		System.out.println("Total areas: " + totalArea(listShapes));
		
		List<Shapes> listCircles = new ArrayList<>();
		 listCircles.add(new Circle(2.0));
		 listCircles.add(new Circle(2.0));
		
		System.out.println("Total areas: " + totalArea(listCircles));

	}
	
	public static double totalArea(List<? extends Shapes> list) {
		double sum = 0.0;
		for(Shapes shape : list) {
			sum += shape.area();
		}
		return sum;
	}

}
