package br.com.Gerenciador_de_projetos.model;

public class Usuario {
private String nome;
private String email;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Usuario(String nome, String email) {
	this.nome = nome;
	this.email = email;
}
}
