package br.ufes.strategy;

public class AutenticacaoLogin implements ITipoAutenticacao {
    @Override
    public void autenticarUsuario(IUsuario usuario) {
        System.out.println("Autenticando por login normal");
    }
}
