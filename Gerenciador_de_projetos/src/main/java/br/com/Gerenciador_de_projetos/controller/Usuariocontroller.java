package br.com.Gerenciador_de_projetos.controller;

import java.util.ArrayList;

import br.com.Gerenciador_de_projetos.model.Usuario;

public class Usuariocontroller {
ArrayList <Usuario> usuarios;
public void CadastrarUsuario(String nome, String email) {
	Usuario usuarioNovo = new Usuario (nome, email);
	usuarios.add(usuarioNovo);
	}
}
