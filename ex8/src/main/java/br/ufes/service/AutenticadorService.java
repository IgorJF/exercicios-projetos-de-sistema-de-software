package br.ufes.service;

import br.ufes.strategy.ITipoAutenticacao;
import br.ufes.strategy.IUsuario;

public class AutenticadorService {
    private ITipoAutenticacao autenticacao;

    public AutenticadorService(ITipoAutenticacao autenticacao) {
        setAutenticacao(this.autenticacao = autenticacao);
    }
 
    public void autenticar(IUsuario usuario) {
        if(autenticacao != null){
            autenticacao.autenticarUsuario(usuario);
            usuario.setAutenticado(true);
        } else {
            throw new IllegalArgumentException("Tipo de autenticação desconhecido");
        }
    }

    public void setAutenticacao(ITipoAutenticacao autenticacao) {
        this.autenticacao = autenticacao;
    }
}
