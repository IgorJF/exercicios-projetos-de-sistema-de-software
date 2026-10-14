package br.ufes.service;

import br.ufes.model.Eleitor;

public class AutenticarEleitorService {  
    public boolean autenticarEleitor(String cpf, String senha, Eleitor eleitor){
        return cpf.equals(eleitor.getCpf()) && eleitor.autenticarSenha(senha);
    }
}
