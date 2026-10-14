package br.ufes.model;

public class Eleitor {
    private String nome;
    private String cpf;
    private String senha;
    
    public Eleitor(String nome, String cpf, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public boolean autenticarSenha(String senha){
        return this.senha.equals(senha);
    }

    @Override
    public String toString() {
        return "Eleitor{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
}
