
package com.mycompany.ex52;

/**
 *
 * @author igor.j.ferraz
 */
public class Operacao {
    private int codigo;
    private String descricao;
    
    public Operacao(String descricao, int codigo){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descricao: " + descricao + " | Codigo: " + codigo;
    }
    
    
}
