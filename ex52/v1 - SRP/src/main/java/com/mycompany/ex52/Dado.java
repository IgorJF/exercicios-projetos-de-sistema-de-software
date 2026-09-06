
package com.mycompany.ex52;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author igor.j.ferraz
 */
public class Dado {
    private List<Double> numeros;
    private Map<Integer, Double> resultadosOperacoes;

    public Dado(List<Double> numeros) {
        this.numeros = numeros;
        resultadosOperacoes = new HashMap<>();
    }
    
    public List<Double> getNumeros(){
        return numeros;
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
