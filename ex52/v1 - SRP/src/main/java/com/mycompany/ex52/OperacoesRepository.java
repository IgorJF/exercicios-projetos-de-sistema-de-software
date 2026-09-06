
package com.mycompany.ex52;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class OperacoesRepository {
    private List<Operacao> operacoesEstatisticas;
    
    public OperacoesRepository(){
        operacoesEstatisticas = new ArrayList<>();
        operacoesEstatisticas.add(new Operacao("MEDIA", 0));
        operacoesEstatisticas.add(new Operacao("SOMATORIO", 1));
        operacoesEstatisticas.add(new Operacao("MAIOR", 2));
        operacoesEstatisticas.add(new Operacao("MENOR", 3));
        operacoesEstatisticas.add(new Operacao("VARIANCIA", 4));
        operacoesEstatisticas.add(new Operacao("DESVIOPADRAO", 5));
    }
    
    public void adicionaOperacao(Operacao operacao){
        operacoesEstatisticas.add(operacao);
    }
    
    public List<Operacao> getOperacoes(){
        return operacoesEstatisticas;
    }
}
