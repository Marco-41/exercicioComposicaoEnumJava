package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	//INSTANCIANDO UM SimpleDateFormat PARA FORMATAÇÃO DE DATA.
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	//DECLARAÇÃO DOS ATRIBUTOS.
	private String name;
	private String email;
	private Date birthDate;
	
	//CRIAÇÃO DO CONSTRUTOR PADRÃO VAZIO.
	public Client() {
		
	}

	//CRIAÇÃO DO CONSTRUTOR COM ARGUMENTOS.
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	//CRIAÇÃO DOS GETTERS E SETTERS.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	//CRIAÇÃO DO MÉTODO toString PARA IMPRESSÃO DOS DADOS.
	@Override
	public String toString() {
		return name + "\n" +
			   "Data de nascimento: " + "(" + sdf.format(birthDate) + ")" + "\n" +
			   "Email: " + email;
	}
	
}
