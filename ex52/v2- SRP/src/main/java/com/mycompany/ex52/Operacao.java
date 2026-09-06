package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public abstract class Operacao {
    private String nome;
    private int codigo;
    
     public Operacao(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public abstract double calcular(List<Double> numeros);

    public String getNome(){ 
        return nome; 
    }
    public int getCodigo(){ 
        return codigo; 
    }
}
