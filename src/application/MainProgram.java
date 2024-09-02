package application;

import java.util.Locale;
import java.util.Scanner;

import entities.OrderItem;
import entities.Product;

public class MainProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//INSTANCIANDO UM Product PARA TESTAR.
		Product p = new Product("Smart TV", 1000.00);
		
		//INSTANCIANDO UM OrderItem PARA TESTAR.
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
		//IMPRIMINDO O PRODUTO PARA TESTAR.
		System.out.println(oi1);
		
		sc.close();
	}

}
