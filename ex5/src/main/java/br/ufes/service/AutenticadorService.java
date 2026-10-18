package br.ufes.service;

import br.ufes.model.Usuario;

public class AutenticadorService {
    public boolean autenticar(Usuario usuario, String senha){
        return senha.equals(usuario.getSenha());
    }
}
