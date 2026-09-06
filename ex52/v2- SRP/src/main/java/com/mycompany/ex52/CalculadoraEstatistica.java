
package com.mycompany.ex52;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalculadoraEstatistica {
    private List<Operacao> operacoes;
    private Dado adicionarDado = new Dado();
    
    public CalculadoraEstatistica(List<Operacao> operacoes){
        this.operacoes = operacoes;
    }
    
    public void calcularResultados(List<Double> numeros){
        for (Operacao o : operacoes){
            double resultado = o.calcular(numeros);
            adicionarDado.adicionaResultado(o.getCodigo(), resultado);
        }
    }
}
