package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;

public class MainProgram {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//INSTANCIANDO UM SimpleDateFormat PARA FORMATAÇÃO DE DATA.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//INSTANCIANDO UM Product PARA TESTAR.
		Product p = new Product("Smart TV", 1000.00);
		
		//INSTANCIANDO UM OrderItem PARA TESTAR.
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
		//INSTANCIANDO UM Client PARA TESTAR.
		Client c = new Client("Marco Oliveira", "marcooliveira@gmail.com", sdf.parse("19/06/1998"));
		
		//IMPRIMINDO O PRODUTO PARA TESTAR.
		System.out.println(oi1);
		
		//IMPRIMINDO O Client PARA TESTAR.
		System.out.println(c);
		
		sc.close();
	}

}
