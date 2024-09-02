package entities;

public class OrderItem {

	//DECLARAÇÃO DE ATRIBUTOS.
	private Integer quantity;
	private Double price;
	
	//CRIAÇÃO DA COMPOSIÇÃO ENTRE UM OBJETO E OUTRO (OrderItem CONTÉM UMA REFERÊNCIA A UM PRODUTO).
	private Product product; 
	
	//CRIAÇÃO DO CONSTRUTOR PADRÃO VAZIO.
	public OrderItem() {
		
	}

	//CRIAÇÃO DO CONSTRUTOR COM ARGUMENTOS.
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	//CRIAÇÃO DOS GETTERS E SETTERS,
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
