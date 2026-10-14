package br.ufes.strategy;

public class AutenticacaoGoogle implements ITipoAutenticacao {
    @Override
    public void autenticarUsuario(IUsuario usuario) {
        System.out.println("Autenticando por Google");
    } 
}
