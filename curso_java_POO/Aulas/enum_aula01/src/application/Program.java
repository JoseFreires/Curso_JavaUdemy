/*
	Nesta aula foi introduzido o tema de Enumerações(enum).
	
	O que são Enumerações:
	É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
 
 */

package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1214, new Date(), OrderStatus.SHIPPED);
		
		System.out.println(order);
	}

}
