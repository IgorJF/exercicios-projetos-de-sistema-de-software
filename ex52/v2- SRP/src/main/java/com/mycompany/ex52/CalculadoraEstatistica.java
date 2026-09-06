
package com.mycompany.ex52;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalculadoraEstatistica {
    private List<Operacao> operacoes;
    private Resultado resultadoOperacoes;
    
    public CalculadoraEstatistica(List<Operacao> operacoes, Resultado resultadoOperacoes){
        this.operacoes = operacoes;
        this.resultadoOperacoes = resultadoOperacoes;
    }
    
    public void calcularResultados(Dado dado){
        Dado adicionarDado = new Dado(dado.getNumeros());
        
        for (Operacao o : operacoes){
            double resultado = o.calcular(adicionarDado.getNumeros());
            this.resultadoOperacoes.adicionaResultado(o.getCodigo(), resultado);
        }
    }
}
