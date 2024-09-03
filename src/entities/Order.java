package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	//DECLARAÇÃO DE ATRIBUTOS.
	private Date moment;
	private OrderStatus status;
	
	//CRIAÇÃO DAS ASSOCIAÇÕES COM AS CLASSES Client E OrderItem. 
	//UM PEDIDO (Order) TEM UM CLIENTE (Client) E VÁRIOS ITEMS (OrderItem).
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	//CRIAÇÃO DO CONSTRUTOR PADRÃO VAZIO.
	public Order() {
		
	}

	//CRIAÇÃO DO CONSTRUTOR COM ARGUMENTOS.
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	//CRIAÇÃO DOS GETTERS E SETTERS.
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) { 
		this.client = client;
	}

	/*
	public List<OrderItem> getItems() { //PARA NÃO PERMITIR O ACESSO TOTAL A LISTA "items". 
		return items;
	}
	*/

	/*
	public void setItems(List<OrderItem> items) { //PARA NÃO PERMITIR QUE UMA NOVA LISTA SEJA ASSOCIADA A LISTA "items".
		this.items = items;
	}
	*/
	
	 //A LISTA SÓ PODERÁ SER ACESSADA E ALTERADA PELOS MÉTODOS ABAIXO.
	
	//CRIAÇÃO DO MÉTODO addItem PARA ADICIONAR ITEM.
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	//CRIAÇÃO DO MÉTODO removeItem PARA REMOVER ITEM.
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	//CRIAÇÃO DO MÉTODO total PARA CALCULAR O VALOR TOTAL DO PEDIDO.
	public double total() {
		double soma = 0.0; //VARIÁVEL SOMA INICIANDO ZERADA.
		for(OrderItem it : items) { //PARA CADA OrderItem it NA MINHA LISTA items O VALOR SERÁ ACUMULADO NA SOMA.
			soma += it.subTotal(); //REAPROVEITANDO O MÉTODO DE CÁLCULO DO subTotal() QUE ESTÁ NA CLASSE OrderItem.
		}
		
		return soma;
	}
}
