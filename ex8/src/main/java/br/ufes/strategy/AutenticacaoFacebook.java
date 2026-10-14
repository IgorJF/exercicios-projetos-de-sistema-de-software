
package br.ufes.strategy;

public class AutenticacaoFacebook implements ITipoAutenticacao {
    @Override
    public void autenticarUsuario(IUsuario usuario) {
        System.out.println("Autenticando por Facebook");
    }
}
