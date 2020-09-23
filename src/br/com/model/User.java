package br.com.model;

public class User {
       
	private String login;
	private String senha;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public User () {
		
	}
	public User(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", senha=" + senha + "]";
	}
	
	
}
