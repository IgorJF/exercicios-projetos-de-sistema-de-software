package br.ufes.model;

//classes model devem ter apenas as informacoes especificas dela, que definem o objeto

public class Candidato {
    private String nome;
    private int num;
    
    public Candidato(String nome, int num){
        this.nome = nome;
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", num=" + num + '}';
    }
}
