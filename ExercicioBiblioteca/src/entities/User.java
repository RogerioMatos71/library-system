package entities;

public class User {
	
	private String name;
	private final String cpf;
	private int id;
	
	

	public User(String name, final String cpf, int id) {	
		this.name = name;
		this.cpf = cpf;
		this.id = id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}


	public int getId() {
		return id;
	}

	
	
	  @Override
	    public String toString() {
	        return "Name: " + name 
	             + ", CPF: " + cpf 
	             + ", ID: " + id;
	    }

	
	
	
	
	

}
