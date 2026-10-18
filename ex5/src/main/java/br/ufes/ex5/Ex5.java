package br.ufes.ex5;

import br.ufes.model.Usuario;
import br.ufes.service.AutenticadorService;

public class Ex5 {
    public static void main(String[] args) {
        AutenticadorService autenticador = new AutenticadorService();
        Usuario usuario = new Usuario("A", "B", "teste");
        
        String senhaDigitada = "teste1";
        
        if(autenticador.autenticar(usuario, senhaDigitada)){
            System.out.println("Correto");
        }
        else{
            System.out.println("Incorreto");
        }
    }
}
