package entities;

public class Department {

	private String name;
	
	//1º Criando construtor vazio
	public Department() {
	}
	//2º Criando construtores com argumentos
	public Department(String name) {
		this.name = name;
	}
	//3º Criando os getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
