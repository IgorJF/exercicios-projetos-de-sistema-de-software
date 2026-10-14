package br.ufes.ex8;

import br.ufes.service.AutenticadorService;
import br.ufes.strategy.AutenticacaoFacebook;
import br.ufes.strategy.AutenticacaoGoogle;
import br.ufes.strategy.AutenticacaoLogin;
import br.ufes.strategy.ITipoAutenticacao;
import br.ufes.strategy.IUsuario;
import br.ufes.strategy.Usuario;

public class Ex8 {
    public static void main(String[] args) {
        IUsuario usuario = new Usuario();
        ITipoAutenticacao autenticacaoLogin = new AutenticacaoLogin();
        ITipoAutenticacao autenticacaoFacebook = new AutenticacaoFacebook();
        ITipoAutenticacao autenticacaoGoogle = new AutenticacaoGoogle();
        
        System.out.println(usuario);
        
        AutenticadorService autenticador = new AutenticadorService(autenticacaoLogin);
        autenticador.autenticar(usuario);
        System.out.println(usuario);
        
        autenticador.setAutenticacao(autenticacaoGoogle);
        autenticador.autenticar(usuario);
        System.out.println(usuario);
        
        autenticador.setAutenticacao(autenticacaoFacebook);
        autenticador.autenticar(usuario);
        System.out.println(usuario);
    }
}
