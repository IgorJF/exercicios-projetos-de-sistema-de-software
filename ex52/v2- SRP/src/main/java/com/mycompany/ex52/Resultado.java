package com.mycompany.ex52;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author igorj
 */
public class Resultado {
    private Map<Integer, Double> resultadosOperacoes;
    
    public Resultado(){
        resultadosOperacoes = new HashMap<>();
    }
    
    public Map<Integer, Double> getResultadosOperacoes() {
        return resultadosOperacoes;
    }
    
    public void adicionaResultado(int operacao, double resultado){
        resultadosOperacoes.put(operacao, resultado);
    }
    
    public double getResultadoEscolhido(int codigo) {
        if(resultadosOperacoes.containsKey(codigo)){
            return resultadosOperacoes.get(codigo);
        }
        return 0;
    }
}
