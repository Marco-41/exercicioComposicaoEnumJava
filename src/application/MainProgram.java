package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class MainProgram {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//INSTANCIANDO UM SimpleDateFormat PARA FORMATAÇÃO DE DATA.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//COLHENDO OS DADOS DO CLIENTE.
		System.out.println("Digite os dados do cliente: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Data de nascimento (dd/MM/yyyy): ");
		Date birtDate = sdf.parse(sc.next());
		
		//INSTANCIANDO UM CLIENTE PARA RECEBER OS DADOS DIGITADOS PELO USUÁRIO E ASSOCIÁ-LOS AO MESMO.
		Client client = new Client(name, email, birtDate);
		
		//COLHENDO OS DADOS DO PEDIDO.
		System.out.println("Digite os dados do pedido: ");
		
		System.out.print("Status do pedido: ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); /*valueOf PARA CONVERTER A STRING RECEBIDA PARA O VALOR CORRESPONDENTE
		DEFINIDO LÁ NO Enum OrderStatus.*/
		
		//INSTANCIANDO UM PEDIDO PARA RECEBER OS DADOS DIGITADOS PELO USUÁRIO E ASSOCIÁ-LOS AO MESMO.
		Order order = new Order(new Date(), status, client);
		
		//COLHENDO OS DADOS DOS ITEMS DO PEDIDO.
		System.out.print("Digite quantos items o pedido vai ter: ");
		int qntdDeItems = sc.nextInt();
		
		//CRIAÇÃO DO LAÇO DE REPETIÇÃO FOR PARA PERCORRER A QUANTIDADE DE ITEMS DO PEDIDO.
		for(int i = 0; i < qntdDeItems; i++) {
			
			System.out.println("Digite os dados do " + (i + 1) + " item: "); // i + 1 POIS O i INICIA-SE EM 0.
			
			System.out.print("Nome do produto: ");
			sc.nextLine(); //PARA ABSORVER A QUEBRA DE LINHA QUE FICOU PENDENTE.
			String productName = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantidade do produto: ");
			int quantity = sc.nextInt();
			
			//INSTANCIANDO UM PRODUTO PARA RECEBER OS DADOS DIGITADOS PELO USUÁRIO E ASSOCIÁ-LOS AO MESMO.
			Product product = new Product(productName, productPrice);
			
			//INSTANCIANDO UM ITEM DE PEDIDO PARA RECEBER OS DADOS DIGITADOS PELO USUÁRIO E ASSOCIÁ-LOS AO PRODUTO.
			OrderItem oit = new OrderItem(quantity, productPrice, product);
			
			//ADICIONANDO O ITEM DO PEDIDO DENTRO DO PEDIDO.
			order.addItem(oit);
		}
		
		//IMPRESSÃO DOS DADOS DO PEDIDO.
		System.out.println();
		System.out.println(order);
				
		sc.close();
	}

}
