package entities;

public class User {
	
	private String name;
	private String cpf;
	private int registration;
	
	public User () {
		
	}

	public User(String name, String cpf, int registration) {	
		this.name = name;
		this.cpf = cpf;
		this.registration = registration;
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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}
	
	  @Override
	    public String toString() {
	        return "Name: " + name 
	             + ", CPF: " + cpf 
	             + ", Registration: " + registration;
	    }
	
	
	
	

}
